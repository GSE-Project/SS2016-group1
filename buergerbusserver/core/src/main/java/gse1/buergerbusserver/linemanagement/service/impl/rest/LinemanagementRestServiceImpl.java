package gse1.buergerbusserver.linemanagement.service.impl.rest;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;
import javax.ws.rs.BadRequestException;
import javax.ws.rs.NotFoundException;
import javax.ws.rs.PathParam;

import gse1.buergerbusserver.linemanagement.logic.api.Linemanagement;
import gse1.buergerbusserver.linemanagement.logic.api.to.BusEto;
import gse1.buergerbusserver.linemanagement.logic.api.to.LineEto;
import gse1.buergerbusserver.linemanagement.logic.api.to.RouteEto;
import gse1.buergerbusserver.linemanagement.service.api.rest.LinemanagementRestService;

/**
 * @author razadfki
 *
 */
@Named("LinemanagementRestService")
public class LinemanagementRestServiceImpl implements LinemanagementRestService {
  @Inject
  private Linemanagement linemanagement;

  @Override
  public List<LineEto> getAllLines() {

    try {
      return this.linemanagement.getAllLines();
    } catch (Exception e) {
      System.out.println("Exception:" + e.getMessage());
      e.printStackTrace();
      return null;
    }
  }

  @Override
  public List<BusEto> listAllBuses() {

    try {
      return this.linemanagement.findAllBuses();
    } catch (Exception e) {
      System.out.println("Exception:" + e.getMessage());
      e.printStackTrace();
      return null;
    }
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
    List<BusEto> lineBuses = this.linemanagement.findBusesOnLine(lineIdLong);
    return lineBuses;
  }
  
  @Override
  public List<RouteEto> getAllRoutes() {

    return this.linemanagement.getAllRoutes();
  }
}
