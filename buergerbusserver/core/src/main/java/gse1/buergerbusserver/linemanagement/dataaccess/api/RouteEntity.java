package gse1.buergerbusserver.linemanagement.dataaccess.api;

import gse1.buergerbusserver.general.dataaccess.api.ApplicationPersistenceEntity;
import gse1.buergerbusserver.general.dataaccess.base.LineStringConverter;
import gse1.buergerbusserver.linemanagement.common.api.Route;

import java.util.Date;

import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.geojson.LineString;

/**
 * @author MZEEN
 *
 */
@Entity
@Table(name = "ROUTE")
public class RouteEntity extends ApplicationPersistenceEntity implements Route {


  private LineString route;

  private Date timeStamp;

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

  @Override
  @Convert(converter = LineStringConverter.class)
  public LineString getRoute() {

    return this.route;
  }

  @Override
  public void setRoute(LineString route) {

    this.route = route;
  }
}
