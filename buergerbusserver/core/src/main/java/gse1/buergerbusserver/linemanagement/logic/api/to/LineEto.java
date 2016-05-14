package gse1.buergerbusserver.linemanagement.logic.api.to;

import java.util.Date;

import gse1.buergerbusserver.linemanagement.common.api.Line;
import io.oasp.module.basic.common.api.to.AbstractEto;

/**
 * @author razadfki
 *
 */
public class LineEto extends AbstractEto implements Line {
  private static final long serialVersionUID = 1L;

  private String name;

  private Long routeId;

  private Date timeStamp;

  /**
   * @return name
   */
  @Override
  public String getName() {

    return this.name;
  }

  /**
   * @param name new value of {@link #getname}.
   */
  @Override
  public void setName(String name) {

    this.name = name;
  }

  /**
   * @return routeObjectReference
   */
  @Override
  public Long getRouteId() {

    return this.routeId;
  }

  /**
   * @param routeId new value of {@link #getRouteId}.
   */
  @Override
  public void setRouteId(Long routeId) {

    this.routeId = routeId;
  }

  /**
   * @return timeStamp
   */
  @Override
  public Date getTimeStamp() {

    return this.timeStamp;
  }

  /**
   * @param timeStamp new value of {@link #getTimeStamp}.
   */
  @Override
  public void setTimeStamp(Date timeStamp) {

    this.timeStamp = timeStamp;
  }
}
