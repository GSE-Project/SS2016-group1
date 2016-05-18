package gse1.buergerbusserver.stopmanagement.service.api.rest;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import gse1.buergerbusserver.stopmanagement.logic.api.to.StopEto;

/**
 * TODO mbaniasad This type ...
 *
 * @author mbaniasad
 * @since 0.1
 */
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Path("/stopmanagement/v1")
public interface StopmanagementRestService {

  @GET
  @Path("/stops/")
  public List<StopEto> getAllStops();
}
