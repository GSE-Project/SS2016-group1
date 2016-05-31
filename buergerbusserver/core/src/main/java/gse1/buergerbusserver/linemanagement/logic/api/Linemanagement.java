package gse1.buergerbusserver.linemanagement.logic.api;

import gse1.buergerbusserver.linemanagement.common.api.Line;
import gse1.buergerbusserver.linemanagement.logic.api.to.BusEto;
import gse1.buergerbusserver.linemanagement.logic.api.to.LineEto;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

/**
 * @author razadfki
 *
 */

public interface Linemanagement {

  public List<LineEto> getAllLines();

  /**
   * Returns a {@link List} of all buses in the system.
   *
   * @return List of {@link BusEto} objects for all buses
   */
  List<BusEto> getAllBuses();

  /**
   * Returns a {@link List} of all buses serving the {@link Line} as given by lineId.
   *
   * @param lineId
   * @return List of {@link BusEto} objects of buses on line lineId.
   */
  List<BusEto> getBusesOnLine(Long lineId);

  public HashMap<String, Object> getAllRoutes();

  public HashMap<String, Object> getAllLinesWithBusIds();

  void updateBusStatus(Long busId, Long lineId);

  HashMap<String, Date> checkUpdate();

  public HashMap<String, Object> getAllBusesListWithTimeStamp();

}
