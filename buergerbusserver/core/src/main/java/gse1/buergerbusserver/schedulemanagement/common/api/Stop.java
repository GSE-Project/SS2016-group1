package gse1.buergerbusserver.schedulemanagement.common.api;

import gse1.buergerbusserver.general.common.api.ApplicationEntity;

import java.util.Date;

/**
 * @author mbaniasad
 *
 */
public interface Stop extends ApplicationEntity {

  void setName(String name);

  String getName();

  void setLat(double lat);
  double getLat();

  void setLon(double lon);
  double getLon();

  void setTimestamp(Date timeStamp);

  Date getTimestamp();


}
