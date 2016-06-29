package gse1.buergerbusserver.linemanagement.common.api;

import java.util.Date;

import gse1.buergerbusserver.general.common.api.ApplicationEntity;

/**
 * This is the interface for Custop Stop of the Bus. It provides information regarding the BusId, LineId, PickUpTime,
 * NumberOfPersons, DevieId, UserName, UserAddress, UserAssistance, status, Latitude and Longitude of Custom Stop and
 * the object carries a timestamp.
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
   * @param lon
   */
  void setLon(double lon);

  /**
   * @return longitude of position
   */
  double getLon();

  /**
   * @param lat
   */
  void setLat(double lat);

  /**
   * @return latitude of position
   */
  double getLat();

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
   * @param userName
   */
  void setUserName(String userName);

  /**
   * @return Name of the customer
   */
  String getUserName();

  /**
   * @param userAddress
   */
  void setUserAddress(String userAddress);

  /**
   * @return address where the customer wants to be picked up
   */
  String getUserAddress();

  /**
   * @param userAssistance
   */
  void setUserAssistance(String userAssistance);

  /**
   * @return array of encoded assistance requirements
   */
  String getUserAssistance();

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
  void setBusId(Long busId);

  /**
   * @return Id of bus serving this request
   */
  Long getBusId();

  /**
   * @param timeStamp
   */
  void setTimeStamp(Date timeStamp);

  /**
   * @return timestamp of data
   */
  Date getTimeStamp();

}
