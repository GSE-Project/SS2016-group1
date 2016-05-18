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

  private static final long serialVersionUID = 1L;

  private long id;

  private String numberPlate;

  private Long lineId;

  private String color;

  private String picture;

  private Date timeStamp;

  /**
   * The constructor.
   */
  public BusEto() {

    super();
  }

  // @Override
  public void setNumberPlate(String numberPlate) {

    this.numberPlate = numberPlate;

  }

  // @Override
  public String getNumberPlate() {

    return this.numberPlate;
  }

  // @Override
  public void setColor(String color) {

    this.color = color;

  }

  // @Override
  public String getColor() {

    return this.color;
  }

  // @Override
  public void setPicture(String picture) {

    this.picture = picture;

  }

  // @Override
  public String getPicture() {

    return this.picture;
  }

  // @Override
  public void setTimeStamp(Date timeStamp) {

    this.timeStamp = timeStamp;

  }

  // @Override
  public Date getTimeStamp() {

    return this.timeStamp;
  }

  // @Override
  public void setLineId(Long lineId) {

    this.lineId = lineId;

  }

  // @Override
  public Long getLineId() {

    return this.lineId;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

}
