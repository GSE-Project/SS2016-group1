package gse1.buergerbusserver.linemanagement.dataaccess.api;

import java.util.Date;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import gse1.buergerbusserver.general.common.api.datatype.Gps;
import gse1.buergerbusserver.general.dataaccess.api.ApplicationPersistenceEntity;
import gse1.buergerbusserver.general.dataaccess.base.GpsConverter;
import gse1.buergerbusserver.linemanagement.common.api.Route;

/**
 * @author MZEEN
 *
 */
@Entity
@Table(name = "ROUTE")
public class RouteEntity extends ApplicationPersistenceEntity implements Route {

  
  private List<Gps> gpsdata;
  
  

  private Date timeStamp;

  /**
   * @return gpsdata
   */
  @Override
  @Convert(converter = GpsConverter.class)
  public List<Gps> getGpsData() {

    return this.gpsdata;
  }

  /**
   * @param GpsData new value of {@link #getgpsdata}.
   */
  @Override
  public void setGpsData(List<Gps> gpsData) {

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
