package gse1.buergerbusserver.schedulemanagement.service.impl.rest;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import gse1.buergerbusserver.schedulemanagement.logic.api.Schedulemanagement;
import gse1.buergerbusserver.schedulemanagement.logic.api.to.ScheduleEto;
import gse1.buergerbusserver.schedulemanagement.logic.api.to.StopEto;
import gse1.buergerbusserver.schedulemanagement.service.api.rest.SchedulemanagementRestService;

/**
 * TODO mbaniasad This type ...
 *
 * @author mbaniasad
 * @since 0.1
 */
@Named("StopmanagementRestService")
public class SchedulemanagementRestServiceImpl implements SchedulemanagementRestService {

  @Inject
  private Schedulemanagement schedulemanagement;

  @Override
  public List<StopEto> getAllStops() {

    return this.schedulemanagement.getAllStops();
  }
  
  @Override
  public List<ScheduleEto> getAllSchedules() {

    return this.schedulemanagement.getAllSchedules();
  }
}
