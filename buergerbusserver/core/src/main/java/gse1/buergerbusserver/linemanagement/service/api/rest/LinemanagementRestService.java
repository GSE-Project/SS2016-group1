package gse1.buergerbusserver.linemanagement.service.api.rest;

import gse1.buergerbusserver.linemanagement.logic.api.Linemanagement;
import gse1.buergerbusserver.linemanagement.logic.api.to.LastPositionEto;

import java.util.Date;
import java.util.HashMap;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * @author ahsan
 *
 */
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Path("/linemanagement/v1")
public interface LinemanagementRestService {

  // @GET
  // @Path("/lines/")
  // public List<LineEto> getAllLines();

  @GET
  @Path("/lines/")
  public HashMap<String, Object> getAllLinesWithBusIds();

//  /**
//   * Delegates to {@link Busmanagement#findBusesOnLine(Long)}.
//   *
//   * @param lineId ID of requested line
//   * @return {@link List} of {@link BusEto} objects serving the {@link Line} lineID
//   */
//  @GET
//  @Path("/buses/{lineId}/")
//  public List<BusEto> getBusesOnLine(@PathParam("lineId") String lineId);

  /**
   * Delegates to {@link Linemanagement#getAllBusesListWithTimeStamp()}.
   *
   * @return {@link HashMap} of {@link List<String, Object>} objects
   */
  @GET
  @Path("/busses/")
  public HashMap<String, Object> getAllBuses();

  /**
   * @return getAllRoutes
   */
  @GET
  @Path("/routes/")
  public HashMap<String, Object> getAllRoutes();

  @POST
  @Consumes(MediaType.APPLICATION_JSON )
  @Path("/updateBusStatus/")
  public Response updateBusStatus(HashMap<String, Long> jsonRequest);

  @GET
  @Path("/update/")
  public HashMap<String, Date> lastUpdate();

  @GET
  @Path("/busses/{busId}/")
  public LastPositionEto getLastPosition(@PathParam("busId") String busId);

  @POST
  @Path("/realTimeData")
  public Response setLastPosition(HashMap<String, Object> jsonRequest);

}
