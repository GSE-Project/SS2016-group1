package gse1.buergerbusserver.linemanagement.service.impl.rest;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

import javax.inject.Inject;
import javax.inject.Named;
import javax.ws.rs.BadRequestException;
import javax.ws.rs.NotFoundException;
import javax.ws.rs.core.Response;

import gse1.buergerbusserver.linemanagement.logic.api.Linemanagement;
import gse1.buergerbusserver.linemanagement.logic.api.to.CustomStopEto;
import gse1.buergerbusserver.linemanagement.logic.api.to.LastPositionEto;
import gse1.buergerbusserver.linemanagement.service.api.rest.LinemanagementRestService;

/**
 * @author Jay
 *
 */
@Named("LinemanagementRestService")
public class LinemanagementRestServiceImpl implements LinemanagementRestService {
  @Inject
  private Linemanagement linemanagement;

  // @Override
  // public List<LineEto> getAllLines() {
  //
  // try {
  // return this.linemanagement.getAllLines();
  // } catch (Exception e) {
  // System.out.println("Exception:" + e.getMessage());
  // e.printStackTrace();
  // return null;
  // }
  // }

  @Override
  public HashMap<String, Object> getAllBuses() {

    try {
      return this.linemanagement.getAllBusesListWithTimeStamp();

    } catch (Exception e) {
      System.out.println("Exception:" + e.getMessage());
      e.printStackTrace();
      return null;
    }
  }

  // @Override
  // public List<BusEto> getBusesOnLine(String lineId) {
  //
  // long lineIdLong;
  // if (lineId == null) {
  // throw new BadRequestException("missing line id");
  // }
  // try {
  // lineIdLong = Long.parseLong(lineId);
  // } catch (NumberFormatException e) {
  // throw new BadRequestException("Line id is not a number");
  // } catch (NotFoundException e) {
  // throw new BadRequestException("Line not found");
  // }
  // List<BusEto> lineBuses = this.linemanagement.getBusesOnLine(lineIdLong);
  // return lineBuses;
  // }

  @Override
  public HashMap<String, Object> getAllRoutes() {

    return this.linemanagement.getAllRoutes();
  }

  @Override
  public HashMap<String, Object> getAllLinesWithBusIds() {

    return this.linemanagement.getAllLinesWithBusIds();
  }

  @Override
  public Response updateBusStatus(HashMap<String, Long> jsonRequest) {

    Long busId = jsonRequest.get("busId");
    Long lineId = jsonRequest.get("lineId");

    try {

      this.linemanagement.updateBusStatus(busId, lineId);
      return Response.status(200).build();

    } catch (Exception e) {
      e.printStackTrace();
      return Response.status(500).build();
    }

  }

  @Override
  public HashMap<String, Date> lastUpdate() {

    return this.linemanagement.checkUpdate();
  }

  @Override
  public LastPositionEto getLastPosition(String busId) {

    Long busIdW;
    if (busId == null) {
      throw new BadRequestException("Missing bus id.");
    }
    try {
      busIdW = Long.parseLong(busId);
    } catch (NumberFormatException e) {
      throw new BadRequestException("Bus id is not a number");
    } catch (NotFoundException e) {
      throw new BadRequestException("Bus id not found");
    }
    LastPositionEto lastPosition = this.linemanagement.getLastPosition(busIdW);
    return lastPosition;
  }

  @Override
  public Response setLastPosition(HashMap<String, Object> jsonRequest) {

    Long busId;
    Double lon, lat;
    busId = Long.valueOf(jsonRequest.get("busId").toString());

    HashMap<?, ?> obj = (HashMap<?, ?>) jsonRequest.get("position");
    ArrayList<?> coordinates = (ArrayList<?>) obj.get("coordinates");
    lon = (Double) coordinates.get(0);
    lat = (Double) coordinates.get(1);
    try {

      this.linemanagement.setLastPosition(busId, lon, lat);
      return Response.status(200).build();

    } catch (Exception e) {
      e.printStackTrace();
      return Response.status(500).build();
    }

  }

  @Override
  public CustomStopEto getCustomStopStatus(Long requestId) {

    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public CustomStopEto getCustomStopDevice(Long deviceId) {

    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public CustomStopEto getCustomStopLine(Long lineId) {

    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public CustomStopEto getCustomStopRequests(int status) {

    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Response updateCustomStopStatus(HashMap<String, Object> jsonRequest) {

    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Long newCustomStop(HashMap<String, Object> jsonRequest) {

    // TODO Auto-generated method stub
    return null;
  }

}
