package gse1.buergerbusserver.linemanagement.service.impl.rest;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;
import javax.ws.rs.BadRequestException;
import javax.ws.rs.NotFoundException;
import javax.ws.rs.core.Response;

import org.springframework.util.StringUtils;

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

    int takenSeats = Integer.parseInt(jsonRequest.get("takenSeats").toString());

    HashMap<?, ?> obj = (HashMap<?, ?>) jsonRequest.get("position");
    ArrayList<?> coordinates = (ArrayList<?>) obj.get("coordinates");
    lon = (Double) coordinates.get(0);
    lat = (Double) coordinates.get(1);
    try {

      this.linemanagement.setLastPosition(busId, lon, lat, takenSeats);
      return Response.status(200).build();

    } catch (Exception e) {
      e.printStackTrace();
      return Response.status(500).build();
    }

  }

  @Override
  public List<CustomStopEto> getCustomStopRequests(int status) {

    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Response updateCustomStop(long customStopId, HashMap<String, Long> jsonRequest) {

    long temp = Long.valueOf(jsonRequest.get("status"));
    int status = (int) temp;

    try {

      this.linemanagement.updateCustomStopStatus(customStopId, status);
      return Response.status(200).build();

    } catch (Exception e) {
      e.printStackTrace();
      return Response.status(500).build();
    }
  }

  @Override
  public CustomStopEto newCustomStop(HashMap<String, Object> jsonRequest) {

    Date date = new Date();
    Date currTimeStamp = new Timestamp(date.getTime());

    Date pickUpTime;
    try {
      pickUpTime = new java.util.Date(Long.parseLong(jsonRequest.get("pickUpTime").toString()) * 1000);

    } catch (NumberFormatException e1) {
      e1.printStackTrace();
      pickUpTime = null;
    }

    Double lon, lat;
    HashMap<?, ?> obj = (HashMap<?, ?>) jsonRequest.get("location");
    @SuppressWarnings("unchecked")
    ArrayList<Double> coordinates = (ArrayList<Double>) obj.get("coordinates");
    lon = (double) coordinates.get(0);
    lat = (double) coordinates.get(1);

    HashMap<?, ?> info = (HashMap<?, ?>) jsonRequest.get("info");
    String custName = (String) info.get("name");
    String custAddress = (String) info.get("address");
    @SuppressWarnings("unchecked")
    ArrayList<Integer> userAss = (ArrayList<Integer>) info.get("assistance");
    List<Integer> ua = new ArrayList<Integer>();
    for (Integer userAssistance : userAss)
      ua.add(userAssistance);

    String custAssistance = StringUtils.collectionToDelimitedString(ua, ",");

    CustomStopEto customStop = new CustomStopEto();

    customStop.setLineId(Long.valueOf(jsonRequest.get("lineId").toString()));
    customStop.setLon(lon);
    customStop.setLat(lat);
    customStop.setNumberOfPersons(Integer.valueOf(jsonRequest.get("numberOfPersons").toString()));
    customStop.setDeviceId(jsonRequest.get("deviceID").toString());// changed in rescue mission
    customStop.setUserName(custName);
    customStop.setUserAddress(custAddress);
    customStop.setUserAssistance(custAssistance);
    customStop.setPickUpTime(pickUpTime);
    customStop.setStatus(1); // Status set to "pending" initially
    customStop.setTimeStamp(currTimeStamp);

    try {
      CustomStopEto theRequest = this.linemanagement.newCustomStop(customStop);
      // return Response.status(200).build();
      return theRequest;
    } catch (Exception e) {
      e.printStackTrace();
      // return Response.status(500).build();
      return null;
    }
  }

  @Override
  public List<CustomStopEto> getCustomStops(Long requestId, String deviceId, Long lineId) {

    if (requestId != null && deviceId != null && !deviceId.isEmpty())
      return this.linemanagement.getCustomStopStatus(requestId, deviceId);
    if (deviceId != null && !deviceId.isEmpty())
      return this.linemanagement.getCustomStopDevice(deviceId);
    if (lineId != null)
      return this.linemanagement.getCustomStopLine(lineId);

    return null;

  }

}
