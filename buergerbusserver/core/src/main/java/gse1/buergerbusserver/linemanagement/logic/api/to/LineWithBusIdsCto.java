package gse1.buergerbusserver.linemanagement.logic.api.to;


import java.util.ArrayList;
import java.util.List;



public class LineWithBusIdsCto extends LineEto {

  
  private List<BusEto> buses;
  public List<Long> getBusids() {

    List<Long> returnlist = new ArrayList<Long>();
    
    for(BusEto bus:this.buses)
      returnlist.add(bus.getId());
    return returnlist;
  }

  

  public void setBuses(List<BusEto> buses) {

    this.buses = buses;
    
  }

}
