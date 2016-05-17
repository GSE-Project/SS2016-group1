package gse1.buergerbusserver.stopmanagement.dataaccess.api.impl.dao;

import gse1.buergerbusserver.general.dataaccess.base.dao.ApplicationMasterDataDaoImpl;
import gse1.buergerbusserver.stopmanagement.dataaccess.api.StopEntity;
import gse1.buergerbusserver.stopmanagement.dataaccess.api.dao.StopDao;

import javax.inject.Named;

/**
 * @author mbaniasad
 *
 */
@Named
public class StopDaoImpl extends ApplicationMasterDataDaoImpl<StopEntity> implements StopDao {

  @Override
  protected Class<StopEntity> getEntityClass() {

    return StopEntity.class;
  }

  // for more see https://github.com/oasp-forge/oasp4j-wiki/wiki/guide-dataaccess-layer#queries
  // AND
  // https://github.com/oasp-forge/oasp4j-wiki/wiki/guide-dataaccess-layer#dynamic-queries

}

