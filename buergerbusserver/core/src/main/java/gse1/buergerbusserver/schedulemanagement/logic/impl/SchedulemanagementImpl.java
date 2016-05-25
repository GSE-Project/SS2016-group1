package gse1.buergerbusserver.schedulemanagement.logic.impl;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;
import javax.transaction.Transactional;

import org.springframework.stereotype.Component;

import gse1.buergerbusserver.general.logic.base.AbstractComponentFacade;
import gse1.buergerbusserver.schedulemanagement.dataaccess.api.dao.StopDao;
import gse1.buergerbusserver.schedulemanagement.dataaccess.api.dao.ScheduleDao;
import gse1.buergerbusserver.schedulemanagement.logic.api.Schedulemanagement;
import gse1.buergerbusserver.schedulemanagement.logic.api.to.StopEto;
import gse1.buergerbusserver.schedulemanagement.logic.api.to.ScheduleEto;

/**
 * TODO mbrunnli This type ...
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

  @Override
  public List<StopEto> getAllStops() {

    return getBeanMapper().mapList(this.stopDao.findAll(), StopEto.class);
  }

  @Override
  public List<ScheduleEto> getAllSchedules() {

    return getBeanMapper().mapList(this.ScheduleDao.findAll(), ScheduleEto.class);
  }
}