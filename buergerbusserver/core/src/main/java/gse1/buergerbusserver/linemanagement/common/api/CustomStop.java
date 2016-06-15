package gse1.buergerbusserver.linemanagement.common.api;

import java.util.Date;

import gse1.buergerbusserver.general.common.api.ApplicationEntity;

/**
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
  void setDeviceId(Long deviceId);

  /**
   * @return Id of the device which sent the request
   */
  Long getDeviceId();

  /**
   * @param infoName
   */
  void setInfoName(String infoName);

  /**
   * @return Name of the customer
   */
  String getInfoName();

  /**
   * @param infoAddress
   */
  void setInfoAddress(String infoAddress);

  /**
   * @return address where the customer wants to be picked up
   */
  String getInfoAddress();

  /**
   * @param infoAssistance
   */
  void setInfoAssistance(int[] infoAssistance);

  /**
   * @return array of encoded assistance requirements
   */
  int[] getInfoAssistance();

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
