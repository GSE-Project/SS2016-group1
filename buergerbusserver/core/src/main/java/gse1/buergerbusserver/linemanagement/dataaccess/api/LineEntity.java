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

  private Long route_id;

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
   * @return route_id
   */
  @Override
  public Long getRoute_id() {

    return this.route_id;
  }

  /**
   * @param route_id new value of {@link #getroute_id}.
   */
  @Override
  public void setRoute_id(Long route_id) {

    this.route_id = route_id;
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
