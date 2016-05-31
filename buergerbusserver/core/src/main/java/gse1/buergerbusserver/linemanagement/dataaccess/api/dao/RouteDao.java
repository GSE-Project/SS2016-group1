package gse1.buergerbusserver.linemanagement.dataaccess.api.dao;

import java.util.Date;

import gse1.buergerbusserver.general.dataaccess.api.dao.ApplicationDao;
import gse1.buergerbusserver.linemanagement.dataaccess.api.RouteEntity;
import io.oasp.module.jpa.dataaccess.api.MasterDataDao;

/**
 * @author MZEEN
 *
 */
public interface RouteDao extends ApplicationDao<RouteEntity>, MasterDataDao<RouteEntity> {
  /**
   * get the last updated timestamp in {@link RouteEntity}
   * @return Date
   */
  Date lastUpdate();
}
