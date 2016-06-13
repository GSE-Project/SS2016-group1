package gse1.buergerbusserver.schedulemanagement.logic.api;

import java.util.HashMap;
import java.util.List;

import gse1.buergerbusserver.schedulemanagement.logic.api.to.ScheduleEto;
import gse1.buergerbusserver.schedulemanagement.logic.api.to.StopEto;
import gse1.buergerbusserver.schedulemanagement.logic.api.to.StopWithSchedulesCto;

/**
 *
 *
 * @author mbrunnli
 * @since 0.1
 */
public interface Schedulemanagement {

  /**
   * Returns a {@link List} of all Stops in the Schedule.
   *
   * @return List of Stops
   */
  public List<StopEto> getAllStops();

  /**
   * Returns a {@link List} of schedules .
   *
   * @return List of {@link ScheduleEto} objects for Schedules
   */
  public List<ScheduleEto> getAllSchedules();

  /**
   * Returns a {@link List} of all Stops with Schedules .
   *
   * @return List of {@link StopWithSchedulesCto} objects for Stops in the Schedule
   */
  public HashMap<String, Object> getAllStopsWithSchedules();
}
