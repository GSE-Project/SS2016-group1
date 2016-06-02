package gse1.buergerbusserver.schedulemanagement.logic.api.to;

import gse1.buergerbusserver.general.common.api.datatype.GeoJsonPoint;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class StopWithSchedulesCto extends StopEto {

  private List<ScheduleEto> schedule;

  public StopWithSchedulesCto() {
    super();
  }

  public List<ScheduleEto> getSchedule() {

    // List<ScheduleEto> returnlist = new ArrayList<ScheduleEto>();

    // for(ScheduleEto schedule:this.schedules)
    //   returnlist.add(schedule);
    // return returnlist;
    return this.schedule;
  }

  public ArrayList<HashMap> getLines(){
    ArrayList<HashMap> retVal = new ArrayList<HashMap>();
    HashMap<String, String> obj = new HashMap<String, String>();

    for(ScheduleEto sch:this.getSchedule()){
      obj.put("id", sch.getLineId().toString());
    }
    retVal.add(obj);
    return retVal;
  }
  public void setSchedule(List<ScheduleEto> schedule) {

    this.schedule = schedule;
  }

  public GeoJsonPoint getLocation()
  {
    return new GeoJsonPoint(this.lon,this.lat);
  }




}
