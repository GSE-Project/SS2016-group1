package gse1.buergerbusserver.linemanagement.logic.api.to;

import java.util.Date;

/**
 * @author ricarda
 *
 *         edited JAYU
 */
public class CustomStopEto {// extends AbstractEto implements CustomStop {

  private Long lineId;

  private Long requestId;

  private Date pickUpTime;

  private double lon;

  private double lat;

  private int numberOfPersons;

  private String deviceId;

  private String userName;

  private String userAddress;

  private String userAssistance;

  private int status;

  private Long busId;

  private Date timeStamp;

  /**
   * The constructor.
   */
  public CustomStopEto() {

    super();
  }

  /**
   *
   * @param lineId new value of {@link #getLineId}.
   */
  public void setLineId(Long lineId) {

    this.lineId = lineId;

  }

  /**
   * @return lineId
   */
  public Long getLineId() {

    return this.lineId;
  }

  /**
   *
   * @param requestId new value of {@link #getRequestId}.
   */

  public void setRequestId(Long requestId) {

    this.requestId = requestId;
  }

  /**
   * @return requestId
   */
  public Long getRequestId() {

    return this.requestId;
  }

  /**
   * @param pickUpTime pickUpTime new value of {@link #getPickUpTime}
   */
  public void setPickUpTime(Date pickUpTime) {

    this.pickUpTime = pickUpTime;

  }

  /**
   * @return pickUpTime
   */
  public Date getPickUpTime() {

    return this.pickUpTime;
  }

  /**
   * @param lon Longitude of the requested Stop
   */
  public void setLon(double lon) {

    this.lon = lon;

  }

  /**
   * @return Longitude of the requested Stop
   */
  public double getLon() {

    return this.lon;
  }

  /**
   * @param lat Latitude of the requested Stop
   */
  public void setLat(double lat) {

    this.lat = lat;

  }

  /**
   * @return Latitude of the requested Stop
   */
  public double getLat() {

    return this.lat;
  }

  /**
   * @param numberOfPersons Sets No.of persons who requested the customed Stop
   *
   */
  public void setNumberOfPersons(int numberOfPersons) {

    this.numberOfPersons = numberOfPersons;

  }

  /**
   * @return NumberOfPersons who requested the Custom Stop
   */
  public int getNumberOfPersons() {

    return this.numberOfPersons;
  }

  /**
   * @param deviceId new value of {@link #getRequestId}.
   */
  public void setDeviceId(String deviceId) {

    this.deviceId = deviceId;

  }

  /**
   * @return deviceId
   */
  public String getDeviceId() {

    return this.deviceId;
  }

  /**
   * @param userName new value of {@link #getUserName}.
   */
  public void setUserName(String userName) {

    this.userName = userName;

  }

  /**
   * @return UserName
   */
  public String getUserName() {

    return this.userName;
  }

  /**
   * @param userAddress Set the User Address of the Persons
   */
  public void setUserAddress(String userAddress) {

    this.userAddress = userAddress;

  }

  /**
   * @return userAddress
   */
  public String getUserAddress() {

    return this.userAddress;
  }

  /**
   * @param userAssistance new value of {@link #getUserAssistance}
   *
   */
  public void setUserAssistance(String userAssistance) {

    this.userAssistance = userAssistance;

  }

  /**
   * @return UserAssistance
   */
  public String getUserAssistance() {

    return this.userAssistance;
  }

  /**
   * @param status Set the Status of the Bus
   */
  public void setStatus(int status) {

    this.status = status;

  }

  /**
   * @return Status of the Bus
   */
  public int getStatus() {

    return this.status;
  }

  /**
   *
   * @param busId new value of {@link #getBusId}.
   */
  public void setBusId(Long busId) {

    this.busId = busId;

  }

  /**
   * @return busId
   */
  public Long getBusId() {

    return this.busId;
  }

  /**
   * @param timeStamp Sets date time on create/update
   *
   */
  public void setTimeStamp(Date timeStamp) {

    this.timeStamp = timeStamp;

  }

  /**
   *
   *
   * @return timestamp for the line when it last updated
   */
  public Date getTimeStamp() {

    return this.timeStamp;
  }

}
