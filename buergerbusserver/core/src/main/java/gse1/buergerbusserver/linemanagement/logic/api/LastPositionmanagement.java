package gse1.buergerbusserver.linemanagement.logic.api;

import gse1.buergerbusserver.linemanagement.logic.api.to.LastPositionEto;

/**
 *
 *
 * @author razadfki
 * @since 0.1
 */
public interface LastPositionmanagement {

  /**
   * @param busId busId of the Bus
   * @return Last Position of the Bus with BusId
   */
  public LastPositionEto getLastPosition(Long busId);

  /**
   * @param busId sets the busId
   * @param lon Sets the Longitude of the Last Position
   * @param lat sets the Latitude of the last Position
   */
  void setLastPosition(Long busId, double lon, double lat,int takenSeats);
}
