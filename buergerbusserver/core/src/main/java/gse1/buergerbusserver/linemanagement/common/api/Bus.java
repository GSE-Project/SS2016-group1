package gse1.buergerbusserver.linemanagement.common.api;

import java.util.Date;

import gse1.buergerbusserver.general.common.api.ApplicationEntity;

/**
 * This is the interface for a bus of the system. It is characterized by its number plate, color and picture, is
 * referenced to a line by its lineID and the object carries a timestamp.
 *
 * @author ricarda42
 *
 */
public interface Bus extends ApplicationEntity {

  /**
   * Sets text of numberPlate
   *
   * @param numberPlate the new value
   */
  void setNumberPlate(String numberPlate);

  /**
   *
   * @return numberPlate the text on the bus plate
   */
  String getNumberPlate();

  /**
   * Sets color of Bus
   *
   * @param color the new color of the bus
   */
  void setColor(String color);

  /**
   *
   * @return color the color of the bus
   */
  String getColor();

  /**
   * Sets link to picture of the bus
   *
   * @param picture new link to bus picture
   */
  void setPicture(String picture);

  /**
   *
   * @return picture the link to bus picture
   */
  String getPicture();

  /**
   * Sets timestamp
   *
   * @param timeStamp the new timestamp
   */
  void setTimeStamp(Date timeStamp);

  /**
   *
   * @return timeStamp the timeStamp of bus object
   */
  Date getTimeStamp();

  /**
   * Set reference to line the bus is operating on
   *
   * @param lineId the ID of the new line bus is operating on
   */
  void setLineId(Long lineId);

  /**
   *
   * @return lineId the ID of the line the bus is operating on
   */
  Long getLineId();

}
