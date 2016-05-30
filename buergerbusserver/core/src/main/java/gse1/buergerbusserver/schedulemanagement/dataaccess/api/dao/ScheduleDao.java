package gse1.buergerbusserver.schedulemanagement.dataaccess.api.dao;

import java.util.List;

import gse1.buergerbusserver.general.dataaccess.api.dao.ApplicationDao;
import gse1.buergerbusserver.schedulemanagement.dataaccess.api.ScheduleEntity;
import gse1.buergerbusserver.schedulemanagement.dataaccess.api.StopEntity;
import gse1.buergerbusserver.schedulemanagement.logic.api.to.ScheduleEto;
import io.oasp.module.jpa.dataaccess.api.MasterDataDao;

/**
 * @author mbaniasad
 *
 */
public interface ScheduleDao extends ApplicationDao<ScheduleEntity>, MasterDataDao<ScheduleEntity> {

  List<ScheduleEntity> getSchedulesByStopId (Long stopId);

}
