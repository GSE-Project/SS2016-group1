package gse1.buergerbusserver.general.dataaccess.base;

import java.util.Arrays;
import java.util.List;

import javax.persistence.AttributeConverter;

import org.springframework.util.StringUtils;

/**
 * @author Sriramk88
 *
 */
// @Converter(autoApply = true)
public class StringListConverter implements AttributeConverter<List<String>, String> {

  @Override
  public String convertToDatabaseColumn(List<String> list) {

    String strVal = StringUtils.collectionToDelimitedString(list, ";");
    return strVal;

  }

  @Override
  public List<String> convertToEntityAttribute(String dbData) {

    List<String> stringList = Arrays.asList(dbData.split(";"));
    // List<Integer> returnList = new ArrayList<>();
    // for (String num : stringList) {
    // returnList.add(Integer.valueOf(num));
    // }
    return stringList;
  }

}