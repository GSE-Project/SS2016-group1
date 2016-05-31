package gse1.buergerbusserver.linemanagement.logic.api.to;

import gse1.buergerbusserver.general.common.api.datatype.Gps;

import java.util.Date;
import java.util.List;

/**
 * @author MZEEN
 *
 */
public class RouteEto {

  private Long id;

  private List<Gps> gpsdata;

  private Date timeStamp;

  /**
   * @return gpsdata
   */

  public List<Gps> getGpsData() {

    return this.gpsdata;
  }

  /**
   * @param gpsdata new value of {@link #getgpsdata}.
   */

  public void setGpsData(List<Gps> gpsData) {
   
     this.gpsdata = gpsData;
  }

  /**
   * @return timeStamp
   */

  public Date getTimeStamp() {

    return this.timeStamp;
  }

  /**
   * @param timeStamp new value of {@link #getTimeStamp}.
   */
  public void setTimeStamp(Date timeStamp) {

    this.timeStamp = timeStamp;
  }

  public Long getId() {

    return id;
  }

  public void setId(Long id) {

    this.id = id;
  }

}
