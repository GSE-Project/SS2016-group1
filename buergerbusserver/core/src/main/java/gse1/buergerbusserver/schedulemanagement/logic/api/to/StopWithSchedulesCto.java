package gse1.buergerbusserver.schedulemanagement.logic.api.to;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import gse1.buergerbusserver.general.common.api.datatype.GeoJsonPoint;

/**
 * Composite transfer object, defined where mesh of two object values are required.
 * in this case, stop and schedule is meshing.
 * 
 * @author JAYU
 *
 */

public class StopWithSchedulesCto extends StopEto {

  private List<ScheduleEto> schedule;

  /**
   * The constructor.
   */
  public StopWithSchedulesCto() {
    super();
  }

  /**
   * @return List of Schedule
   */
  public List<ScheduleEto> getSchedule() {

    // List<ScheduleEto> returnlist = new ArrayList<ScheduleEto>();

    // for(ScheduleEto schedule:this.schedules)
    // returnlist.add(schedule);
    // return returnlist;
    return this.schedule;
  }

  /**
   * @return {@link HashMap} of all Lines
   */

  @SuppressWarnings({ "rawtypes", "unused" })
  public ArrayList<HashMap> getLines() {

    ArrayList<HashMap> retVal = new ArrayList<HashMap>();
    HashMap<String, String> obj = new HashMap<String, String>();

    for (ScheduleEto sch : getSchedule()) {
      obj.put("id", sch.getLineId().toString());
    }
    retVal.add(obj);
    return retVal;
  }

  /**
   * @param schedule Sets the Schedule
   */
  public void setSchedule(List<ScheduleEto> schedule) {

    this.schedule = schedule;
  }

  /**
   * @return the location of the Bus with latitude and Longitude
   */
  public GeoJsonPoint getLocation() {

    return new GeoJsonPoint(this.lon, this.lat);
  }

}
