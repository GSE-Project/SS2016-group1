package gse1.buergerbusserver.linemanagement.logic.api;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import gse1.buergerbusserver.linemanagement.logic.api.to.LineEto;

/**
 * @author razadfki
 *
 */
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Path("/linemanagement/v1")
public interface Linemanagement {
  @GET
  @Path("/lines/")
  List<LineEto> getAllLines();
}
