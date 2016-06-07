package gse1.buergerbusserver.linemanagement.logic.api.to;

import java.util.Date;

import org.geojson.LineString;

/**
 * @author MZEEN
 *
 */
public class RouteEto {

  private Long id;

  private LineString route;

  private Date timeStamp;

  /**
   * @return timeStamp
   */

  protected Date getTimeStamp() {

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

  public LineString getRoute() {

    return this.route;
  }

  public void setRoute(LineString route) {

    this.route = route;
  }

}
