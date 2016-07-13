package gse1.buergerbusserver.linemanagement.common.api;

import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;

import org.junit.Test;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;

import gse1.buergerbusserver.SpringBootApp;
import gse1.buergerbusserver.linemanagement.logic.api.to.LastPositionEto;
import io.oasp.module.test.common.base.ComponentTest;

/**
 * @author MZEEN
 *
 */
@SpringApplicationConfiguration(classes = { SpringBootApp.class })
@WebAppConfiguration
public class LastPositionTest extends ComponentTest {

  /**
   *
   */
  @Test
  public void testLastPosition() {

    try {
      LastPositionEto lastpos = new LastPositionEto();
      lastpos.setBusId((long) 1);
      lastpos.setDelay(1);
      lastpos.setLat(45.45454545);
      lastpos.setLon(56.565656);
      lastpos.setTakenSeats(3);
      lastpos.setTimestamp(null);

      LastPositionEto lastposition = new LastPositionEto();
      lastposition.setBusId((long) 2);
      lastposition.setDelay(2);
      lastposition.setLat(46.45454545);
      lastposition.setLon(57.565656);
      lastposition.setTakenSeats(2);
      lastposition.setTimestamp(null);

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
