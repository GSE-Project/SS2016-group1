package gse1.buergerbusserver.linemanagement.dataaccess.api;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import gse1.buergerbusserver.general.dataaccess.api.ApplicationPersistenceEntity;
import gse1.buergerbusserver.linemanagement.common.api.LastPosition;

/**
 * {@link ApplicationPersistenceEntity Entity} representing a {@link LastPosition}. It provides information about the
 * LastPosition of the bus ,which inlcudes BusId, TimeStamp, Latitude and Longitude.
 *
 * LastPositionEntity implementing LastPosition interface implies setter getter properties.
 *
 * @author Jay
 *
 */
@Entity
@Table(name = "LASTPOSITION")
public class LastPositionEntity extends ApplicationPersistenceEntity implements LastPosition {
  /**
   *
   */
  private static final long serialVersionUID = 1L;

  private Long busId;

  private Date timestamp;

  private double lat;

  private double lon;
  
  private int takenSeats;

  /**
   * @return Id
   */
  @Override
  public Long getBusId() {

    return this.busId;
  }

  /**
   * @param busId new value of {@link #getBusId}.
   */
  @Override
  public void setBusId(Long busId) {

    this.busId = busId;
  }

  /**
   * @return timestamp
   */
  @Override
  // see https://github.com/oasp-forge/oasp4j-wiki/wiki/guide-dataaccess-layer#date-and-time
  @Temporal(TemporalType.TIMESTAMP)
  public Date getTimestamp() {

    return this.timestamp;
  }

  /**
   * @param timestamp new value of {@link #getTimestamp}.
   */
  @Override
  public void setTimestamp(Date timestamp) {

    this.timestamp = timestamp;
  }

  /**
   * @param lat new value of {@link #getLat}.
   */
  @Override
  public void setLat(double lat) {

    this.lat = lat;
  }

  /**
   * @return lat Latitude of the LastPosition
   */
  @Override
  public double getLat() {

    return this.lat;
  }

  /**
   * @param lon new value of {@link #getLon}.
   */
  @Override
  public void setLon(double lon) {

    this.lon = lon;
  }

  /**
   * @return lon Longitude of the LastPosition
   */
  @Override
  public double getLon() {

    return this.lon;
  }

  @Override
  public void setTakenSeats(int takenSeats) {

    this.takenSeats = takenSeats;
    
  }

  @Override
  public int getTakenSeats() {

    return this.takenSeats;
  }

}
