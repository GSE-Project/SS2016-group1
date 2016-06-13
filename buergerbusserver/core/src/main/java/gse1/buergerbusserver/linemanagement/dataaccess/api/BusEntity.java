package gse1.buergerbusserver.linemanagement.dataaccess.api;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import gse1.buergerbusserver.general.dataaccess.api.ApplicationPersistenceEntity;
import gse1.buergerbusserver.linemanagement.common.api.Bus;

/**
 * {@link ApplicationPersistenceEntity Entity} representing a {@link Bus}. A bus has a number plate, a color and picture
 * and can have a line assigned to it.
 *
 * @author ricarda42
 *
 */

@Entity
@Table(name = "BUS")
public class BusEntity extends ApplicationPersistenceEntity implements Bus {

  private static final long serialVersionUID = 1L;

  private String numberPlate;

  private Long lineId; // what if there is no line assigned?

  private String color;

  private String picture;

  private Date timeStamp;

  @Override
  public void setNumberPlate(String numberPlate) {

    this.numberPlate = numberPlate;

  }

  /**
   * @return NumberPLate
   */
  @Override
  public String getNumberPlate() {

    return this.numberPlate;
  }

  /**
   * @param color new value of {@link #getColor}.
   */
  @Override
  public void setColor(String color) {

    this.color = color;

  }

  /**
   * @return color
   */
  @Override
  public String getColor() {

    return this.color;
  }

  /**
   * @param picture new value of {@link #getPicture}.
   */
  @Override
  public void setPicture(String picture) {

    this.picture = picture;
  }

  /**
   * @return picture
   */
  @Override
  public String getPicture() {

    return this.picture;
  }

  /**
   * @param timeStamp new value of {@link #getTimeStamp}.
   */
  @Override
  public void setTimeStamp(Date timeStamp) {

    this.timeStamp = timeStamp;
  }

  /**
   * @return timeStamp
   */
  @Override
  @Temporal(TemporalType.TIMESTAMP)
  public Date getTimeStamp() {

    return this.timeStamp;
  }

  /**
   * @param lineId new value of {@link #getLineId}.
   */
  @Override
  public void setLineId(Long lineId) {

    this.lineId = lineId;
  }

  /**
   * @return LineObjectReference
   */
  @Override
  public Long getLineId() {

    return this.lineId;
  }

}
