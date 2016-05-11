package gse1.buergerbusserver.linemanagement.dataaccess.api.impl.dao;

import gse1.buergerbusserver.general.dataaccess.base.dao.ApplicationMasterDataDaoImpl;
import gse1.buergerbusserver.linemanagement.dataaccess.api.LineEntity;
import gse1.buergerbusserver.linemanagement.dataaccess.api.dao.LineDao;

import javax.inject.Named;

/**
 * @author razadfki
 *
 */
@Named
public class LineDaoImpl extends ApplicationMasterDataDaoImpl<LineEntity> implements LineDao {

  @Override
  protected Class<LineEntity> getEntityClass() {

    return LineEntity.class;
  }

  // for more see https://github.com/oasp-forge/oasp4j-wiki/wiki/guide-dataaccess-layer#queries
  // AND
  // https://github.com/oasp-forge/oasp4j-wiki/wiki/guide-dataaccess-layer#dynamic-queries

}
