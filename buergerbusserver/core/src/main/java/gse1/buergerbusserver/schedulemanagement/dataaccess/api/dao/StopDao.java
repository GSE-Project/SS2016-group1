package gse1.buergerbusserver.schedulemanagement.dataaccess.api.dao;

import gse1.buergerbusserver.general.dataaccess.api.dao.ApplicationDao;
import gse1.buergerbusserver.schedulemanagement.dataaccess.api.StopEntity;
import io.oasp.module.jpa.dataaccess.api.MasterDataDao;

/**
 * @author mbaniasad
 *
 */
public interface StopDao extends ApplicationDao<StopEntity>, MasterDataDao<StopEntity> {

}