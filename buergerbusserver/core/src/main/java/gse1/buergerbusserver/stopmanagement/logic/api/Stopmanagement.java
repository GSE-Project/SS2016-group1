package gse1.buergerbusserver.stopmanagement.logic.api;

import gse1.buergerbusserver.stopmanagement.logic.api.to.StopEto;

import java.util.List;

/**
 * TODO mbrunnli This type ...
 *
 * @author mbrunnli
 * @since 0.1
 */
public interface Stopmanagement {

  public List<StopEto> listAllStops();
}
