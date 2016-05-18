package gse1.buergerbusserver.routemanagement.service.impl.rest;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import gse1.buergerbusserver.routemanagement.logic.api.Routemanagement;
import gse1.buergerbusserver.routemanagement.logic.api.to.RouteEto;
import gse1.buergerbusserver.routemanagement.service.api.rest.RoutemanagementRestService;

/**
 * @author MZEEN
 *
 */
@Named("RoutemanagementRestService")
public class RoutemanagementRestServiceImpl implements RoutemanagementRestService {

  @Inject
  private Routemanagement routemanagement;

  @Override
  public List<RouteEto> getAllRoutes() {

    return this.routemanagement.getAllRoutes();
  }

}