package gse1.buergerbusserver.linemanagement.logic.api;

import java.util.List;

import gse1.buergerbusserver.linemanagement.logic.api.to.LineEto;

/**
 * @author razadfki
 *
 */

public interface Linemanagement {

  public List<LineEto> getAllLines();
}
