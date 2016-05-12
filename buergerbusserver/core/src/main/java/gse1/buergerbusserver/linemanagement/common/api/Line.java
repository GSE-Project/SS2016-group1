package gse1.buergerbusserver.linemanagement.common.api;

import gse1.buergerbusserver.general.common.api.ApplicationEntity;

import java.util.Date;

/**
 * @author razadfki
 *
 */
public interface Line extends ApplicationEntity {

  void setName(String name);

  String getName();

  void setRoute_id(Long route_id);

  Long getRoute_id();

  void setTimestamp(Date timeStamp);

  Date getTimestamp();

}
