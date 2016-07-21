package gse1.buergerbusserver.schedulemanagement.logic.api.to;

import java.sql.Time;
import java.util.Date;

/**
 * Schedule Entity transfer object with setter and getters only.
 * 
 * @author MOH
 * @since 0.1
 */
public class ScheduleEto {

  private String lineName;

  private Long lineId;

  private Long stopId;

  private Time arrivingTime;

  private Date timestamp;

  /**
   *
   *
   * @return timestamp
   */
  protected Date getTimestamp() {

    return this.timestamp;
  }

  /**
   *
   * @param timestamp Sets date time on create/update
   */
  public void setTimestamp(Date timestamp) {

    this.timestamp = timestamp;
  }

  /**
   *
   *
   * @return LineName
   */
  public String getLineName() {

    return this.lineName;
  }

  /**
   * Sets name to the line
   *
   * @param lineName to the line
   */
  public void setLineName(String lineName) {

    this.lineName = lineName;
  }

  /**
   *
   *
   * @return lineId of the Line
   */
  public Long getLineId() {

    return this.lineId;
  }

  /**
   * Set reference lineId to the Line
   *
   * @param lineId to the Line
   */
  public void setLineId(Long lineId) {

    this.lineId = lineId;
  }

  /**
   *
   *
   * @return StopId of the Stop
   */
  public Long getStopId() {

    return this.stopId;
  }

  /**
   * Set reference stopId to the Stop
   *
   * @param stopId to the Stop
   */
  public void setStopId(Long stopId) {

    this.stopId = stopId;
  }

  /**
   * @return arrivingTime of the Bus
   */
  public Time getArrivingTime() {

    return this.arrivingTime;
  }

  /**
   * Sets the arriving Time of the bus
   *
   * @param arrivingTime of the bus
   */
  public void setArrivingTime(Time arrivingTime) {

    this.arrivingTime = arrivingTime;
  }

}
