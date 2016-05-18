package gse1.buergerbusserver.linemanagement.dataaccess.impl.dao;

import javax.inject.Named;

import gse1.buergerbusserver.general.dataaccess.base.dao.ApplicationMasterDataDaoImpl;
import gse1.buergerbusserver.linemanagement.dataaccess.api.RouteEntity;
import gse1.buergerbusserver.linemanagement.dataaccess.api.dao.RouteDao;

/**
 * @author MZEEN
 *
 */
@Named
public class RouteDaoImpl extends ApplicationMasterDataDaoImpl<RouteEntity> implements RouteDao {

  @Override
  protected Class<RouteEntity> getEntityClass() {

    return RouteEntity.class;
  }

}
