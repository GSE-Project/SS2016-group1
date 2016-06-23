package gse1.buergerbusserver.linemanagement.logic.api.to;

import java.util.Date;

import gse1.buergerbusserver.general.common.api.datatype.GeoJsonPoint;
import gse1.buergerbusserver.linemanagement.common.api.CustomStop;
import io.oasp.module.basic.common.api.to.AbstractEto;

/**
 * @author ricarda
 *
 *         edited JAYU
 */
public class CustomStopEto extends AbstractEto implements CustomStop {

  /**
   *
   */
  private static final long serialVersionUID = 1L;

  private Long lineId;

  // private Long id;

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

  // public Long getId() {
  //
  // return this.id;
  // }
  //
  // public void setId(Long id) {
  //
  // this.id = id;
  // }

  /**
   *
   * @param lineId new value of {@link #getLineId}.
   */
  //

  @Override
  public void setLineId(Long lineId) {

    this.lineId = lineId;

  }

  /**
   * @return lineId
   */
  //

  @Override
  public Long getLineId() {

    return this.lineId;
  }

  // /**
  // *
  // * @param requestId new value of {@link #getRequestId}.
  // */
  //
  // public void setRequestId(Long requestId) {
  //
  // this.id = requestId;
  // }
  //
  // /**
  // * @return requestId
  // */
  // public Long getRequestId() {
  //
  // return this.id;
  // }

  /**
   * @param pickUpTime pickUpTime new value of {@link #getPickUpTime}
   */
  //

  @Override
  public void setPickUpTime(Date pickUpTime) {

    this.pickUpTime = pickUpTime;

  }

  /**
   * @return pickUpTime
   */
  //

  @Override
  public Date getPickUpTime() {

    return this.pickUpTime;
  }

  /**
   * @param lon Longitude of the requested Stop
   */
  //

  @Override
  public void setLon(double lon) {

    this.lon = lon;

  }

  /**
   * @return Longitude of the requested Stop
   */
  //

  @Override
  public double getLon() {

    return this.lon;
  }

  /**
   * @param lat Latitude of the requested Stop
   */
  //

  @Override
  public void setLat(double lat) {

    this.lat = lat;

  }

  /**
   * @return Latitude of the requested Stop
   */
  //

  @Override
  public double getLat() {

    return this.lat;
  }

  /**
   * @param numberOfPersons Sets No.of persons who requested the customed Stop
   *
   */
  //

  @Override
  public void setNumberOfPersons(int numberOfPersons) {

    this.numberOfPersons = numberOfPersons;

  }

  /**
   * @return NumberOfPersons who requested the Custom Stop
   */
  //

  @Override
  public int getNumberOfPersons() {

    return this.numberOfPersons;
  }

  /**
   * @param deviceId new value of device id.
   */
  //

  @Override
  public void setDeviceId(String deviceId) {

    this.deviceId = deviceId;

  }

  /**
   * @return deviceId
   */
  //

  @Override
  public String getDeviceId() {

    return this.deviceId;
  }

  /**
   * @param userName new value of {@link #getUserName}.
   */
  //

  @Override
  public void setUserName(String userName) {

    this.userName = userName;

  }

  /**
   * @return UserName
   */
  //

  @Override
  public String getUserName() {

    return this.userName;
  }

  /**
   * @param userAddress Set the User Address of the Persons
   */
  //

  @Override
  public void setUserAddress(String userAddress) {

    this.userAddress = userAddress;

  }

  /**
   * @return userAddress
   */
  //

  @Override
  public String getUserAddress() {

    return this.userAddress;
  }

  /**
   * @param userAssistance new value of {@link #getUserAssistance}
   *
   */
  //

  @Override
  public void setUserAssistance(String userAssistance) {

    this.userAssistance = userAssistance;

  }

  /**
   * @return UserAssistance
   */
  //

  @Override
  public String getUserAssistance() {

    return this.userAssistance;
  }

  /**
   * @param status Set the Status of the Bus
   */
  //

  @Override
  public void setStatus(int status) {

    this.status = status;

  }

  /**
   * @return Status of the Bus
   */
  //

  @Override
  public int getStatus() {

    return this.status;
  }

  /**
   *
   * @param busId new value of {@link #getBusId}.
   */
  //

  @Override
  public void setBusId(Long busId) {

    this.busId = busId;

  }

  /**
   * @return busId
   */
  //

  @Override
  public Long getBusId() {

    return this.busId;
  }

  /**
   * @param timeStamp Sets date time on create/update
   *
   */
  //

  @Override
  public void setTimeStamp(Date timeStamp) {

    this.timeStamp = timeStamp;

  }

  /**
   *
   *
   * @return timestamp for the line when it last updated
   */
  //

  @Override
  public Date getTimeStamp() {

    return this.timeStamp;
  }

  /**
   * @return the location of the Bus with latitude and Longitude
   */
  public GeoJsonPoint getLocation() {

    return new GeoJsonPoint(this.lon, this.lat);
  }

}
