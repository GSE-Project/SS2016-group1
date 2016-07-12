package gse1.buergerbusserver.general.dataaccess.base;

import javax.persistence.AttributeConverter;

import org.geojson.LngLatAlt;
import org.geojson.Point;

/**
 * @author gse01
 *
 */
public class PointConverter implements AttributeConverter<Point, String> {

  @Override
  public String convertToDatabaseColumn(Point point) {

    return String.valueOf(point.getCoordinates().getLongitude()) + ','
        + String.valueOf(point.getCoordinates().getLatitude());

  }

  @Override
  public Point convertToEntityAttribute(String stringValue) {

    Point point = new Point();
    LngLatAlt lla = new LngLatAlt();

    lla.setLongitude(Double.parseDouble(stringValue.substring(0, stringValue.indexOf(','))));
    lla.setLatitude(Double.parseDouble(stringValue.substring(stringValue.indexOf(',') + 1, stringValue.length())));

    point.setCoordinates(lla);

    return point;
  }
}
