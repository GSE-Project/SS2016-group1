package gse1.buergerbusserver.schedulemanagement.logic.api.to;

import java.util.Date;

/**
 * Stop Entity transfer object with setter and getters only.
 * 
 * @author JAYU
 * @since 0.1
 */
public class StopEto {

  private long id;

  private String name;

  /**
   * Latitude of the Stop
   */
  protected double lat;

  /**
   * Longitude of the Stop
   */
  protected double lon;

  private Date timeStamp;

  /**
   * @return name of the Stop
   */
  public String getName() {

    return this.name;
  }

  /**
   * Sets name of the Stop
   *
   * @param name to the Stop
   */
  public void setName(String name) {

    this.name = name;
  }

  /**
   * @return timeStamp
   */
  protected Date getTimeStamp() {

    return this.timeStamp;
  }

  /**
   * Sets date time on create/update
   *
   * @param timeStamp timeStamp
   *
   *
   *
   */
  public void setTimeStamp(Date timeStamp) {

    this.timeStamp = timeStamp;
  }

  /**
   * @param lat Latitude of the Stop
   *
   */
  public void setLat(double lat) {

    this.lat = lat;
  }

  /**
   * @param lon Longitude of the Stop
   */
  public void setLon(double lon) {

    this.lon = lon;
  }

  /**
   * @return Id of the Stop
   */
  public long getId() {

    return this.id;
  }

  /**
   * Set reference Id for stop
   *
   * @param id Id for Stop
   */
  public void setId(long id) {

    this.id = id;
  }
}
