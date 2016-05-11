package gse1.buergerbusserver.linemanagement.logic.api.to;

import java.sql.Timestamp;

/**
 * TODO mbrunnli This type ...
 *
 * @author mbrunnli
 * @since 0.1
 */
public class LineEto {

  private String name;

  private String routeObjectReference;

  private Timestamp timeStamp;

  /**
   * @return name
   */
  public String getName() {

    return this.name;
  }

  /**
   * @param name new value of {@link #getname}.
   */
  public void setName(String name) {

    this.name = name;
  }

  /**
   * @return routeObjectReference
   */
  public String getRouteObjectReference() {

    return this.routeObjectReference;
  }

  /**
   * @param routeObjectReference new value of {@link #getrouteObjectReference}.
   */
  public void setRouteObjectReference(String routeObjectReference) {

    this.routeObjectReference = routeObjectReference;
  }

  /**
   * @return timeStamp
   */
  public Timestamp getTimeStamp() {

    return this.timeStamp;
  }

  /**
   * @param timeStamp new value of {@link #gettimeStamp}.
   */
  public void setTimeStamp(Timestamp timeStamp) {

    this.timeStamp = timeStamp;
  }

}
