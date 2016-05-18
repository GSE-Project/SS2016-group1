package gse1.buergerbusserver.linemanagement.common.api;

import java.util.Date;

import gse1.buergerbusserver.general.common.api.ApplicationEntity;

/**
 * @author MZEEN
 *
 */
public interface Route extends ApplicationEntity {

  void setGpsData(String gpsData);

  String getGpsData();

  void setTimeStamp(Date timeStamp);

  Date getTimeStamp();
}
