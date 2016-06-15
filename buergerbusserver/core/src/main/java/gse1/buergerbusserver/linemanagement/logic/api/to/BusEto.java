package gse1.buergerbusserver.linemanagement.logic.api.to;

import java.util.Date;

import gse1.buergerbusserver.linemanagement.common.api.Bus;
import io.oasp.module.basic.common.api.to.AbstractEto;

/**
 * {@link AbstractEto ETO} for {@link Bus}.
 *
 * @author ricarda
 *
 */
public class BusEto {// extends AbstractEto implements Bus {

  private long id;

  private String numberPlate;

  private Long lineId;

  private String color;

  private String picture;

  private int totalSeats;

  private Date timeStamp;

  /**
   * The constructor.
   */
  public BusEto() {

    super();
  }

  // @Override

  /**
   * @param numberPlate new value of {@link #getNumberPlate}.
   */
  public void setNumberPlate(String numberPlate) {

    this.numberPlate = numberPlate;

  }

  /**
   * @return NumberPlate
   */
  // @Override
  public String getNumberPlate() {

    return this.numberPlate;
  }

  /**
   * @param color new value of {@link #getColor}.
   */
  // @Override
  public void setColor(String color) {

    this.color = color;

  }

  /**
   * @return Color
   */
  // @Override
  public String getColor() {

    return this.color;
  }

  /**
   * @param picture new value of {@link #getPicture}.
   */
  // @Override
  public void setPicture(String picture) {

    this.picture = picture;

  }

  /**
   * @return Picture
   */
  // @Override
  public String getPicture() {

    return this.picture;
  }

  public int getTotalSeats() {

    return this.totalSeats;
  }

  public void setTotalSeats(int totalSeats) {

    this.totalSeats = totalSeats;
  }

  /**
   * Sets date time on create/update
   *
   * @param timeStamp
   *
   */
  // @Override
  @SuppressWarnings("javadoc")
  public void setTimeStamp(Date timeStamp) {

    this.timeStamp = timeStamp;

  }

  /**
   *
   * @return timestamp for the line when it last updated
   */
  // @Override
  protected Date getTimeStamp() {

    return this.timeStamp;
  }

  /**
   * @param lineId new value of {@link #getLineId}.
   */

  // @Override
  public void setLineId(Long lineId) {

    this.lineId = lineId;

  }

  /**
   * @return LineId
   */

  // @Override
  public Long getLineId() {

    return this.lineId;
  }

  /**
   * @return Id
   */
  public long getId() {

    return this.id;
  }

  /**
   * @param id new value of {@link #getId}.
   */
  public void setId(long id) {

    this.id = id;
  }

}
