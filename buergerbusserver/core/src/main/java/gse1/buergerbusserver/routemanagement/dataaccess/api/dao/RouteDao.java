package gse1.buergerbusserver.routemanagement.dataaccess.api.dao;

import gse1.buergerbusserver.general.dataaccess.api.dao.ApplicationDao;
import gse1.buergerbusserver.routemanagement.dataaccess.api.RouteEntity;
import io.oasp.module.jpa.dataaccess.api.MasterDataDao;

/**
 * @author MZEEN
 *
 */
public interface RouteDao extends ApplicationDao<RouteEntity>, MasterDataDao<RouteEntity> {

}
