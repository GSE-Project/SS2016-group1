package gse1.buergerbusserver.lastpositionmanagement.service.impl.rest;

import javax.inject.Inject;
import javax.inject.Named;
import javax.ws.rs.BadRequestException;
import javax.ws.rs.NotFoundException;
import javax.ws.rs.PathParam;

import gse1.buergerbusserver.lastpositionmanagement.logic.api.LastPositionmanagement;
import gse1.buergerbusserver.lastpositionmanagement.logic.api.to.LastPositionEto;
import gse1.buergerbusserver.lastpositionmanagement.service.api.rest.LastPositionmanagementRestService;

/**
 *
 *
 * @author razadfki
 * @since 0.1
 */
@Named("LastPositionmanagementRestService")
public class LastPositionmanagementRestServiceImpl implements LastPositionmanagementRestService {

  @Inject
  private LastPositionmanagement lastPositionmanagement;

  @Override
  public LastPositionEto getLastPosition(@PathParam("busId") String busId) {

    Long busIdW;
    if (busId == null) {
      throw new BadRequestException("Missing bus id.");
    }
    try {
      busIdW = Long.parseLong(busId);
    } catch (NumberFormatException e) {
      throw new BadRequestException("Line id is not a number");
    } catch (NotFoundException e) {
      throw new BadRequestException("Line not found");
    }
    LastPositionEto lastPosition = this.lastPositionmanagement.getLastPosition(busIdW);
    return lastPosition;
  }
}
