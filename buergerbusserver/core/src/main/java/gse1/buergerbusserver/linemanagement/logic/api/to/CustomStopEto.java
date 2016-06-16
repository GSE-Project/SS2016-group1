package gse1.buergerbusserver.linemanagement.logic.api.to;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.util.StringUtils;

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

  public void setLineId(Long lineId) {

    this.lineId = lineId;

  }

  public Long getLineId() {

    return this.lineId;
  }

  public void setRequestId(Long requestId) {

    this.requestId = requestId;
  }

  public Long getRequestId() {

    return this.requestId;
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

  public void setDeviceId(String deviceId) {

    this.deviceId = deviceId;

  }

  public String getDeviceId() {

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

    this.userAssistance = StringUtils.collectionToDelimitedString(userAssistance, ",");

  }

  public List<Integer> getUserAssistance() {

    List<String> stringList = Arrays.asList(this.userAssistance.split(","));
    List<Integer> returnList = new ArrayList<>();
    for (String num : stringList) {
      returnList.add(Integer.valueOf(num));
    }

    return returnList;
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
