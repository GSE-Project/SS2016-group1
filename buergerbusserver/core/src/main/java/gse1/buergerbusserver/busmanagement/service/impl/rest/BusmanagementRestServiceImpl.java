package gse1.buergerbusserver.busmanagement.service.impl.rest;

import java.util.List;

import javax.inject.Named;
import javax.ws.rs.BadRequestException;
import javax.ws.rs.NotFoundException;
import javax.ws.rs.PathParam;

import gse1.buergerbusserver.busmanagement.logic.api.Busmanagement;
import gse1.buergerbusserver.busmanagement.logic.api.to.BusEto;
import gse1.buergerbusserver.busmanagement.service.api.rest.BusmanagementRestService;

/**
 * Service class for REST calls in order to execute {@link Busmanagement} tasks
 *
 * @author ricarda
 *
 */

@Named("BusmanagementRestService")
public class BusmanagementRestServiceImpl implements BusmanagementRestService {

  private Busmanagement busManagement;

  @Override
  public List<BusEto> listAllBuses() {

    List<BusEto> allBuses = this.busManagement.findAllBuses();
    return allBuses;
  }

  @Override
  public List<BusEto> listBusesOnLine(@PathParam("lineId") String lineId) {

    long lineIdLong;
    if (lineId == null) {
      throw new BadRequestException("missing line id");
    }
    try {
      lineIdLong = Long.parseLong(lineId);
    } catch (NumberFormatException e) {
      throw new BadRequestException("Line id is not a number");
    } catch (NotFoundException e) {
      throw new BadRequestException("Line not found");
    }
    List<BusEto> lineBuses = this.busManagement.findBusesOnLine(lineIdLong);
    return lineBuses;
  }

}
