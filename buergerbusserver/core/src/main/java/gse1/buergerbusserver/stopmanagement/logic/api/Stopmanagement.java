package gse1.buergerbusserver.stopmanagement.logic.api;

import java.util.List;

import gse1.buergerbusserver.stopmanagement.logic.api.to.StopEto;

/**
 * TODO mbrunnli This type ...
 *
 * @author mbrunnli
 * @since 0.1
 */
public interface Stopmanagement {

  public List<StopEto> getAllStops();
}
