package gse1.buergerbusserver.linemanagement.common.api;

import java.util.Date;

import gse1.buergerbusserver.general.common.api.ApplicationEntity;

/**
 * @author razadfki Interface of the line Entity of the system.
 */
public interface Line extends ApplicationEntity {

  /**
   * Sets name to the line
   *
   * @param name to the line
   */
  void setName(String name);

  /**
   * 
   *
   * @return name of the line
   */
  String getName();

  /**
   * Sets routeId link with the line
   *
   * @param routeId to associate
   */
  void setRouteId(Long routeId);

  /**
   * 
   *
   * @return Id of the route associated with the line
   */
  Long getRouteId();

  /**
   * Sets date time on create/update
   *
   * @param timestamp
   */
  void setTimeStamp(Date timeStamp);

  /**
   * 
   *
   * @return timestamp for the line when it last updated
   */
  Date getTimeStamp();

}
