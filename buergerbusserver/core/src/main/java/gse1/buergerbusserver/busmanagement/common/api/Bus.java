package gse1.buergerbusserver.busmanagement.common.api;

import java.sql.Timestamp;

import gse1.buergerbusserver.general.common.api.ApplicationEntity;

/**
 * @author ricarda42
 *
 */
public interface Bus extends ApplicationEntity {

  // REVIEW: Referred to the documentation regarding ID which made us Confuse whether to use it or not.
  // Please somebody help...!
  /**
   * @Override void setId(Long id);
   * 
   * @Override Long getId();
   */
  void setNumberPlate(String numberPlate);

  String getNumberPlate();

  void setColor(String color);

  String getColor();

  void setPicture(String picture);

  String getPicture();

  void setTimeStamp(Timestamp timeStamp);

  Timestamp getTimeStamp();

}
