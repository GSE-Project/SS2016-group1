package gse1.buergerbusserver.linemanagement.common.api;

import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;

import org.junit.Test;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;

import gse1.buergerbusserver.SpringBootApp;
import gse1.buergerbusserver.linemanagement.logic.impl.LastPositionmanagementImpl;
import io.oasp.module.test.common.base.ComponentTest;

/**
 * @author MZEEN
 *
 */
@SpringApplicationConfiguration(classes = { SpringBootApp.class })
@WebAppConfiguration
public class LastPositionMgtTest extends ComponentTest {
  /**
   *
   */
  @Test
  public void testLastPostMgt() {

    try {
      LastPositionmanagementImpl lastposi = new LastPositionmanagementImpl();
      lastposi.setLastPosition((long) 1, 46.565656, 56.454545, 4);
      lastposi.setLastPosition((long) 2, 46.565656, 56.454545, 4);
      lastposi.setLastPosition((long) 3, 46.565656, 56.454545, 4);

      LastPositionmanagementImpl lastposition = new LastPositionmanagementImpl();
      lastposition.setLastPosition((long) 4, 47.565656, 55.454545, 5);
      lastposition.setLastPosition((long) 5, 45.565656, 57.454545, 6);
      lastposition.setLastPosition((long) 6, 44.565656, 58.454545, 7);

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