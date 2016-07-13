package gse1.buergerbusserver.linemanagement.common.api;

import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;

import org.junit.Test;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;

import gse1.buergerbusserver.SpringBootApp;
import gse1.buergerbusserver.linemanagement.logic.api.to.BusEto;
import io.oasp.module.test.common.base.ComponentTest;

/**
 * @author MZEEN
 *
 */
@SpringApplicationConfiguration(classes = { SpringBootApp.class })
@WebAppConfiguration
public class BusTest extends ComponentTest {

  /**
   * Test if the bus link is filtered properly
   */
  @Test
  public void testBus() {

    try {
      BusEto busdata = new BusEto();
      busdata.setColor("blue");
      busdata.setPicture("asdasdasd");
      busdata.setId(1);
      busdata.setNumberPlate("123456");
      busdata.setTotalSeats(10);
      busdata.setLineId((long) 1);

      BusEto busdata1 = new BusEto();
      busdata1.setColor("red");
      busdata1.setPicture("dfasdasdasfasd");
      busdata1.setId(2);
      busdata1.setNumberPlate("KUS-6543");
      busdata1.setTotalSeats(13);
      busdata1.setLineId((long) 2);

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
