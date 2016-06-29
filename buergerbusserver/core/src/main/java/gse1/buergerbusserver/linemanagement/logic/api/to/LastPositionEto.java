package gse1.buergerbusserver.linemanagement.logic.api.to;

import java.util.Date;

import org.geojson.Point;

/**
 * @author razadfki
 * @since 0.1
 */
public class LastPositionEto {

  @SuppressWarnings("unused")
  private int delay;

  private Long busId;

  private double lat;

  private double lon;

  private Date timeStamp;

  private int takenSeats;

  /**
   * @return delay
   */

  public int getDelay() {

    return 0;
  }

  /**
   * @param delay
   */
  @SuppressWarnings("javadoc")
  public void setDelay(int delay) {

    this.delay = delay;
  }

  /**
   * @return BusId
   */
  public Long getBusId() {

    return this.busId;
  }

  /**
   * @param busId new value of {@link #getBusId}.
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
   * @param timeStamp new value of {@link #getTimestamp}.
   */
  public void setTimestamp(Date timeStamp) {

    this.timeStamp = timeStamp;
  }

  /**
   * Set the Latitude of the lastPosition
   *
   * @param lat latitude of the LastPosition
   *
   */
  public void setLat(double lat) {

    this.lat = lat;
  }

  /**
   * @return Position of the point Return position with Longitude and Latitude of the Point
   */
  public Point getPosition() {

    Point retVal = new Point(this.lon, this.lat);
    return retVal;
  }

  /**
   * Set Longitude of the LastPosition
   *
   * @param lon Longitude of the LastPosition
   */
  public void setLon(double lon) {

    this.lon = lon;
  }

  /**
   * @param takenSeats Sets the increased number of the person boarding the bus
   */
  public void setTakenSeats(int takenSeats) {

    this.takenSeats = takenSeats;

  }

  /**
   * @return takenSeats that increments the number of the persons boarding the bus
   */
  public int getTakenSeats() {

    return this.takenSeats;
  }
}
