package gse1.buergerbusserver.schedulemanagement.dataaccess.api;

import gse1.buergerbusserver.general.dataaccess.api.ApplicationPersistenceEntity;
import gse1.buergerbusserver.schedulemanagement.common.api.Schedule;
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

  private Long lineId;

  private String lineName;

  private Long stopId;

  private Time arrivingTime;

  private Date timeStamp;

  /**
   * @return Date
   */
  @Override
  // see https://github.com/oasp-forge/oasp4j-wiki/wiki/guide-dataaccess-layer#date-and-time
  @Temporal(TemporalType.TIMESTAMP)
  public Date getTimestamp() {

    return this.timeStamp;
  }

  /**
   * @param Dates new value of {@link #gettimeStamp}.
   */
  @Override
  public void setTimestamp(Date timestamp) {

    this.timeStamp = timestamp;
  }

  public String getLineName() {

    return lineName;
  }

  public void setLineName(String lineName) {

    this.lineName = lineName;
  }

  public Long getLineId() {

    return lineId;
  }

  public void setLineId(Long lineId) {

    this.lineId = lineId;
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
