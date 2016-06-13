package gse1.buergerbusserver.linemanagement.logic.api.to;

import java.util.ArrayList;
import java.util.List;

/**
 * @author JAYU
 *
 */
public class LineWithBusIdsCto extends LineEto {

  private List<BusEto> buses;

  /**
   * @return the list of buses
   */

  public List<Long> getBusses() {

    List<Long> returnlist = new ArrayList<>();

    for (BusEto bus : this.buses)
      returnlist.add(bus.getId());
    return returnlist;
  }

  /**
   * @param buses Sets the list of Buses
   */
  public void setBuses(List<BusEto> buses) {

    this.buses = buses;

  }

}
