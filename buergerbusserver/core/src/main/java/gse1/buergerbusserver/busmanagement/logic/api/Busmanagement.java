package gse1.buergerbusserver.busmanagement.logic.api;

import java.util.List;

import gse1.buergerbusserver.busmanagement.logic.api.to.BusEto;
import gse1.buergerbusserver.linemanagement.common.api.Line;

/**
 * Interface for the Busmanagement component.
 *
 * @author ricarda
 *
 */
public interface Busmanagement {

  // TODO: Check methods required by clients, create them

  /**
   * Returns a {@link List} of all buses in the system.
   *
   * @return List of {@link BusEto} objects for all buses
   */
  List<BusEto> findAllBuses();

  /**
   * Returns a {@link List} of all buses serving the {@link Line} as given by lineId.
   *
   * @param lineId
   * @return List of {@link BusEto} objects of buses on line lineId.
   */
  List<BusEto> findBusesOnLine(Long lineId);

}
