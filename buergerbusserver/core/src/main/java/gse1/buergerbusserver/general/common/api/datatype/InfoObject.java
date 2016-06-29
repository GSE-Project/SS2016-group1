package gse1.buergerbusserver.general.common.api.datatype;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InfoObject {

  private String name;

  private String address;

  private List<Integer> assistance;

  public InfoObject(String name, String address, String assist) {

    if (!assist.isEmpty()) {
      List<String> stringList = Arrays.asList(assist.split(","));
      List<Integer> returnList = new ArrayList<>();
      for (String num : stringList) {
        returnList.add(Integer.valueOf(num));
      }
      this.assistance = returnList;
    } else {
      this.assistance = new ArrayList<>();
    }

    this.name = name;
    this.address = address;

  }

  public String getName() {

    return this.name;
  }

  public String getAddress() {

    return this.address;
  }

  public List<Integer> getAssistance() {

    return this.assistance;
  }
}
