package gse1.buergerbusserver.linemanagement.dataaccess.api;

import java.util.Date;

import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

import org.geojson.Point;

import gse1.buergerbusserver.general.dataaccess.api.ApplicationPersistenceEntity;
import gse1.buergerbusserver.general.dataaccess.base.PointConverter;
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
@Table(name = "CUSTOMSTOP", uniqueConstraints = { @UniqueConstraint(columnNames = "id") })
public class CustomStopEntity extends ApplicationPersistenceEntity implements CustomStop {

  private static final long serialVersionUID = 1L;

  // @Id
  // @GeneratedValue(strategy = GenerationType.IDENTITY)
  // // @Column(name = "id", unique = true, nullable = false, insertable = false, updatable = false)
  // private Long id;

  private Long lineId;

  private Date pickUpTime;

  private Point stopLocation;

  private int numberOfPersons;

  private String deviceId;

  private String userInfo;

  private int status;

  private Long acceptingBus;
  
  public Long getAcceptingBus() {
  
    return acceptingBus;
  }

  public void setAcceptingBus(Long acceptingBus) {
  
    this.acceptingBus = acceptingBus;
  }

  public String getRejectingBus() {
  
    return rejectingBus;
  }

  public void setRejectingBus(String rejectingBus) {
  
    this.rejectingBus = rejectingBus;
  }

  private String rejectingBus;

  private Date timeStamp;

  // @Override
  // @Id
  // @GeneratedValue(strategy = GenerationType.IDENTITY)
  // // @Column(name = "id", unique = true, nullable = false, insertable = false, updatable = false)
  // public Long getId() {
  //
  // return this.id;
  // }
  //
  // @Override
  // @Id
  // @GeneratedValue(strategy = GenerationType.IDENTITY)
  // // @Column(name = "id", unique = true, nullable = false, insertable = false, updatable = false)
  // public void setId(Long id) {
  //
  // this.id = id;
  // }



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
  @Convert(converter = PointConverter.class)
  public Point getStopLocation() {

    return this.stopLocation;
  }

  @Override
  public void setStopLocation(Point stopLocation) {

    this.stopLocation = stopLocation;
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
  // @Convert(converter = StringListConverter.class)
  public String getUserInfo() {

    return this.userInfo;
  }

  @Override
  // @Convert(converter = StringListConverter.class)
  public void setUserInfo(String userInfo) {

    this.userInfo = userInfo;

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
