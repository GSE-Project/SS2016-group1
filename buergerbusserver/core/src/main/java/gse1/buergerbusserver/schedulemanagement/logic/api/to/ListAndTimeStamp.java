package gse1.buergerbusserver.schedulemanagement.logic.api.to;

import java.util.Date;
import java.util.List;

public class ListAndTimeStamp<T> {
  List<T> objectList;
  Date lastTimeStamp;
  
  public ListAndTimeStamp(List<T> tlist, Date lastTimeStamp){
    this.objectList = tlist;
    this.lastTimeStamp = lastTimeStamp;
  }
  
  public List<T> getStops(){
    return this.objectList;
  }
  
  public Date getTimeStamp(){
    return this.lastTimeStamp;
  }
}
