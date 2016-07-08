package gse1.buergerbusserver.linemanagement.common.api;

import java.util.Date;

import org.geojson.Point;

import gse1.buergerbusserver.general.common.api.ApplicationEntity;

/**
 * This is the interface for Custom Stop of the Bus. It provides information regarding the BusId, LineId, PickUpTime,
 * NumberOfPersons, DevieId, UserName, UserAddress, UserAssistance, status, Latitude and Longitude of Custom Stop and
 * the object carries a timeStamp.
 *
 * @author ricarda42
 *
 */
public interface CustomStop extends ApplicationEntity {

  /**
   * @param lineId
   */
  void setLineId(Long lineId);

  /**
   * @return id of the line requested
   */
  Long getLineId();

  /**
   * @param pickUpTime
   */
  void setPickUpTime(Date pickUpTime);

  /**
   * @return time the customer wants to be picked up
   */
  Date getPickUpTime();

  /**
   * @param stopLocation set GPS coordinates
   */
  void setStopLocation(Point stopLocation);

  /**
   * @return location
   */
  Point getStopLocation();

  /**
   * @param numberOfPersons
   */
  void setNumberOfPersons(int numberOfPersons);

  /**
   * @return number of persons
   */
  int getNumberOfPersons();

  /**
   * @param deviceId
   */
  void setDeviceId(String deviceId);

  /**
   * @return Id of the device which sent the request
   */
  String getDeviceId();

  /**
   * @param userInfo set user info: name, address and assistance
   */
  void setUserInfo(String userInfo);

  /**
   * @return user info
   */
  String getUserInfo();

  /**
   * @param status
   */
  void setStatus(int status);

  /**
   * @return status of request encoded in numbers
   */
  int getStatus();

  /**
   * @param busId
   */
  void setAcceptingBus(Long busId);

  /**
   * @return Id of bus serving this request
   */
  Long getAcceptingBus();

  /**
   * @param rejectingBus
   */
  void setRejectingBus(String rejectingBus);

  /**
   * @return Id of bus serving this request
   */
  String getRejectingBus();

  /**
   * @param timeStamp
   */
  void setTimeStamp(Date timeStamp);

  /**
   * @return TimeStamp of data
   */
  Date getTimeStamp();

}
