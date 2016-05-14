package gse1.buergerbusserver.linemanagement.common.api;

import java.util.Date;

import gse1.buergerbusserver.general.common.api.ApplicationEntity;

/**
 * @author razadfki Interface of the line Entity of the system.
 */
public interface Line extends ApplicationEntity {

  void setName(String name);

  String getName();

  void setRouteId(Long routeId);

  Long getRouteId();

  void setTimeStamp(Date timeStamp);

  Date getTimeStamp();

}
