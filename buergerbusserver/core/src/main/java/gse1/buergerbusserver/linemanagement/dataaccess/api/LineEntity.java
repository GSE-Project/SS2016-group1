package gse1.buergerbusserver.linemanagement.dataaccess.api;

import gse1.buergerbusserver.general.dataaccess.api.ApplicationPersistenceEntity;
import gse1.buergerbusserver.linemanagement.common.api.Line;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @author razadfki
 *
 */
@Entity
@Table(name = "LINE")
public class LineEntity extends ApplicationPersistenceEntity implements Line {

  private String name;

  private String routeObjectReference;

  private Date timestamp;

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
  public String getRouteObjectReference() {

    return this.routeObjectReference;
  }

  /**
   * @param routeObjectReference new value of {@link #getrouteObjectReference}.
   */
  @Override
  public void setRouteObjectReference(String routeObjectReference) {

    this.routeObjectReference = routeObjectReference;
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
   * @param timestamp new value of {@link #gettimestamp}.
   */
  @Override
  public void setTimestamp(Date timestamp) {

    this.timestamp = timestamp;
  }

}
