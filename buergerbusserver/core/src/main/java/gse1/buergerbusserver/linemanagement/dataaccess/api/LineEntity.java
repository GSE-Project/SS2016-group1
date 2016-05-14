package gse1.buergerbusserver.linemanagement.dataaccess.api;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import gse1.buergerbusserver.general.dataaccess.api.ApplicationPersistenceEntity;
import gse1.buergerbusserver.linemanagement.common.api.Line;

/**
 * @author razadfki
 *
 */
@Entity
@Table(name = "LINE")
public class LineEntity extends ApplicationPersistenceEntity implements Line {

  private static final long serialVersionUID = 1L;

  private String name;

  private Long routeId;

  private Date timeStamp;

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
   * @return routeObjectReference
   */
  @Override
  public Long getRouteId() {

    return this.routeId;
  }

  /**
   * @param routeId new value of {@link #getRouteId}.
   */
  @Override
  public void setRouteId(Long routeId) {

    this.routeId = routeId;
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
