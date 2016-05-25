package gse1.buergerbusserver.general.dataaccess.base;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import gse1.buergerbusserver.general.common.api.datatype.Gps;

import javax.persistence.AttributeConverter;

import org.hibernate.metamodel.domain.BasicType;

 public class GpsConverter  implements AttributeConverter<List<Gps>, String>  {

  @Override
  public String convertToDatabaseColumn(List<Gps> Gpslist) {

    String aggrigated = ""; 
    for(Gps gps:Gpslist)
      aggrigated = aggrigated + gps.toString() + ';';
    
    aggrigated = aggrigated.substring(0, aggrigated.length()-1);
    return aggrigated;
  }

  @Override
  public List<Gps> convertToEntityAttribute(String gpsCommaSeperated) {

    List<String> listOfGpses = Arrays.asList(gpsCommaSeperated.split("\\s*;\\s*"));
    
    List<Gps> GpsList = new ArrayList<Gps>();
    for(String gpsString:listOfGpses)
      GpsList.add(new Gps(gpsString));
    
    return GpsList;
  }
   //#todo extends AttributeConverter<String, List<Gps>>
}
