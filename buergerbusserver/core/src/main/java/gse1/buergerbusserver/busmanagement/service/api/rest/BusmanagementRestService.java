package gse1.buergerbusserver.busmanagement.service.api.rest;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import gse1.buergerbusserver.busmanagement.logic.api.Busmanagement;
import gse1.buergerbusserver.busmanagement.logic.api.to.BusEto;
import gse1.buergerbusserver.linemanagement.common.api.Line;

/**
 * @author ricarda
 *
 */
// TODO: Communicate and correct paths

@Path("busmanagement/v1")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public interface BusmanagementRestService {

  /**
   * Delegates to {@link Busmanagement#findBusesOnLine(Long)}.
   *
   * @param lineId ID of requested line
   * @return {@link List} of {@link BusEto} objects serving the {@link Line} lineID
   */
  @GET
  @Path("/buses/{lineId}")
  public List<BusEto> listBusesOnLine(String lineId);

  /**
   * Delegates to {@link Busmanagement#findAllBuses()}.
   *
   * @return {@link List} of {@link BusEto} objects
   */
  @GET
  @Path("/buses")
  public List<BusEto> listAllBuses();

}
