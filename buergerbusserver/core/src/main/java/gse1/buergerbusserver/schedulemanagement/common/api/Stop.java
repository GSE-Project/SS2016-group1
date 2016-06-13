package gse1.buergerbusserver.schedulemanagement.common.api;

import java.util.Date;

import gse1.buergerbusserver.general.common.api.ApplicationEntity;

/**
 * This is the interface for Stops . It is characterized by its stop name, Latitude and longitude of stop location on
 * which the buses will stop and the object carries a timestamp.
 *
 * @author mbaniasad
 *
 */
public interface Stop extends ApplicationEntity {

  /**
   * Sets name of the Stop
   *
   * @param name to the Stop
   */
  void setName(String name);

  /**
   *
   *
   * @return name of the Stop
   */
  String getName();

  /**
   * Set Latitude of the Stop
   *
   * @param lat latitude of the Stop
   *
   */
  void setLat(double lat);

  /**
   *
   *
   * @return Lat Latitude of the Stop
   */
  double getLat();

  /**
   * Set Longitude of the Stop
   *
   * @param lon longitude of the Stop
   *
   */
  void setLon(double lon);

  /**
   *
   *
   * @return Lon Longitude of the Stop
   */
  double getLon();

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
   * @return timestamp for the Stop
   */
  Date getTimeStamp();
}
