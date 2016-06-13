package gse1.buergerbusserver.schedulemanagement.common.api;

import java.sql.Time;
import java.util.Date;

import gse1.buergerbusserver.general.common.api.ApplicationEntity;

/**
 * This is the interface for a Schedule of the system. It provides information regarding the lineIds, stopIds, Arriving
 * time of the buses and the object carries a timestamp.
 *
 * @author mbaniasad
 *
 */
public interface Schedule extends ApplicationEntity {

  /**
   *
   *
   * @return linename
   */
  public String getLineName();

  /**
   * Sets name to the line
   *
   * @param lineName to the line
   */
  public void setLineName(String lineName);

  /**
   *
   *
   * @return lineId of the Line
   */
  public Long getLineId();

  /**
   * Set reference lineId to the Line
   *
   * @param lineId to the Line
   */
  public void setLineId(Long lineId);

  /**
   *
   *
   * @return StopId of the Stop
   */
  public Long getStopId();

  /**
   * Set reference stopId to the Stop
   *
   * @param stopId to the Stop
   */
  public void setStopId(Long stopId);

  /**
   * @return arrivingTime of the Bus
   */
  public Time getArrivingTime();

  /**
   * Sets the arriving Time of the bus
   *
   * @param arrivingTime of the bus
   */
  public void setArrivingTime(Time arrivingTime);

  /**
   * Sets date time on create/update
   *
   * @param timeStamp
   *
   */
  void setTimestamp(Date timeStamp);

  /**
   *
   *
   * @return timestamp
   */
  Date getTimestamp();

}
