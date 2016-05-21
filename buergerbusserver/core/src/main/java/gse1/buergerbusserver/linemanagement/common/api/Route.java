package gse1.buergerbusserver.linemanagement.common.api;

import java.util.Date;
import java.util.List;

import gse1.buergerbusserver.general.common.api.ApplicationEntity;
import gse1.buergerbusserver.general.common.api.datatype.Gps;

/**
 * @author MZEEN
 *
 */
public interface Route extends ApplicationEntity {

  void setGpsData(List<Gps> gpsData);

  List<Gps> getGpsData();

  void setTimeStamp(Date timeStamp);

  Date getTimeStamp();
}
