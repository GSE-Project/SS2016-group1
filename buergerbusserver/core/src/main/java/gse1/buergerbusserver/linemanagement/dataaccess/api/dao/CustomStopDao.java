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
  List<CustomStopEntity> getCustomStopLine(Long lineId, Long busId);

  /**
   * Returns a list of all {@link CustomStopEntity} for {@link CustomStop} as given by Status (For Driver/Citizen)
   *
   * @param requestId ID of the custom stop request
   *
   * @param status
   * @return {@link List} of Custom Stop requests in that status (1 - Accepted, 2 - Declined, 3 - Pending, 4 -
   *         Completed, 5 - Cancelled) Not really needed right now...
   **/
  List<CustomStopEntity> getCustomStopRequests(Long requestId);

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
   * @param location
   * @param numberOfPersons
   * @param deviceId
   * @param info
   * @param status
   * @return {@link List} of Custom Stop requests pending for the device ID
   **/
  Long newCustomStopTransaction(Long lineId, Date pickUpTime, String location, int numberOfPersons, String deviceId,
      String info);

  /**
   * get the last updated timeStamp in {@link CustomStopEntity}
   *
   * @return Date
   */
  Date lastUpdate();

}
