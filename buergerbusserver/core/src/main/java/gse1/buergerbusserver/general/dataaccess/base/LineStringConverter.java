package gse1.buergerbusserver.general.dataaccess.base;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.persistence.AttributeConverter;

import org.geojson.LineString;
import org.geojson.LngLatAlt;

 public class LineStringConverter  implements AttributeConverter<LineString, String>  {

  @Override
  public String convertToDatabaseColumn(LineString lineString) {
    String aggrigated = "";
    for(LngLatAlt lla:lineString.getCoordinates())
      aggrigated = aggrigated + String.valueOf(lla.getLongitude())+','+String.valueOf(lla.getLatitude()) + ';';

    aggrigated = aggrigated.substring(0, aggrigated.length()-1);
    return aggrigated;
  }

  @Override
  public LineString convertToEntityAttribute(String stringValue) {

    LineString ls= new LineString();
    List<LngLatAlt> coordinates = new ArrayList<LngLatAlt>();
    List<String> listOfLocations = Arrays.asList(stringValue.split("\\s*;\\s*"));
    LngLatAlt lla1 = new LngLatAlt(1,2);
    lla1.toString();
    for(String gpsString:listOfLocations){
      LngLatAlt lla = new LngLatAlt();
      lla.setLongitude(Double.parseDouble(gpsString.substring(0, gpsString.indexOf(','))));
      lla.setLatitude(Double.parseDouble(gpsString.substring(gpsString.indexOf(',')+1,gpsString.length())));
      coordinates.add(lla);
    }


    ls.setCoordinates(coordinates);

    return ls;
  }
}
