package gse1.buergerbusserver.schedulemanagement.dataaccess.impl.dao;

import gse1.buergerbusserver.general.dataaccess.base.dao.ApplicationMasterDataDaoImpl;
import gse1.buergerbusserver.schedulemanagement.dataaccess.api.ScheduleEntity;
import gse1.buergerbusserver.schedulemanagement.dataaccess.api.StopEntity;
import gse1.buergerbusserver.schedulemanagement.dataaccess.api.dao.ScheduleDao;

import javax.inject.Named;

/**
 * @author mbaniasad
 *
 */
@Named
public class ScheduleDaoImpl extends ApplicationMasterDataDaoImpl<ScheduleEntity> implements ScheduleDao {

  @Override
  protected Class<ScheduleEntity> getEntityClass() {

    return ScheduleEntity.class;
  }

  // for more see https://github.com/oasp-forge/oasp4j-wiki/wiki/guide-dataaccess-layer#queries
  // AND
  // https://github.com/oasp-forge/oasp4j-wiki/wiki/guide-dataaccess-layer#dynamic-queries

}

