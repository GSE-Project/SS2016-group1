package gse1.buergerbusserver.schedulemanagement.service.api.rest;

import java.util.HashMap;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import gse1.buergerbusserver.schedulemanagement.logic.api.to.ScheduleEto;
import gse1.buergerbusserver.schedulemanagement.logic.api.to.StopEto;

/**
 *
 *
 * @author mbaniasad
 * @since 0.1
 */
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Path("/linemanagement/v1")
public interface SchedulemanagementRestService {

  /**
   * Returns a {@link List} of all Stops in the Schedule.
   *
   * @return List of Stops in the Schedule
   */
  public List<StopEto> getAllStops();

  /**
   * Returns a {@link List} of schedules .
   *
   * @return List of {@link ScheduleEto} objects for Schedules
   */
  @GET
  @Path("/schedules/")
  List<ScheduleEto> getAllSchedules();

  /**
   * Returns a {@link HashMap} of all Stops with Schedules .
   *
   * @return {@link HashMap} of all the Stops with Schedules
   */
  // @GET
  // @Path("/stopsWithSchedules/")
  //

  @GET
  @Path("/stops/")
  HashMap<String, Object> GetAllStopsWithSchedules();
}
