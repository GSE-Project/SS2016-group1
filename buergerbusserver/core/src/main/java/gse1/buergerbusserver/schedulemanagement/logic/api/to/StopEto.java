package gse1.buergerbusserver.schedulemanagement.logic.api.to;

import java.util.Date;


/**
 * TODO JAYU This type ...
 *
 * @author JAYU
 * @since 0.1
 */
public class StopEto {

  private long id;

  private  String name;

  protected double lat;

  protected double lon;

  private Date timeStamp;

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
   * @return timeStamp
   */
  public Date getTimeStamp() {

    return this.timeStamp;
  }

  /**
   * @param timeStamp new value of {@link #gettimeStamp}.
   */
  public void setTimeStamp(Date timeStamp) {

    this.timeStamp = timeStamp;
  }

  public void setLat(double lat) {

    this.lat = lat;
  }

  public void setLon(double lon) {

    this.lon = lon;
  }

  public long getId() {

    return id;
  }

  public void setId(long id) {

    this.id = id;
  }
}
