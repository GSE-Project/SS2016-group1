package gse1.buergerbusserver.lastpositionmanagement.logic.api;

import gse1.buergerbusserver.lastpositionmanagement.logic.api.to.LastPositionEto;

/**
 *
 *
 * @author razadfki
 * @since 0.1
 */
public interface LastPositionmanagement {

  public LastPositionEto getLastPosition(Long busId);
}
