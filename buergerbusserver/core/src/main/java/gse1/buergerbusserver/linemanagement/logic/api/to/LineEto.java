package gse1.buergerbusserver.linemanagement.logic.api.to;

import java.util.Date;

/**
 * @author razadfki
 *
 */
public class LineEto {
  private long id;

  private String name;

  private Long routeId;

  private Date timeStamp;

  /**
   * @return name
   */

  public String getName() {

    return this.name;
  }

  /**
   * @param name new value of {@link #getName}.
   */

  public void setName(String name) {

    this.name = name;
  }

  /**
   * @return routeObjectReference
   */

  public Long getRouteId() {

    return this.routeId;
  }

  /**
   * @param routeId new value of {@link #getRouteId}.
   */

  public void setRouteId(Long routeId) {

    this.routeId = routeId;
  }

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
  public long getId() {

    return this.id;
  }

  /**
   * @param id new value of {@link #getId}
   */
  public void setId(long id) {

    this.id = id;
  }
}
