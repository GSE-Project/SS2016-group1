package gse1.buergerbusserver.busmanagement.dataaccess.api;

import java.sql.Timestamp;

import gse1.buergerbusserver.busmanagement.common.api.Bus;
import gse1.buergerbusserver.general.dataaccess.api.ApplicationPersistenceEntity;

/**
 * @author ricarda42
 *
 */
public class BusEntity extends ApplicationPersistenceEntity implements Bus {

  private Long id;

  private String numberPlate;

  private String color;

  private String picture;

  private Timestamp timeStamp;

  @Override
  public void setId(Long id) {

    this.id = id;

  }

  @Override
  public void setNumberPlate(String numberPlate) {

    this.numberPlate = numberPlate;

  }

  @Override
  public String getNumberPlate() {

    return this.numberPlate;
  }

  @Override
  public void setColor(String color) {

    this.color = color;

  }

  @Override
  public String getColor() {

    return this.color;
  }

  @Override
  public void setPicture(String picture) {

    this.picture = picture;

  }

  @Override
  public String getPicture() {

    return this.picture;
  }

  @Override
  public void setTimeStamp(Timestamp timeStamp) {

    this.timeStamp = timeStamp;

  }

  @Override
  public Timestamp getTimeStamp() {

    return this.timeStamp;
  }

}
