package gse1.buergerbusserver.linemanagement.logic.api.to;

import java.util.Date;
import java.util.List;

/**
 * @author ricarda
 *
 */
public class CustomStopEto {// extends AbstractEto implements CustomStop {

  /**
   *
   */
  private static final long serialVersionUID = 1L;

  private Long lineId;

  private Date pickUpTime;

  private double lon;

  private double lat;

  private int numberOfPersons;

  private Long deviceId;

  private String userName;

  private String userAddress;

  private List<Integer> userAssistance;

  private int status;

  private Long busId;

  private Date timeStamp;

  /**
   * The constructor.
   */
  public CustomStopEto() {

    super();
  }

  public void setLineId(Long lineId) {

    this.lineId = lineId;

  }

  public Long getLineId() {

    return this.lineId;
  }

  public void setPickUpTime(Date pickUpTime) {

    this.pickUpTime = pickUpTime;

  }

  public Date getPickUpTime() {

    return this.pickUpTime;
  }

  public void setLon(double lon) {

    this.lon = lon;

  }

  public double getLon() {

    return this.lon;
  }

  public void setLat(double lat) {

    this.lat = lat;

  }

  public double getLat() {

    return this.lat;
  }

  public void setNumberOfPersons(int numberOfPersons) {

    this.numberOfPersons = numberOfPersons;

  }

  public int getNumberOfPersons() {

    return this.numberOfPersons;
  }

  public void setDeviceId(Long deviceId) {

    this.deviceId = deviceId;

  }

  public Long getDeviceId() {

    return this.deviceId;
  }

  public void setUserName(String userName) {

    this.userName = userName;

  }

  public String getUserName() {

    return this.userName;
  }

  public void setUserAddress(String userAddress) {

    this.userAddress = userAddress;

  }

  public String getUserAddress() {

    return this.userAddress;
  }

  public void setUserAssistance(List<Integer> userAssistance) {

    this.userAssistance = userAssistance;

  }

  public List<Integer> getUserAssistance() {

    return this.userAssistance;
  }

  public void setStatus(int status) {

    this.status = status;

  }

  public int getStatus() {

    return this.status;
  }

  public void setBusId(Long busId) {

    this.busId = busId;

  }

  public Long getBusId() {

    return this.busId;
  }

  public void setTimeStamp(Date timeStamp) {

    this.timeStamp = timeStamp;

  }

  public Date getTimeStamp() {

    return this.timeStamp;
  }

}
