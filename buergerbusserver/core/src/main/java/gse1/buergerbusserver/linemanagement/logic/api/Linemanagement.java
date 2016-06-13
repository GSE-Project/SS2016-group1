package gse1.buergerbusserver.linemanagement.logic.api;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

import gse1.buergerbusserver.linemanagement.common.api.Line;
import gse1.buergerbusserver.linemanagement.dataaccess.api.BusEntity;
import gse1.buergerbusserver.linemanagement.logic.api.to.BusEto;
import gse1.buergerbusserver.linemanagement.logic.api.to.LastPositionEto;
import gse1.buergerbusserver.linemanagement.logic.api.to.LineEto;
import gse1.buergerbusserver.linemanagement.logic.api.to.RouteEto;

/**
 * @author razadfki
 *
 */

public interface Linemanagement {

  /**
   * Returns a {@link List} of all Lines in the system.
   *
   * @return List of Lines
   */
  public List<LineEto> getAllLines();

  /**
   * Returns a {@link List} of all buses in the system.
   *
   * @return List of {@link BusEto} objects for all buses
   */
  List<BusEto> getAllBuses();

  /**
   * Returns a list of all {@link BusEntity} serving the {@link Line} as given by lineId
   *
   * @param lineId
   * @return {@link List} of buses serving line with given lineId
   */
  List<BusEto> getBusesOnLine(Long lineId);

  /**
   * Returns a {@link List} of all routes in the system.
   *
   * @return List of {@link RouteEto} objects for all routes
   */
  public HashMap<String, Object> getAllRoutes();

  /**
   * Returns a {@link List} of all Lines with busIds in the system.
   *
   * @return List of Lines having BusIds
   */
  public HashMap<String, Object> getAllLinesWithBusIds();

  /**
   * update the {@link BusEntity} serving the new {@link Line}
   *
   * @param busId require to perform update against
   * @param lineId to update
   */
  void updateBusStatus(Long busId, Long lineId);

  /**
   * @return Date
   */
  HashMap<String, Date> checkUpdate();

  /**
   * @return List of all buses with TimeStamps
   */
  public HashMap<String, Object> getAllBusesListWithTimeStamp();

  /**
   * Returns the Last Position of the Bus with given BusId
   *
   * @param busId reference BusId of the Bus
   *
   * @return Last Position of the Bus of buses serving line with given lineId
   */

  public LastPositionEto getLastPosition(Long busId);

  /**
   * @param busId Sets the busId
   * @param lon sets the Longitude of the Last Position of bus
   * @param lat Sets the Latitude of the last position of bus
   */
  void setLastPosition(Long busId, double lon, double lat);

}
