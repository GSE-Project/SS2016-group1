package gse1.buergerbusserver.stopmanagement.service.impl.rest;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import gse1.buergerbusserver.stopmanagement.logic.api.Stopmanagement;
import gse1.buergerbusserver.stopmanagement.logic.api.to.StopEto;
import gse1.buergerbusserver.stopmanagement.service.api.rest.StopmanagementRestService;

/**
 * TODO mbaniasad This type ...
 *
 * @author mbaniasad
 * @since 0.1
 */
@Named("StopmanagementRestService")
public class StopmanagementRestServiceImpl implements StopmanagementRestService {

  @Inject
  private Stopmanagement stopmanagement;

  @Override
  public List<StopEto> getAllStops() {

    return this.stopmanagement.getAllStops();
  }
}
