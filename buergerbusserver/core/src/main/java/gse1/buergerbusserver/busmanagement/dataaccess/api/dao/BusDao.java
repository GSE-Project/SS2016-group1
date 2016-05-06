package gse1.buergerbusserver.busmanagement.dataaccess.api.dao;

import gse1.buergerbusserver.busmanagement.dataaccess.api.BusEntity;
import gse1.buergerbusserver.general.dataaccess.api.dao.ApplicationDao;
import io.oasp.module.jpa.dataaccess.api.MasterDataDao;

/**
 * @author gse01
 *
 */
public interface BusDao extends ApplicationDao<BusEntity>, MasterDataDao<BusEntity> {

}
