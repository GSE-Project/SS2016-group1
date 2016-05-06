package gse1.buergerbusserver.linemanagement.dataaccess.api;

import java.sql.Timestamp;

import gse1.buergerbusserver.general.dataaccess.api.ApplicationPersistenceEntity;
import gse1.buergerbusserver.linemanagement.common.api.Line;

/**
 * @author razadfki
 *
 */
public class LineEntity extends ApplicationPersistenceEntity implements Line {

  String name;

  String routeObjectReference;

  Timestamp timeStamp;

  @Override
  public void setName(String name) {

    // TODO Auto-generated method stub
    this.name = name;
  }

  @Override
  public String getName() {

    // TODO Auto-generated method stub
    return this.name;
  }

  @Override
  public void setRouteObjectReference(String routeObjectReference) {

    // TODO Auto-generated method stub
    this.routeObjectReference = routeObjectReference;
  }

  @Override
  public String getRouteObjectReference() {

    // TODO Auto-generated method stub
    return this.routeObjectReference;
  }

  @Override
  public void setTimeStamp(Timestamp timeStamp) {

    // TODO Auto-generated method stub
    this.timeStamp = timeStamp;
  }

  @Override
  public Timestamp getTimeStamp() {

    // TODO Auto-generated method stub
    return this.timeStamp;
  }

}
