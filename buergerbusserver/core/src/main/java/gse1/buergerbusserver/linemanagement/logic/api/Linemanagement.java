package gse1.buergerbusserver.linemanagement.logic.api;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

import gse1.buergerbusserver.linemanagement.common.api.CustomStop;
import gse1.buergerbusserver.linemanagement.common.api.Line;
import gse1.buergerbusserver.linemanagement.dataaccess.api.BusEntity;
import gse1.buergerbusserver.linemanagement.dataaccess.api.CustomStopEntity;
import gse1.buergerbusserver.linemanagement.logic.api.to.BusEto;
import gse1.buergerbusserver.linemanagement.logic.api.to.CustomStopEto;
import gse1.buergerbusserver.linemanagement.logic.api.to.LastPositionEto;
import gse1.buergerbusserver.linemanagement.logic.api.to.LineEto;
import gse1.buergerbusserver.linemanagement.logic.api.to.RouteEto;

/**
 * @author JAYU
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
   * @param takenSeats number of seats taken
   */
  void setLastPosition(Long busId, double lon, double lat, int takenSeats);

  /**
   * Returns a list of all {@link CustomStopEntity} pending {@link CustomStop} as given by requestId and deviceId (For
   * Citizen)
   *
   * @param requestId
   * @param deviceId
   * @return {@link List} of Custom Stop requests pending for the request ID and device ID
   **/
  CustomStopEto getCustomStopStatus(Long requestId, String deviceId);

  /**
   * Returns a list of all {@link CustomStopEntity} pending {@link CustomStop} as given by deviceId (For Citizen)
   *
   * @param deviceId
   * @return {@link List} of Custom Stop requests pending for the device ID
   **/
  List<CustomStopEto> getCustomStopDevice(String deviceId);

  /**
   * Returns a list of all {@link CustomStopEntity} pending {@link Line} as given by lineId (For Driver)
   *
   * @param lineId
   * @return {@link List} of Custom Stop requests pending for the device ID
   **/
  List<CustomStopEto> getCustomStopLine(Long lineId);

  /**
   * Returns a list of all {@link CustomStopEntity} for {@link CustomStop} as given by Status (For Driver/Citizen)
   *
   * @param status
   * @return {@link List} of Custom Stop requests in that status (1 - Accepted, 2 - Declined, 3 - Pending, 4 -
   *         Completed, 5 - Cancelled) Not really needed right now...
   **/
  List<CustomStopEto> getCustomStopRequests(int status);

  /**
   * Update the status of the {@link CustomStopEntity} request for {@link CustomStop} as given by request ID
   *
   * @param status
   * @param requestId
   **/
  void updateCustomStopStatus(Long requestId, int status);

  /**
   * Update the status of the {@link CustomStopEntity} request for {@link CustomStop} as given by request ID
   *
   * @param lineId LineId reference of the Line
   * @param pickUpTime PickUpTime from the Custom Stop
   * @param lat Latitude of the Custom Stop
   * @param lon Longitude of the Custom Stop
   * @param numberOfPersons Number of Persons requested the custom Stop
   * @param deviceId devideId of the Person who requested the custom Stop
   * @param userName Unique name of the person requesting custom stop
   * @param userAddress User address of the person requesting custom stop
   * @param userAssistance List of User assistance available
   *
   * @return {@link List} of Custom Stop requests pending for the device ID
   **/
  public Long newCustomStop(Long lineId, Date pickUpTime, double lat, double lon, int numberOfPersons, String deviceId,
      String userName, String userAddress, List<Integer> userAssistance);

  /**
   * @param customStop CustomStopEto object
   * @return All information for that request
   */
  public CustomStopEto newCustomStopE(CustomStopEto customStop);

}
