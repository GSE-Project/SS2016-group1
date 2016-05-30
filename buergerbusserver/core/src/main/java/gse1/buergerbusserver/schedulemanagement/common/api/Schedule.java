package gse1.buergerbusserver.schedulemanagement.common.api;

import gse1.buergerbusserver.general.common.api.ApplicationEntity;

import java.sql.Time;
import java.util.Date;

/**
 * @author mbaniasad
 *
 */
public interface Schedule extends ApplicationEntity {


  public String getLineName();

  public void setLineName(String lineName);

  public Long getLineId();

  public void setLineId(Long lineId);

  public Long getStopId();

  public void setStopId(Long stopId);

  public Time getArrivingTime();

  public void setArrivingTime(Time arrivingTime);


  void setTimestamp(Date timeStamp);

  Date getTimestamp();


}
