package gse1.buergerbusserver.general.dataaccess.base;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.persistence.AttributeConverter;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * @author Sriramk88
 *
 */
// @Converter(autoApply = true)
public class StringListConverter implements AttributeConverter<JSONObject, String> {

  @Override
  public String convertToDatabaseColumn(JSONObject obj) {
     
     String strVal;
    
      try {
      strVal = obj.get("name") + ";" + obj.get("address") + ";" + obj.get("assistance") + ";";
      } catch (JSONException e) {
      strVal = null;
      e.printStackTrace();
      }
           return strVal;  
  }

  @Override
  public JSONObject convertToEntityAttribute(String dbData) {

     List<String> stringList = Arrays.asList(dbData.split(";"));
     List<String> assistList = Arrays.asList(stringList.get(2).split(","));
    
     List<Integer> returnList = new ArrayList<>();
     for (String num : assistList) {
     returnList.add(Integer.valueOf(num));
     }
    
     JSONObject jObj = new JSONObject();
    
     try {
     jObj.put("name", stringList.get(0));
     jObj.put("address", stringList.get(1));
     jObj.put("assistance", returnList);
     } catch (JSONException e) {
     e.printStackTrace();
     }    
   
     return jObj;
  }
}