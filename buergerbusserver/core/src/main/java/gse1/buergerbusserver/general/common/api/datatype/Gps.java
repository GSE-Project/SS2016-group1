package gse1.buergerbusserver.general.common.api.datatype;

public class Gps {

  private double langitude;
  
  private double lattitude;

  public double getLangitude() {

    return langitude;
  }

  public void setLangitude(double langitude) {

    this.langitude = langitude;
  }

  public double getLattitude() {

    return lattitude;
  }

  public void setLattitude(double lattitude) {

    this.lattitude = lattitude;
  }
  
  public Gps(String stringValue){
   this.lattitude = Double.parseDouble(stringValue.substring(0, stringValue.indexOf(',')));
   this.langitude = Double.parseDouble(stringValue.substring(stringValue.indexOf(',')+1,stringValue.length()-1));
   
  }
  public Gps()
  {
    
  }
  
  @Override
  public String toString(){
    
    return String.valueOf(this.lattitude) + ',' + String.valueOf(this.langitude);
  }
  
  
}
