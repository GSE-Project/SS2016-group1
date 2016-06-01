package gse1.buergerbusserver.linemanagement.common.api;

import java.util.Date;

import gse1.buergerbusserver.general.common.api.ApplicationEntity;

/**
 * @author razadfki
 *
 */
public interface LastPosition extends ApplicationEntity {

  void setBusId(Long busId);

  Long getBusId();

  void setLat(double lat);

  double getLat();

  void setLon(double lon);

  double getLon();

  void setTimestamp(Date timeStamp);

  Date getTimestamp();

}
