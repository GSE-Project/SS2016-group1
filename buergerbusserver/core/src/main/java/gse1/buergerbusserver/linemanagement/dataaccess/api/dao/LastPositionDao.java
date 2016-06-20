package gse1.buergerbusserver.linemanagement.dataaccess.api.dao;

import gse1.buergerbusserver.general.dataaccess.api.dao.ApplicationDao;
import gse1.buergerbusserver.linemanagement.dataaccess.api.LastPositionEntity;
import io.oasp.module.jpa.dataaccess.api.MasterDataDao;

/**
 * * {@link ApplicationDao Data Access Object} for {@link LastPositionEntity} entity
 *
 * @author razadfki
 *
 */
public interface LastPositionDao extends ApplicationDao<LastPositionEntity>, MasterDataDao<LastPositionEntity> {

  /**
   * get the last Position of Bus in {@link LastPositionEntity}
   * 
   * @param busId sets the busId of the Bus
   *
   * @return busId with the Last Position of the Bus
   */
  LastPositionEntity getLastPosition(Long busId);

  /**
   *
   * @param busId Sets the busId of the Bus
   * @param lon Sets the Longitude of the Last position
   * @param lat Sets the Latitude of the Last position
   */
  void setLastPosition(Long busId, double lon, double lat, int takenSeats);
}
