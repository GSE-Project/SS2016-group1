package gse1.buergerbusserver.schedulemanagement.dataaccess.impl.dao;

import java.util.List;

import javax.inject.Named;

import com.mysema.query.alias.Alias;
import com.mysema.query.jpa.impl.JPAQuery;
import com.mysema.query.types.path.EntityPathBase;

import gse1.buergerbusserver.general.dataaccess.base.dao.ApplicationMasterDataDaoImpl;
import gse1.buergerbusserver.schedulemanagement.dataaccess.api.ScheduleEntity;
import gse1.buergerbusserver.schedulemanagement.dataaccess.api.dao.ScheduleDao;

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

  /**
   * @param stopId Reference StopId of the Stop in the Schedule
   * @return Schedules from the specified Stop with StopId
   */
  @Override
  public List<ScheduleEntity> getSchedulesByStopId(Long stopId) {

    //selecting the table for the required results/records
    ScheduleEntity schedule = Alias.alias(ScheduleEntity.class);
    EntityPathBase<ScheduleEntity> alias = Alias.$(schedule);
    JPAQuery query = new JPAQuery(getEntityManager()).from(alias);

    //providing the criteria
    query.where(Alias.$(schedule.getStopId()).eq(stopId));

    //returning the list of the records
    return query.list(alias);
  }

  // for more see https://github.com/oasp-forge/oasp4j-wiki/wiki/guide-dataaccess-layer#queries
  // AND
  // https://github.com/oasp-forge/oasp4j-wiki/wiki/guide-dataaccess-layer#dynamic-queries

}
