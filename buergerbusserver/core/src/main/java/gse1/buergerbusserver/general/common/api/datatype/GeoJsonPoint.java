package gse1.buergerbusserver.general.common.api.datatype;

public class GeoJsonPoint {
  private double longitude;
  private double latitude;
  private String type;
  
  public GeoJsonPoint(Double longitude, Double latitude){
    this.latitude = latitude;
    this.longitude = longitude;
    this.type = "Point";
   }

  public Double[] getCoordinates(){
    Double[] retArray = new Double[2];
    retArray[0]=this.longitude;
    retArray[1]=this.latitude;
    
    return retArray;
  }
  public String getType()
  {
    return this.type;
  }
  
  
}
