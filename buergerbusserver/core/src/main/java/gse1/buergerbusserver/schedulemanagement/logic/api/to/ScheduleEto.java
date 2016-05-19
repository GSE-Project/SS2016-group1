package gse1.buergerbusserver.schedulemanagement.logic.api.to;

import java.sql.Time;

import java.util.Date;


/**
 * @author MOH
 * @since 0.1
 */
public class ScheduleEto {

  private String lineName;

  private Long stopId;

  private Time arrivingTime;

  private Date timestamp;

  public Date getTimestamp() {

    return this.timestamp;
  }

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
