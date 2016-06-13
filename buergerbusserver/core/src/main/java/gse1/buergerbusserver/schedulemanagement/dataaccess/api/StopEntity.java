package gse1.buergerbusserver.schedulemanagement.dataaccess.api;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import gse1.buergerbusserver.general.dataaccess.api.ApplicationPersistenceEntity;
import gse1.buergerbusserver.schedulemanagement.common.api.Stop;

/**
 * @author mbaniasad
 *
 */
@Entity
@Table(name = "STOP")
public class StopEntity extends ApplicationPersistenceEntity implements Stop {

  /**
   *
   */
  private static final long serialVersionUID = 1L;

  private String name;

  private Date timeStamp;

  private double lat;

  private double lon;

  /**
   * @return name
   */
  @Override
  public String getName() {

    return this.name;
  }

  /**
   * @param name new value of {@link #getName}.
   */
  @Override
  public void setName(String name) {

    this.name = name;
  }

  /**
   * @return timestamp
   */
  @Override
  // see https://github.com/oasp-forge/oasp4j-wiki/wiki/guide-dataaccess-layer#date-and-time
  @Temporal(TemporalType.TIMESTAMP)
  public Date getTimeStamp() {

    return this.timeStamp;
  }

  /**
   * @param timestamp new value of {@link #getTimeStamp}.
   */
  @Override
  public void setTimeStamp(Date timestamp) {

    this.timeStamp = timestamp;
  }

  /**
   * Set Latitude of the Stop
   *
   * @param lat latitude of the Stop
   *
   */
  @Override
  public void setLat(double lat) {

    this.lat = lat;
  }

  /**
   *
   *
   * @return Lat Latitude of the Stop
   */
  @Override
  public double getLat() {

    return this.lat;
  }

  /**
   * Set Longitude of the Stop
   *
   * @param lon longitude of the Stop
   *
   */
  @Override
  public void setLon(double lon) {

    this.lon = lon;
  }

  /**
   *
   *
   * @return Lon Longitude of the Stop
   */
  @Override
  public double getLon() {

    return this.lon;
  }

}
