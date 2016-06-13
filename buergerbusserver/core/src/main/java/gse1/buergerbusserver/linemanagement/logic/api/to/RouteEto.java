package gse1.buergerbusserver.linemanagement.logic.api.to;

import java.util.Date;

import org.geojson.LineString;

/**
 * @author JAYU
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

  /**
   * @return Id
   */

  public Long getId() {

    return this.id;
  }

  /**
   * @param id new value of {@link #getId}.
   */

  public void setId(Long id) {

    this.id = id;
  }

  /**
   * @return Route
   */
  public LineString getRoute() {

    return this.route;
  }

  /**
   * @param route new value of {@link #getRoute}.
   */
  public void setRoute(LineString route) {

    this.route = route;
  }

}
