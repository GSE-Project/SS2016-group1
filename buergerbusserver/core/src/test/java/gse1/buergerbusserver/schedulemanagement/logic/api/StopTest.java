package gse1.buergerbusserver.schedulemanagement.logic.api;

import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;

import org.junit.Test;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;

import gse1.buergerbusserver.SpringBootApp;
import gse1.buergerbusserver.schedulemanagement.logic.api.to.StopEto;
import io.oasp.module.test.common.base.ComponentTest;

/**
 * @author MZEEN
 *
 */
@SpringApplicationConfiguration(classes = { SpringBootApp.class })
@WebAppConfiguration

public class StopTest extends ComponentTest {
  /**
   *
   */
  @Test
  public void testStops() {

    try {
      StopEto stops = new StopEto();
      stops.setId(1);
      stops.setLat(45.5656565);
      stops.setLon(56.565656);
      stops.setName("Uni OST");
      stops.setTimeStamp(null);

      StopEto stops1 = new StopEto();
      stops1.setId(2);
      stops1.setLat(44.5656565);
      stops1.setLon(57.565656);
      stops1.setName("Stadtmitte");
      stops1.setTimeStamp(null);

    } catch (ConstraintViolationException e) {
      // BV is really painful as you need such code to see the actual error in JUnit.
      StringBuilder sb = new StringBuilder(64);
      sb.append("Constraints violated:");
      for (ConstraintViolation<?> v : e.getConstraintViolations()) {
        sb.append("\n");
        sb.append(v.getPropertyPath());
        sb.append(":");
        sb.append(v.getMessage());
      }
      throw new IllegalStateException(sb.toString(), e);
    }

  }
}