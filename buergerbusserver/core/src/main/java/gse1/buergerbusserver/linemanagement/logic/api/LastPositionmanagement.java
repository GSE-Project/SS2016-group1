package gse1.buergerbusserver.linemanagement.logic.api;

import gse1.buergerbusserver.linemanagement.logic.api.to.LastPositionEto;

/**
 *
 *
 * @author razadfki
 * @since 0.1
 */
public interface LastPositionmanagement {

  public LastPositionEto getLastPosition(Long busId);

  void setLastPosition(Long busId, double lon, double lat);
}
