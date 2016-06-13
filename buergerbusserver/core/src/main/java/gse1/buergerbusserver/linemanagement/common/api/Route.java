package gse1.buergerbusserver.linemanagement.common.api;

import java.util.Date;

import org.geojson.LineString;

import gse1.buergerbusserver.general.common.api.ApplicationEntity;

/**
 * Interface of the Route Entity of the system.
 *
 * @author MZEEN
 *
 */
public interface Route extends ApplicationEntity {

  /**
   *
   *
   * @return Route
   */
  LineString getRoute();

  /**
   * @param location
   */
  void setRoute(LineString location);

  /**
   * Sets date time on create/update
   *
   * @param timeStamp
   *
   */
  void setTimeStamp(Date timeStamp);

  /**
   *
   *
   * @return timestamp for the line when it last updated
   */
  Date getTimeStamp();
}
