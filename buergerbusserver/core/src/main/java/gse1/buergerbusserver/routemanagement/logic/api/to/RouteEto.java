package gse1.buergerbusserver.routemanagement.logic.api.to;

import java.util.Date;

/**
 * @author MZEEN
 *
 */
public class RouteEto {

  private Long id;

  private String gpsdata;

  private Date timeStamp;

  /**
   * @return gpsdata
   */

  public String getGpsData() {

    return this.gpsdata;
  }

  /**
   * @param gpsdata new value of {@link #getgpsdata}.
   */

  public void setGpsData(String gpsData) {

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
