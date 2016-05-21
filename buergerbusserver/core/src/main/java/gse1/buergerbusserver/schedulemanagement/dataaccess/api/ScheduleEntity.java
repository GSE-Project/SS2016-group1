package gse1.buergerbusserver.schedulemanagement.dataaccess.api;

import gse1.buergerbusserver.general.dataaccess.api.ApplicationPersistenceEntity;
import gse1.buergerbusserver.schedulemanagement.common.api.Schedule;
import gse1.buergerbusserver.schedulemanagement.common.api.Stop;

import java.sql.Time;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @author mbaniasad
 *
 */
@Entity
@Table(name = "SCHEDULE")
public class ScheduleEntity extends ApplicationPersistenceEntity implements Schedule {

  private String lineName;

  private Long stopId;

  private Time arrivingTime;

  private Date timestamp;

  /**
   * @return timestamp
   */
  @Override
  // see https://github.com/oasp-forge/oasp4j-wiki/wiki/guide-dataaccess-layer#date-and-time
  @Temporal(TemporalType.TIMESTAMP)
  public Date getTimestamp() {

    return this.timestamp;
  }

  /**
   * @param timestamp new value of {@link #gettimestamp}.
   */
  @Override
  public void setTimestamp(Date timestamp) {

    this.timestamp = timestamp;
  }

  public String getLineName() {

    return lineName;
  }

  public void setLineName(String lineName) {

    this.lineName = lineName;
  }

  public Long getStopId() {

    return stopId;
  }

  public void setStopId(Long stopId) {

    this.stopId = stopId;
  }

  public Time getArrivingTime() {

    return arrivingTime;
  }

  public void setArrivingTime(Time arrivingTime) {

    this.arrivingTime = arrivingTime;
  }

}
