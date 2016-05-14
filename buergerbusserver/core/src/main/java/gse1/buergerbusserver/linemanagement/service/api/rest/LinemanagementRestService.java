package gse1.buergerbusserver.linemanagement.service.api.rest;

import java.util.List;

import gse1.buergerbusserver.linemanagement.logic.api.to.LineEto;

/**
 * @author ahsan
 *
 */
public interface LinemanagementRestService {

  public List<LineEto> getAllLines();
}
