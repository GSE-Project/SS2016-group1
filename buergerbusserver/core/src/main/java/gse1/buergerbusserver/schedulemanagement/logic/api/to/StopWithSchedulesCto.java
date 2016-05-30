package gse1.buergerbusserver.schedulemanagement.logic.api.to;

import gse1.buergerbusserver.general.common.api.datatype.GeoJsonPoint;

import java.util.Date;
import java.util.List;

public class StopWithSchedulesCto extends StopEto {

  private List<ScheduleEto> schedules;
  
  public StopWithSchedulesCto() {
    super();
  }

  public List<ScheduleEto> getSchedules() {

    // List<ScheduleEto> returnlist = new ArrayList<ScheduleEto>();

    // for(ScheduleEto schedule:this.schedules)
    //   returnlist.add(schedule);
    // return returnlist;
    return this.schedules;
  }

  public void setSchedules(List<ScheduleEto> schedules) {

    this.schedules = schedules;
  }

  public GeoJsonPoint getLocation()
  {
    return new GeoJsonPoint(this.lon,this.lat);
  }




}
