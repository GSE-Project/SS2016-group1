package gse1.buergerbusserver.schedulemanagement.dataaccess.api;

import gse1.buergerbusserver.general.dataaccess.api.ApplicationPersistenceEntity;
import gse1.buergerbusserver.schedulemanagement.common.api.Stop;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @author mbaniasad
 *
 */
@Entity
@Table(name = "STOP")
public class StopEntity extends ApplicationPersistenceEntity implements Stop {

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
   * @param name new value of {@link #getname}.
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
   * @param timestamp new value of {@link #gettimestamp}.
   */
  @Override
  public void setTimeStamp(Date timestamp) {

    this.timeStamp = timestamp;
  }

  @Override
  public void setLat(double lat) {
	this.lat = lat;
}

@Override
public double getLat() {
	return this.lat;
}

@Override
public void setLon(double lon) {
	this.lon = lon;
}

@Override
public double getLon() {
	return this.lon;
}

}

