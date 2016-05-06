package gse1.buergerbusserver.busmanagement.common.api;

import java.sql.Timestamp;

import gse1.buergerbusserver.general.common.api.ApplicationEntity;

/**
 * @author gse01
 *
 */
public interface Bus extends ApplicationEntity {

  @Override
  void setId(Long id);

  @Override
  Long getId();

  void setNumberPlate(String numberPlate);

  String getNumberPlate();

  void setColor(String color);

  String getColor();

  void setPicture(String picture);

  String getPicture();

  void setTimeStamp(Timestamp timeStamp);

  Timestamp getTimeStamp();

}
