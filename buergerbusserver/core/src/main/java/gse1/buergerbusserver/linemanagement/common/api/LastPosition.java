package gse1.buergerbusserver.linemanagement.common.api;

import java.util.Date;

import gse1.buergerbusserver.general.common.api.ApplicationEntity;

/**
 * This is the interface for LastPostition of the Bus. It provides information regarding the Latitude and Longitude of
 * LastPosition and is referenced to a Bus by its BusID and the object carries a timestamp.
 *
 * @author JAYU
 *
 */
public interface LastPosition extends ApplicationEntity {

  /**
   * Set reference busId to the Bus
   *
   * @param busId to the Bus
   */
  void setBusId(Long busId);

  /**
   *
   *
   * @return Id of the Bus
   */
  Long getBusId();

  /**
   * Set Latitude of the lastPosition
   *
   * @param lat latitude of the LastPosition
   *
   */
  void setLat(double lat);

  /**
   *
   *
   * @return Lat Latitude of the LastPositon passed by the bus
   */
  double getLat();

  /**
   * Set Longitude of the LastPosition
   *
   * @param lon Longitude of the LastPosition
   */
  void setLon(double lon);

  /**
   * @return Lon Longitude of the LastPosition passed by the bus
   */
  double getLon();

  /**
   * Sets date time on create/update
   *
   * @param timeStamp
   *
   */

  void setTimestamp(Date timeStamp);

  /**
   *
   *
   * @return timestamp for the line when it last updated
   */
  Date getTimestamp();
}
