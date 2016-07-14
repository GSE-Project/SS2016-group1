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
 * CustomStopEntity implementing CustomStop interface implies setter getter properties.
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

  private Point location;

  private int numberOfPersons;

  private String deviceId;

  private String info;

  private int status;

  private Long acceptingBus;

  @Override
  public Long getAcceptingBus() {

    return this.acceptingBus;
  }

  @Override
  public void setAcceptingBus(Long acceptingBus) {

    this.acceptingBus = acceptingBus;
  }

  @Override
  public String getRejectingBus() {

    return this.rejectingBus;
  }

  @Override
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
  public Point getLocation() {

    return this.location;
  }

  @Override
  public void setLocation(Point location) {

    this.location = location;
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
  public String getInfo() {

    return this.info;
  }

  @Override
  public void setInfo(String info) {

    this.info = info;

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
