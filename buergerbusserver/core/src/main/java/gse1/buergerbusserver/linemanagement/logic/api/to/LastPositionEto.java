package gse1.buergerbusserver.linemanagement.logic.api.to;

import java.util.Date;

/**
 *
 *
 * @author razadfki
 * @since 0.1
 */
public class LastPositionEto {

  private int delay;

  private Long busId;

  private String routeObjectReference;

  private double lat;

  private double lon;

  private Date timeStamp;

  /**
   * @return delay
   */
  /**
   * public int getDelay() {
   *
   * return this.delay; }
   */
  /**
   * @param delay new value of {@link #getdelay}.
   */

  public void setDelay(int delay) {

    this.delay = delay;
  }

  /**
   * @return name
   */
  public Long getBusId() {

    return this.busId;
  }

  /**
   * @param name new value of {@link #getname}.
   */
  public void setBusId(Long busId) {

    this.busId = busId;
  }

  /**
   * @return timeStamp
   */
  public Date getTimestamp() {

    return this.timeStamp;
  }

  /**
   * @param timeStamp new value of {@link #gettimeStamp}.
   */
  public void setTimestamp(Date timeStamp) {

    this.timeStamp = timeStamp;
  }

  public double getLat() {

    return this.lat;
  }

  public void setLat(double lat) {

    this.lat = lat;
  }

  public double getLon() {

    return this.lon;
  }

  public void setLon(double lon) {

    this.lon = lon;
  }
}
