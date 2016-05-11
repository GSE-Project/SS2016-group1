package gse1.buergerbusserver.linemanagement.service.impl.rest;

import gse1.buergerbusserver.linemanagement.logic.api.Linemanagement;
import gse1.buergerbusserver.linemanagement.logic.api.to.LineEto;
import gse1.buergerbusserver.linemanagement.service.api.rest.LinemanagementRestService;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

/**
 * TODO mbrunnli This type ...
 *
 * @author mbrunnli
 * @since 0.1
 */
@Named("LinemanagementRestService")
public class LinemanagementRestServiceImpl implements LinemanagementRestService {

  @Inject
  private Linemanagement linemanagement;

  @Override
  public List<LineEto> listAllLines() {

    return this.linemanagement.listAllLines();
  }
}
