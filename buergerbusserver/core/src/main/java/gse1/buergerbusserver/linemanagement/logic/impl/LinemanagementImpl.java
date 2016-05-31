package gse1.buergerbusserver.linemanagement.logic.impl;

import gse1.buergerbusserver.general.logic.base.AbstractComponentFacade;
import gse1.buergerbusserver.linemanagement.dataaccess.api.BusEntity;
import gse1.buergerbusserver.linemanagement.dataaccess.api.dao.BusDao;
import gse1.buergerbusserver.linemanagement.dataaccess.api.dao.LineDao;
import gse1.buergerbusserver.linemanagement.dataaccess.api.dao.RouteDao;
import gse1.buergerbusserver.linemanagement.logic.api.Linemanagement;
import gse1.buergerbusserver.linemanagement.logic.api.to.BusEto;
import gse1.buergerbusserver.linemanagement.logic.api.to.LineEto;
import gse1.buergerbusserver.linemanagement.logic.api.to.LineWithBusIdsCto;
import gse1.buergerbusserver.linemanagement.logic.api.to.RouteEto;
import gse1.buergerbusserver.schedulemanagement.dataaccess.api.dao.StopDao;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;
import javax.transaction.Transactional;

import org.springframework.stereotype.Component;

/**
 * @author razadfki
 *
 */
@Named
@Component
@Transactional
public class LinemanagementImpl extends AbstractComponentFacade implements Linemanagement {

  @Inject
  private LineDao lineDao;

  @Inject
  private BusDao busDao;

  @Inject
  private RouteDao routeDao;

  @Inject
  private StopDao stopDao;

  @Override
  public List<LineEto> getAllLines() {

    try {
      return getBeanMapper().mapList(this.lineDao.findAll(), LineEto.class);
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
      return getBeanMapper().mapList(this.busDao.findAll(), BusEto.class);
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

  @Override
  public List<RouteEto> getAllRoutes() {

    return getBeanMapper().mapList(this.routeDao.findAll(), RouteEto.class);
  }

  @Override
  public List<LineWithBusIdsCto> getAllLinesWithBusIds() {

    List<LineWithBusIdsCto> lineCtoList = getBeanMapper().mapList(this.lineDao.findAll(), LineWithBusIdsCto.class);

    for (LineWithBusIdsCto lineCto : lineCtoList) {
      List<BusEntity> buses = this.busDao.getBusesOnLine(lineCto.getId());
      lineCto.setBuses(getBeanMapper().mapList(buses, BusEto.class));
    }
    return lineCtoList;
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

    HashMap<String, Date> updates= new HashMap<>();
    updates.put("busses",this.busDao.lastUpdate());
    updates.put("lines",this.lineDao.lastUpdate());
    updates.put("routes",this.routeDao.lastUpdate());
    updates.put("stops",this.stopDao.lastUpdate());
    return updates;
  }

  @Override
  public HashMap<String, Object> getAllBusesListWithTimeStamp() {

      HashMap<String, Object>  returnHM = new HashMap<String, Object>();

      returnHM.put("busses", this.getAllBuses());
      returnHM.put("timeStamp", this.busDao.lastUpdate());
      return returnHM;
  }


}
