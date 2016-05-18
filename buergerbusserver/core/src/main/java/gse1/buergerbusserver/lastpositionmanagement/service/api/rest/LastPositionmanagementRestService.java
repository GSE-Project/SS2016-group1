package gse1.buergerbusserver.lastpositionmanagement.service.api.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
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
@Path("/lastpositionmanagement/v1")
public interface LastPositionmanagementRestService {

  @GET
  @Path("/getLastPosition/{busId}/")
  public LastPositionEto getLastPosition(String busId);
}
