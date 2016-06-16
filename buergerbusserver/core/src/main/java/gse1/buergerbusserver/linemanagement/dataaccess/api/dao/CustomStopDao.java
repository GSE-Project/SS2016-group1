package gse1.buergerbusserver.linemanagement.dataaccess.api.dao;

import java.util.Date;
import java.util.List;

import gse1.buergerbusserver.general.dataaccess.api.dao.ApplicationDao;
import gse1.buergerbusserver.linemanagement.common.api.CustomStop;
import gse1.buergerbusserver.linemanagement.common.api.Line;
import gse1.buergerbusserver.linemanagement.dataaccess.api.CustomStopEntity;
import io.oasp.module.jpa.dataaccess.api.MasterDataDao;

/**
 * {@link ApplicationDao Data Access Object} for {@link CustomStopEntity} entity.
 *
 * @author Sriramk88
 *
 */
public interface CustomStopDao extends ApplicationDao<CustomStopEntity>, MasterDataDao<CustomStopEntity> {

  /**
   * Returns a list of all {@link CustomStopEntity} pending {@link CustomStop} as given by requestId and deviceId (For
   * Citizen)
   *
   * @param requestId
   * @param deviceId
   * @return {@link List} of Custom Stop requests pending for the request ID and device ID
   **/
  List<CustomStopEntity> getCustomStopStatus(Long requestId, String deviceId);

  /**
   * Returns a list of all {@link CustomStopEntity} pending {@link CustomStop} as given by deviceId (For Citizen)
   *
   * @param deviceId
   * @return {@link List} of Custom Stop requests pending for the device ID
   **/
  List<CustomStopEntity> getCustomStopDevice(String deviceId);

  /**
   * Returns a list of all {@link CustomStopEntity} pending {@link Line} as given by lineId (For Driver)
   *
   * @param lineId
   * @return {@link List} of Custom Stop requests pending for the device ID
   **/
  List<CustomStopEntity> getCustomStopLine(Long lineId);

  /**
   * Returns a list of all {@link CustomStopEntity} for {@link CustomStop} as given by Status (For Driver/Citizen)
   *
   * @param status
   * @return {@link List} of Custom Stop requests in that status (1 - Accepted, 2 - Declined, 3 - Pending, 4 -
   *         Completed, 5 - Cancelled) Not really needed right now...
   **/
  List<CustomStopEntity> getCustomStopRequests(int status);

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
   * @param lineId
   * @param pickUpTime
   * @param lat
   * @param lon
   * @param numberOfPersons
   * @param deviceId
   * @param userName
   * @param userAddress
   * @param userAssistance
   *
   * @param status
   * @param requestId
   * @return {@link List} of Custom Stop requests pending for the device ID
   **/
  Long newCustomStop(Long lineId, Date pickUpTime, double lat, double lon, int numberOfPersons,
      String deviceId, String userName, String userAddress, List<Integer> userAssistance);

  /**
   * get the last updated timeStamp in {@link CustomStopEntity}
   *
   * @return Date
   */
  Date lastUpdate();

}
