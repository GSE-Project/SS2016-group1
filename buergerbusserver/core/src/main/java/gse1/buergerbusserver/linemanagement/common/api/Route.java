package gse1.buergerbusserver.linemanagement.common.api;

import gse1.buergerbusserver.general.common.api.ApplicationEntity;

import java.util.Date;

import org.geojson.LineString;

/**
 * @author MZEEN
 *
 */
public interface Route extends ApplicationEntity {

  LineString getRoute();

  void setRoute(LineString location);

  void setTimeStamp(Date timeStamp);

  Date getTimeStamp();
}
