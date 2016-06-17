package gse1.buergerbusserver.linemanagement.logic.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;
import javax.transaction.Transactional;

import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import gse1.buergerbusserver.general.logic.base.AbstractComponentFacade;
import gse1.buergerbusserver.linemanagement.dataaccess.api.BusEntity;
import gse1.buergerbusserver.linemanagement.dataaccess.api.CustomStopEntity;
import gse1.buergerbusserver.linemanagement.dataaccess.api.LastPositionEntity;
import gse1.buergerbusserver.linemanagement.dataaccess.api.LineEntity;
import gse1.buergerbusserver.linemanagement.dataaccess.api.dao.BusDao;
import gse1.buergerbusserver.linemanagement.dataaccess.api.dao.CustomStopDao;
import gse1.buergerbusserver.linemanagement.dataaccess.api.dao.LastPositionDao;
import gse1.buergerbusserver.linemanagement.dataaccess.api.dao.LineDao;
import gse1.buergerbusserver.linemanagement.dataaccess.api.dao.RouteDao;
import gse1.buergerbusserver.linemanagement.logic.api.Linemanagement;
import gse1.buergerbusserver.linemanagement.logic.api.to.BusEto;
import gse1.buergerbusserver.linemanagement.logic.api.to.CustomStopEto;
import gse1.buergerbusserver.linemanagement.logic.api.to.LastPositionEto;
import gse1.buergerbusserver.linemanagement.logic.api.to.LineEto;
import gse1.buergerbusserver.linemanagement.logic.api.to.LineWithBusIdsCto;
import gse1.buergerbusserver.linemanagement.logic.api.to.RouteEto;
import gse1.buergerbusserver.schedulemanagement.dataaccess.api.dao.StopDao;

/**
 * @author JAYU
 *
 */
@Named
@Component
@Transactional
public class LinemanagementImpl extends AbstractComponentFacade implements Linemanagement {

  @Inject
  private CustomStopDao CustomStopDao;

  @Inject
  private LineDao lineDao;

  @Inject
  private BusDao busDao;

  @Inject
  private RouteDao routeDao;

  @Inject
  private StopDao stopDao;

  @Inject
  private LastPositionDao lastPositionDao;

  @Override
  public List<LineEto> getAllLines() {

    try {

      List<LineEntity> lines = this.lineDao.findAll();
      return getBeanMapper().mapList(lines, LineEto.class);
    } catch (Exception e) {
      System.out.println("Error: " + e.getMessage());
      e.printStackTrace();
      return null;
    }

  }

  @Override
  public List<BusEto> getAllBuses() {

    // List<BusEntity> buses = this.busDao.findAll();
    // return getBeanMapper().mapList(buses, BusEto.class);
    try {
      List<BusEntity> buses = this.busDao.findAll();
      return getBeanMapper().mapList(buses, BusEto.class);
    } catch (Exception e) {
      System.out.println("Error: " + e.getMessage());
      e.printStackTrace();
      return null;
    }
  }

  @Override
  public List<BusEto> getBusesOnLine(Long lineId) {

    List<BusEntity> buses = this.busDao.getBusesOnLine(lineId);
    return getBeanMapper().mapList(buses, BusEto.class);
  }

  @SuppressWarnings("unused")
  @Override
  public HashMap<String, Object> getAllRoutes() {

    HashMap<String, Object> returnHM = new HashMap<String, Object>();
    List<RouteEto> routeEtoList = getBeanMapper().mapList(this.routeDao.findAll(), RouteEto.class);
    returnHM.put("routes", routeEtoList);
    returnHM.put("timeStamp", this.routeDao.lastUpdate());

    return returnHM;
  }

  @SuppressWarnings("unused")
  @Override
  public HashMap<String, Object> getAllLinesWithBusIds() {

    HashMap<String, Object> returnHM = new HashMap<String, Object>();
    List<LineWithBusIdsCto> lineCtoList = getBeanMapper().mapList(this.lineDao.findAll(), LineWithBusIdsCto.class);

    for (LineWithBusIdsCto lineCto : lineCtoList) {
      List<BusEntity> buses = this.busDao.getBusesOnLine(lineCto.getId());
      lineCto.setBuses(getBeanMapper().mapList(buses, BusEto.class));
    }

    returnHM.put("lines", lineCtoList);
    returnHM.put("timeStamp", this.lineDao.lastUpdate());

    return returnHM;
  }

  @Override
  public void updateBusStatus(Long busId, Long lineId) {

    try {
      this.busDao.updateBusStatus(busId, lineId);
    } catch (Exception e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }

  }

  @Override
  public HashMap<String, Date> checkUpdate() {

    HashMap<String, Date> updates = new HashMap<>();
    updates.put("busses", this.busDao.lastUpdate());
    updates.put("lines", this.lineDao.lastUpdate());
    updates.put("routes", this.routeDao.lastUpdate());
    updates.put("stops", this.stopDao.lastUpdate());
    return updates;
  }

  @SuppressWarnings("unused")
  @Override
  public HashMap<String, Object> getAllBusesListWithTimeStamp() {

    HashMap<String, Object> returnHM = new HashMap<String, Object>();

    returnHM.put("busses", getAllBuses());
    returnHM.put("timeStamp", this.busDao.lastUpdate());
    return returnHM;
  }

  @Override
  public LastPositionEto getLastPosition(Long busId) {

    try {
      LastPositionEntity lastPosition = this.lastPositionDao.getLastPosition(busId);
      return getBeanMapper().map(lastPosition, LastPositionEto.class);
    } catch (Exception e) {
      e.printStackTrace();
      return null;
    }
  }

  @Override
  public void setLastPosition(Long busId, double lon, double lat) {

    try {
      this.lastPositionDao.setLastPosition(busId, lon, lat);
    } catch (Exception e) {
      e.printStackTrace();
    }

  }

  @Override
  public List<CustomStopEntity> getCustomStopStatus(Long requestId, String deviceId) {

    try {
      this.CustomStopDao.getCustomStopStatus(requestId, deviceId);
    } catch (Exception e) {
      e.printStackTrace();
    }
    return null;
  }

  @Override

  public List<CustomStopEto> getCustomStopDevice(String deviceId) {

    List<CustomStopEntity> buses = this.CustomStopDao.getCustomStopDevice(deviceId);
    return getBeanMapper().mapList(buses, CustomStopEto.class);
  }

  @Override
  public List<CustomStopEto> getCustomStopLine(Long lineId) {

    List<CustomStopEntity> buses = this.CustomStopDao.getCustomStopLine(lineId);
    return getBeanMapper().mapList(buses, CustomStopEto.class);
  }

  @Override
  public List<CustomStopEntity> getCustomStopRequests(int status) {

    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public void updateCustomStopStatus(Long requestId, int status) {

    try {
      this.CustomStopDao.updateCustomStopStatus(requestId, status);
    } catch (Exception e) {
      e.printStackTrace();
    }

  }

  @Override
  public List<CustomStopEntity> newCustomStop(Long lineId, Date pickUpTime, double lat, double lon, int numberOfPersons,
      String deviceId, String userName, String userAddress, List<Integer> userAssistance) {

    // TODO Auto-generated method stub
    String userAssist = StringUtils.collectionToDelimitedString(userAssistance, ",");

    List<String> stringList = Arrays.asList(userAssist.split(","));
    List<Integer> returnList = new ArrayList<>();
    for (String num : stringList) {
      returnList.add(Integer.valueOf(num));
    }

    return null;
  }

}
