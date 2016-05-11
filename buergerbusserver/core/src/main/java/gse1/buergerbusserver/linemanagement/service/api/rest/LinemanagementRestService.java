package gse1.buergerbusserver.linemanagement.service.api.rest;

import gse1.buergerbusserver.linemanagement.logic.api.to.LineEto;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * TODO mbrunnli This type ...
 *
 * @author mbrunnli
 * @since 0.1
 */
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Path("/linemanagement/v1")
public interface LinemanagementRestService {

  @GET
  @Path("/lines/")
  public List<LineEto> listAllLines();
}
