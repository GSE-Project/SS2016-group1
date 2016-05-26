package gse1.buergerbusserver.linemanagement.logic.api.to;

import gse1.buergerbusserver.schedulemanagement.logic.api.to.StopEto;
import io.oasp.module.basic.common.api.to.AbstractCto;

/**
 * @author ahsan
 *
 */
public class LatestUpdateCto extends AbstractCto {

  private static final long serialVersionUID = 1L;

  private BusEto bus;

  private LineEto line;

  private RouteEto route;

  private StopEto stop;

  /**
   * @return bus
   */
  public BusEto getBus() {

    return this.bus;
  }

  /**
   * @param bus new value of {@link #getbus}.
   */
  public void setBus(BusEto bus) {

    this.bus = bus;
  }

  /**
   * @return line
   */
  public LineEto getLine() {

    return this.line;
  }

  /**
   * @param line new value of {@link #getline}.
   */
  public void setLine(LineEto line) {

    this.line = line;
  }

  /**
   * @return route
   */
  public RouteEto getRoute() {

    return this.route;
  }

  /**
   * @param route new value of {@link #getroute}.
   */
  public void setRoute(RouteEto route) {

    this.route = route;
  }

  /**
   * @return stop
   */
  public StopEto getStop() {

    return this.stop;
  }

  /**
   * @param stop new value of {@link #getstop}.
   */
  public void setStop(StopEto stop) {

    this.stop = stop;
  }

}
