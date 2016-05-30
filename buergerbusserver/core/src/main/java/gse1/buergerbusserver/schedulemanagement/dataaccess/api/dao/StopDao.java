package gse1.buergerbusserver.schedulemanagement.dataaccess.api.dao;

import java.util.Date;

import gse1.buergerbusserver.general.dataaccess.api.dao.ApplicationDao;
import gse1.buergerbusserver.linemanagement.dataaccess.api.LineEntity;
import gse1.buergerbusserver.schedulemanagement.dataaccess.api.StopEntity;
import io.oasp.module.jpa.dataaccess.api.MasterDataDao;

/**
 * @author mbaniasad
 *
 */
public interface StopDao extends ApplicationDao<StopEntity>, MasterDataDao<StopEntity> {

  /**
   * get the last updated timestamp in {@link StopEntity}
   * @return Date
   */
  Date lastUpdate();
}
