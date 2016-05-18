package gse1.buergerbusserver.lastpositionmanagement.dataaccess.api.dao;

import gse1.buergerbusserver.general.dataaccess.api.dao.ApplicationDao;
import gse1.buergerbusserver.lastpositionmanagement.dataaccess.api.LastPositionEntity;
import io.oasp.module.jpa.dataaccess.api.MasterDataDao;

/**
 * @author razadfki
 *
 */
public interface LastPositionDao extends ApplicationDao<LastPositionEntity>, MasterDataDao<LastPositionEntity> {

  LastPositionEntity getLastPosition(Long busId);
}
