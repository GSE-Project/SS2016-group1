package gse1.buergerbusserver.schedulemanagement.dataaccess.api;

import java.sql.Time;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import gse1.buergerbusserver.general.dataaccess.api.ApplicationPersistenceEntity;
import gse1.buergerbusserver.schedulemanagement.common.api.Schedule;

/**
 * @author mbaniasad
 *
 */
@Entity
@Table(name = "SCHEDULE")
public class ScheduleEntity extends ApplicationPersistenceEntity implements Schedule {

  /**
   *
   */
  private static final long serialVersionUID = 1L;

  private Long lineId;

  private String lineName;

  private Long stopId;

  private Time arrivingTime;

  private Date timeStamp;

  /**
   * @return timeStamp
   */
  @Override
  // see https://github.com/oasp-forge/oasp4j-wiki/wiki/guide-dataaccess-layer#date-and-time
  @Temporal(TemporalType.TIMESTAMP)
  public Date getTimestamp() {

    return this.timeStamp;
  }

  /**
   * @param timestamp new value of {@link #getTimestamp}.
   */
  @Override
  public void setTimestamp(Date timestamp) {

    this.timeStamp = timestamp;
  }

  /**
   *
   *
   * @return linename
   */
  @Override
  public String getLineName() {

    return this.lineName;
  }

  /**
   * Sets name to the line
   *
   * @param lineName to the line
   */
  @Override
  public void setLineName(String lineName) {

    this.lineName = lineName;
  }

  /**
   *
   *
   * @return lineId of the Line
   */
  @Override
  public Long getLineId() {

    return this.lineId;
  }

  /**
   * Set reference lineId to the Line
   *
   * @param lineId to the Line
   */
  @Override
  public void setLineId(Long lineId) {

    this.lineId = lineId;
  }

  /**
   *
   *
   * @return StopId of the Stop
   */
  @Override
  public Long getStopId() {

    return this.stopId;
  }

  /**
   * Set reference stopId to the Stop
   *
   * @param stopId to the Stop
   */
  @Override
  public void setStopId(Long stopId) {

    this.stopId = stopId;
  }

  /**
   * @return arrivingTime of the Bus
   */
  @Override
  public Time getArrivingTime() {

    return this.arrivingTime;
  }

  /**
   * Sets the arriving Time of the bus
   *
   * @param arrivingTime of the bus
   */
  @Override
  public void setArrivingTime(Time arrivingTime) {

    this.arrivingTime = arrivingTime;
  }

}
