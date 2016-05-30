package gse1.buergerbusserver.schedulemanagement.logic.api;

import java.util.Collection;
import java.util.List;

import gse1.buergerbusserver.schedulemanagement.logic.api.to.ListAndTimeStamp;
import gse1.buergerbusserver.schedulemanagement.logic.api.to.StopEto;
import gse1.buergerbusserver.schedulemanagement.logic.api.to.ScheduleEto;
import gse1.buergerbusserver.schedulemanagement.logic.api.to.StopWithSchedulesCto;
/**
 * TODO mbrunnli This type ...
 *
 * @author mbrunnli
 * @since 0.1
 */
public interface Schedulemanagement {

  public List<StopEto> getAllStops();

  public List<ScheduleEto> getAllSchedules();
  
  public ListAndTimeStamp<StopWithSchedulesCto> getAllStopsWithSchedules();
}
