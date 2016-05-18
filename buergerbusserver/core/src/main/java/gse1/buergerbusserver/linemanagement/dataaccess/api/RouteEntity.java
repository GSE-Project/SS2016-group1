package gse1.buergerbusserver.linemanagement.dataaccess.api;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import gse1.buergerbusserver.general.dataaccess.api.ApplicationPersistenceEntity;
import gse1.buergerbusserver.linemanagement.common.api.Route;

/**
 * @author MZEEN
 *
 */
@Entity
@Table(name = "ROUTE")
public class RouteEntity extends ApplicationPersistenceEntity implements Route {

  private String gpsdata;

  private Date timeStamp;

  /**
   * @return gpsdata
   */
  @Override
  public String getGpsData() {

    return this.gpsdata;
  }

  /**
   * @param GpsData new value of {@link #getgpsdata}.
   */
  @Override
  public void setGpsData(String gpsData) {

    this.gpsdata = gpsData;
  }

  /**
   * @return timeStamp
   */
  @Override
  // see https://github.com/oasp-forge/oasp4j-wiki/wiki/guide-dataaccess-layer#date-and-time
  @Temporal(TemporalType.TIMESTAMP)
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
