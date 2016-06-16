package gse1.buergerbusserver.linemanagement.dataaccess.api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import gse1.buergerbusserver.general.dataaccess.api.ApplicationPersistenceEntity;
import gse1.buergerbusserver.linemanagement.common.api.CustomStop;
import gse1.buergerbusserver.linemanagement.common.api.Line;

/**
 * {@link ApplicationPersistenceEntity Entity} representing a {@link Line}. A Custom stop has the location and pick up
 * time and is associated with a lineID
 *
 * @author Sriramk88
 *
 **/

@Entity
@Table(name = "CUSTOMSTOP")
public class CustomStopEntity extends ApplicationPersistenceEntity implements CustomStop {

  private static final long serialVersionUID = 1L;

  private String userAssistance;

  private Long requestId;

  private Long lineId;

  private Date pickUpTime;

  private double lat;

  private double lon;

  private int numberOfPersons;

  private String deviceId;

  private String userName;

  private String userAddress;

  private int status;

  private Long busId;

  private Date timeStamp;

  @Override
  public Long getRequestId() {

    return this.requestId;
  }

  @Override
  public void setRequestId(Long requestId) {

    this.requestId = requestId;
  }

  @Override
  public Long getBusId() {

    return this.busId;
  }

  @Override
  public void setBusId(Long busId) {

    this.busId = busId;
  }

  @Override
  public Long getLineId() {

    return this.lineId;
  }

  @Override
  public void setLineId(Long lineId) {

    this.lineId = lineId;
  }

  @Override
  public Date getPickUpTime() {

    return this.pickUpTime;
  }

  @Override
  public void setPickUpTime(Date pickUpTime) {

    this.pickUpTime = pickUpTime;
  }

  @Override
  public double getLat() {

    return this.lat;
  }

  @Override
  public void setLat(double lat) {

    this.lat = lat;
  }

  @Override
  public double getLon() {

    return this.lon;
  }

  @Override
  public void setLon(double lon) {

    this.lon = lon;
  }

  @Override
  public int getNumberOfPersons() {

    return this.numberOfPersons;
  }

  @Override
  public void setNumberOfPersons(int numberOfPersons) {

    this.numberOfPersons = numberOfPersons;
  }

  @Override
  public String getDeviceId() {

    return this.deviceId;
  }

  @Override
  public void setDeviceId(String deviceId) {

    this.deviceId = deviceId;
  }

  @Override
  public String getUserName() {

    return this.userName;
  }

  @Override
  public void setUserName(String userName) {

    this.userName = userName;
  }

  @Override
  public String getUserAddress() {

    return this.userAddress;
  }

  @Override
  public void setUserAddress(String userAddress) {

    this.userAddress = userAddress;
  }

  @Override
  public List<Integer> getUserAssistance() {

    // List<Integer> returnList = Arrays.asList("\\s*,\\s*");
    // Iterable<String> splitIterator = Splitter.on(',').split(numbers);
    // List<Integer> returnList= Lists.newArrayList(splitIterator );

    List<String> stringList = Arrays.asList(this.userAssistance.split(","));
    List<Integer> returnList = new ArrayList<>();
    for (String num : stringList) {
      returnList.add(Integer.valueOf(num));
    }

    return returnList;
  }

  @Override
  public void setUserAssistance(List<Integer> userAssistance) {

    this.userAssistance = userAssistance.toString();
  }

  @Override
  public int getStatus() {

    return this.status;
  }

  @Override
  public void setStatus(int status) {

    this.status = status;
  }

  /**
   * @return timeStamp
   */
  @Override
  // see https://github.com/oasp-forge/oasp4j-wiki/wiki/guide-dataaccess-layer#date-and-time
  @Temporal(TemporalType.TIMESTAMP)
  public Date getTimeStamp() {

    return this.timeStamp;
  }

  /**
   * @param timeStamp new value of {@link #getTimeStamp}.
   */
  @Override
  public void setTimeStamp(Date timeStamp) {

    this.timeStamp = timeStamp;
  }

}
