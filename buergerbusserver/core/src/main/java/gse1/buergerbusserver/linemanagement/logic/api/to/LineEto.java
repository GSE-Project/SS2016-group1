package gse1.buergerbusserver.linemanagement.logic.api.to;

import java.sql.Timestamp;

/**
 * TODO mbrunnli This type ...
 *
 * @author mbrunnli
 * @since 0.1
 */
public class LineEto {

  private String name;

  private String rout_id;

  private Timestamp timeStamp;

  /**
   * @return name
   */
  public String getName() {

    return this.name;
  }

  /**
   * @param name new value of {@link #getname}.
   */
  public void setName(String name) {

    this.name = name;
  }

  /**
   * @return rout_id
   */
  public String getrout_id() {

    return this.rout_id;
  }

  /**
   * @param rout_id new value of {@link #getrout_id}.
   */
  public void setrout_id(String rout_id) {

    this.rout_id = rout_id;
  }

  /**
   * @return timeStamp
   */
  public Timestamp getTimeStamp() {

    return this.timeStamp;
  }

  /**
   * @param timeStamp new value of {@link #gettimeStamp}.
   */
  public void setTimeStamp(Timestamp timeStamp) {

    this.timeStamp = timeStamp;
  }

}
