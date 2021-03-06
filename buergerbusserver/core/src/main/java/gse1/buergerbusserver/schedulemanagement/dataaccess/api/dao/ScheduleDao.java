package gse1.buergerbusserver.schedulemanagement.dataaccess.api.dao;

import java.util.List;

import gse1.buergerbusserver.general.dataaccess.api.dao.ApplicationDao;
import gse1.buergerbusserver.schedulemanagement.dataaccess.api.ScheduleEntity;
import io.oasp.module.jpa.dataaccess.api.MasterDataDao;

/**
 * @author mbaniasad
 *
 */
public interface ScheduleDao extends ApplicationDao<ScheduleEntity>, MasterDataDao<ScheduleEntity> {

  /**
   * @param stopId Reference StopId of the Stop in the Schedule
   * @return Schedules from the specified Stop with StopId
   */
  List<ScheduleEntity> getSchedulesByStopId(Long stopId);

}
