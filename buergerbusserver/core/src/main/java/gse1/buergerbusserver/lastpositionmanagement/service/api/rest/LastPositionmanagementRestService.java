package gse1.buergerbusserver.lastpositionmanagement.service.api.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import gse1.buergerbusserver.lastpositionmanagement.logic.api.to.LastPositionEto;

/**
 *
 *
 * @author razadfki
 * @since 0.1
 */
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Path("/busmanagement/v1")
public interface LastPositionmanagementRestService {

  @GET
  @Path("/lastPosition/{busId}/")
  public LastPositionEto getLastPosition(@PathParam("busId") String busId);

  @POST
  @Path("/lastPosition/{busId}/{lon}/{lat}/")
  public void setLastPosition(@PathParam("busId") Long busId, @PathParam("lon") double lon,
      @PathParam("lat") double lat);
  // public void setLastPosition(LastPositionEntity lpe);
  /*
   * @PathParam("orderId") public void setLastPosition(@FormParam("busId") Long busId, @FormParam("lon") double lon,
   *
   * @FormParam("lat") double lat);
   */

}
