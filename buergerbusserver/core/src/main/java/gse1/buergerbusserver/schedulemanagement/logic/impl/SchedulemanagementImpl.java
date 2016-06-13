package gse1.buergerbusserver.schedulemanagement.logic.impl;

import java.util.HashMap;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;
import javax.transaction.Transactional;

import org.springframework.stereotype.Component;

import gse1.buergerbusserver.general.logic.base.AbstractComponentFacade;
import gse1.buergerbusserver.schedulemanagement.dataaccess.api.ScheduleEntity;
import gse1.buergerbusserver.schedulemanagement.dataaccess.api.dao.ScheduleDao;
import gse1.buergerbusserver.schedulemanagement.dataaccess.api.dao.StopDao;
import gse1.buergerbusserver.schedulemanagement.logic.api.Schedulemanagement;
import gse1.buergerbusserver.schedulemanagement.logic.api.to.ScheduleEto;
import gse1.buergerbusserver.schedulemanagement.logic.api.to.StopEto;
import gse1.buergerbusserver.schedulemanagement.logic.api.to.StopWithSchedulesCto;

/**
 *
 *
 * @author mbrunnli
 * @since 0.1
 */
@Named
@Component
@Transactional
public class SchedulemanagementImpl extends AbstractComponentFacade implements Schedulemanagement {

  @Inject
  private StopDao stopDao;

  @Inject
  private ScheduleDao ScheduleDao;

  /**
   * Returns a {@link List} of all Stops in the Schedule.
   *
   * @return List of Stops in the Schedule
   */
  @Override
  public List<StopEto> getAllStops() {

    return getBeanMapper().mapList(this.stopDao.findAll(), StopEto.class);
  }

  /**
   * Returns a {@link List} of schedules .
   *
   * @return List of {@link ScheduleEto} objects for Schedules
   */
  @Override
  public List<ScheduleEto> getAllSchedules() {

    return getBeanMapper().mapList(this.ScheduleDao.findAll(), ScheduleEto.class);
  }

  /**
   * Returns a {@link List} of all Stops with Schedules .
   *
   * @return List of {@link StopWithSchedulesCto} objects for Stops in the Schedule
   */
  @Override
  public HashMap<String, Object> getAllStopsWithSchedules() {

    List<StopWithSchedulesCto> stopCtoList =
        getBeanMapper().mapList(this.stopDao.findAll(), StopWithSchedulesCto.class);
    for (StopWithSchedulesCto stopCto : stopCtoList) {
      List<ScheduleEntity> schedules = this.ScheduleDao.getSchedulesByStopId(stopCto.getId());
      stopCto.setSchedule(getBeanMapper().mapList(schedules, ScheduleEto.class));
    }

    HashMap<String, Object> returnHash = new HashMap<>();
    returnHash.put("timeStamp", this.stopDao.lastUpdate());
    returnHash.put("stops", stopCtoList);
    return returnHash;

  }

}
