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
public class StringListConverter implements AttributeConverter<String, String> {

  @Override
  public String convertToDatabaseColumn(String obj) {

    System.out.println("JSON Object: " + obj);
    String strVal;

    // try {
    // strVal = obj.get("name") + ";" + obj.get("address") + ";" + obj.get("assistance") + ";";
    // } catch (JSONException e) {
    // strVal = "name;address;assistance";
    // e.printStackTrace();
    // }
    //
    // return strVal;

    // = StringUtils.collectionToDelimitedString(list, ";");

    strVal = obj;

    System.out.println("JSON Object: " + strVal.indexOf("name"));
    //

    //
    System.out.println("JSON Object: " + strVal.indexOf("\",", strVal.indexOf("name")));

    String name = strVal.substring(strVal.indexOf("name") + 6, strVal.indexOf("\",", strVal.indexOf("name")));
    System.out.println("name: " + name);

    String address =
        strVal.substring(strVal.indexOf("address") + 9, strVal.indexOf("\",", strVal.indexOf("address")) - 1);
    System.out.println("address: " + address);

    String assistance =
        strVal.substring(strVal.indexOf("assistance") + 6, strVal.indexOf("\",", strVal.indexOf("assistance")) - 1);
    System.out.println("assistance: " + assistance);

    strVal = strVal.replaceAll("\"", "'");
    strVal = strVal.replaceAll("\\{", "");
    strVal = strVal.replaceAll("\\}", "");
    strVal = strVal.replaceAll("name", "");
    strVal = strVal.replaceAll("address", "");
    strVal = strVal.replaceAll("assistance", "");
    strVal = strVal.replaceAll("\\',", "\';");
    strVal = strVal.replaceAll("\'", "");
    strVal = strVal.replaceAll(":", "");
    // strVal = strVal.replaceAll("[", "");
    // strVal = strVal.replaceAll("]", "");

    System.out.println("StrVal: " + strVal);
    return strVal;

  }

  @Override
  public String convertToEntityAttribute(String dbData) {

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

    System.out.println("JObj: " + jObj);
    return jObj.toString();
    // return jObj;
  }

}