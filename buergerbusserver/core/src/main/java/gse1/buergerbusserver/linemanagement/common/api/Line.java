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

  void setRouteObjectReference(String routeObjectReference);

  String getRouteObjectReference();

  void setTimestamp(Date timeStamp);

  Date getTimestamp();

}
