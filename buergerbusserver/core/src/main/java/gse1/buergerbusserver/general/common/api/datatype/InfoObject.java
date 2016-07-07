package gse1.buergerbusserver.general.common.api.datatype;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Sriramk88
 *
 */
public class InfoObject {

  private String name;

  private String address;

  private String assist;

  private List<Integer> assistance;

  /**
   * The constructor.
   *
   * @param userInfo contains user information
   */
  public InfoObject(String userInfo) {

    List<String> stringList = Arrays.asList(userInfo.split(";"));

    this.name = stringList.get(0);
    this.address = stringList.get(1);
    this.assist = stringList.get(2);

    if (!this.assist.isEmpty()) {
      List<String> assistList = Arrays.asList(this.assist.split(","));
      List<Integer> returnList = new ArrayList<>();
      for (String num : assistList) {
        returnList.add(Integer.valueOf(num));
      }
      this.assistance = returnList;
    } else {
      this.assistance = new ArrayList<>();
    }

  }

  /**
   * @return name
   */
  public String getName() {

    return this.name;
  }

  /**
   * @return address
   */
  public String getAddress() {

    return this.address;
  }

  /**
   * @return assistance requested
   */
  public List<Integer> getAssistance() {

    return this.assistance;
  }
}
