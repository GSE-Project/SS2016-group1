package gse1.buergerbusserver.schedulemanagement.dataaccess.impl.dao;

import java.util.List;

import gse1.buergerbusserver.general.dataaccess.base.dao.ApplicationMasterDataDaoImpl;
import gse1.buergerbusserver.linemanagement.dataaccess.api.BusEntity;
import gse1.buergerbusserver.schedulemanagement.dataaccess.api.ScheduleEntity;
import gse1.buergerbusserver.schedulemanagement.dataaccess.api.StopEntity;
import gse1.buergerbusserver.schedulemanagement.dataaccess.api.dao.ScheduleDao;
import gse1.buergerbusserver.schedulemanagement.logic.api.to.ScheduleEto;

import javax.inject.Named;

import com.mysema.query.alias.Alias;
import com.mysema.query.jpa.impl.JPAQuery;
import com.mysema.query.types.path.EntityPathBase;

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

  @Override
  public List<ScheduleEntity> getSchedulesByStopId(Long stopId) {
    
    ScheduleEntity schedule = Alias.alias(ScheduleEntity.class);
    EntityPathBase<ScheduleEntity> alias = Alias.$(schedule);
    JPAQuery query = new JPAQuery(getEntityManager()).from(alias);

    query.where(Alias.$(schedule.getStopId()).eq(stopId));

    return query.list(alias);
  }

 
  // for more see https://github.com/oasp-forge/oasp4j-wiki/wiki/guide-dataaccess-layer#queries
  // AND
  // https://github.com/oasp-forge/oasp4j-wiki/wiki/guide-dataaccess-layer#dynamic-queries

}

