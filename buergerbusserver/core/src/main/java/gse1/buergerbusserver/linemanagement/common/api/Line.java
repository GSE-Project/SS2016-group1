package gse1.buergerbusserver.linemanagement.common.api;

import java.sql.Timestamp;

import gse1.buergerbusserver.general.common.api.ApplicationEntity;

/**
 * @author razadfki
 *
 */
public interface Line extends ApplicationEntity {

  /*
   * @Override void setId(Long id);
   *
   * @Override Long getId();
   */

  void setName(String name);

  String getName();

  void setRouteObjectReference(String routeObjectReference);

  String getRouteObjectReference();

  void setTimeStamp(Timestamp timeStamp);

  Timestamp getTimeStamp();

}
