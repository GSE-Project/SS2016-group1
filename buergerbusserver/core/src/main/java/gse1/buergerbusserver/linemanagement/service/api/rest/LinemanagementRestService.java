package gse1.buergerbusserver.linemanagement.service.api.rest;

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

import gse1.buergerbusserver.linemanagement.logic.api.Linemanagement;
import gse1.buergerbusserver.linemanagement.logic.api.to.CustomStopEto;
import gse1.buergerbusserver.linemanagement.logic.api.to.LastPositionEto;

/**
 * @author ahsan
 *
 */
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Path("/linemanagement/v1")
public interface LinemanagementRestService {

  /**
   * @return {@link HashMap} of all Lines with BusIds
   */
  // @GET
  // @Path("/lines/")
  // public List<LineEto> getAllLines();

  @GET
  @Path("/lines/")
  public HashMap<String, Object> getAllLinesWithBusIds();

  // /**
  // * Delegates to {@link Busmanagement#findBusesOnLine(Long)}.
  // *
  // * @param lineId ID of requested line
  // * @return {@link List} of {@link BusEto} objects serving the {@link Line} lineID
  // */
  // @GET
  // @Path("/buses/{lineId}/")
  // public List<BusEto> getBusesOnLine(@PathParam("lineId") String lineId);

  /**
   * Delegates to {@link Linemanagement#getAllBusesListWithTimeStamp()}.
   *
   * @return {@link HashMap} of all buses.
   */
  @GET
  @Path("/busses/")
  public HashMap<String, Object> getAllBuses();

  /**
   * Returns a HashMap of all the routes
   *
   * @return {@link HashMap} of all routes
   */
  @GET
  @Path("/routes/")
  public HashMap<String, Object> getAllRoutes();

  /**
   * Updates the bus status with LineId and BusId
   *
   * @param jsonRequest jsonRequest from client
   * @return Response Updated Bus Status with LineId and BusId through the jsonRequest
   */
  @POST
  @Consumes(MediaType.APPLICATION_JSON)
  @Path("/updateBusStatus/")
  public Response updateBusStatus(HashMap<String, Long> jsonRequest);

  /**
   * @return {@link HashMap} of timeStamp when it was last updated .
   */
  @GET
  @Path("/update/")
  public HashMap<String, Date> lastUpdate();

  /**
   * @param busId Last Position of the Bus with busId
   * @return Last position of the bus with busId
   */
  @GET
  @Path("/busses/{busId}/")
  public LastPositionEto getLastPosition(@PathParam("busId") String busId);

  /**
   * @param jsonRequest Set the Last Position with the jsonRequest
   * @return {@link HashMap} of the Last Position with jsonRequest
   */
  @POST
  @Path("/realTimeData")
  public Response setLastPosition(HashMap<String, Object> jsonRequest);

  /**
   * @param requestId requestID of the request
   * @return Status of the custom stop request along with other customer info
   */
  @GET
  // @Path("/customStop?requestId={requestId}")
  @Path("/customStop/requestid/{requestId}")
  public CustomStopEto getCustomStopStatus(@PathParam("requestId") Long requestId);

  /**
   * @param deviceId Device ID from which the request was received
   * @return All the requests from that device
   */
  @GET
  @Path("/customStop/deviceid/{deviceId}")
  public CustomStopEto getCustomStopDevice(@PathParam("deviceId") Long deviceId);

  /**
   * @param lineId Line ID of the bus
   * @return All pending requests for that day
   */
  @GET
  @Path("/customStop/lineid/{lineId}")
  public CustomStopEto getCustomStopLine(@PathParam("lineId") Long lineId);

  /**
   * @param status Status of the Custom Stop Request
   * @return All requests in that status
   */
  @GET
  @Path("/customStop/status/{status}")
  public CustomStopEto getCustomStopRequests(@PathParam("status") int status);

  /**
   * @param jsonRequest Set the Status with the jsonRequest
   * @return {@link HashMap} of the Status with jsonRequest
   */
  @POST
  @Consumes(MediaType.APPLICATION_JSON)
  @Path("/customStop/updStatus/")
  public Response updateCustomStopStatus(HashMap<String, Object> jsonRequest);

  /**
   * @param jsonRequest create a new custom stop request with the jsonRequest
   * @return {@link HashMap} requestID of the request with jsonRequest
   */
  @POST
  @Consumes(MediaType.APPLICATION_JSON)
  @Path("customStop/newRequest/")
  public Long newCustomStop(HashMap<String, Object> jsonRequest);

}
