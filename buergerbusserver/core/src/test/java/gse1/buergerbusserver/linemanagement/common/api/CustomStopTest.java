package gse1.buergerbusserver.linemanagement.common.api;

import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;

import org.junit.Test;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;

import gse1.buergerbusserver.SpringBootApp;
import gse1.buergerbusserver.linemanagement.logic.api.to.CustomStopEto;
import io.oasp.module.test.common.base.ComponentTest;

/**
 * @author MZEEN
 *
 */
@SpringApplicationConfiguration(classes = { SpringBootApp.class })
@WebAppConfiguration
public class CustomStopTest extends ComponentTest {

  /**
   *
   */
  @Test
  public void testCustomStop() {

    try {
      CustomStopEto customstop = new CustomStopEto();
      customstop.setBusId((long) 1);
      customstop.setDeviceId("Android5656");
      customstop.setId((long) 3);
      customstop.setLat(48.56565656);
      customstop.setLon(56.56565656);
      customstop.setModificationCounter(2);
      customstop.setRevision(1);
      customstop.setStatus(2);
      customstop.setUserAssistance("userAssistance");
      customstop.setUserAddress("Kurt Schumacher");
      customstop.setUserName("MZEEN");

      CustomStopEto customstop1 = new CustomStopEto();

      customstop1.setBusId((long) 2);
      customstop1.setDeviceId("Windows5656");
      customstop1.setId((long) 2);
      customstop1.setLat(45.56565656);
      customstop1.setLon(53.56565656);
      customstop1.setModificationCounter(3);
      customstop1.setRevision(1);
      customstop1.setStatus(3);
      customstop1.setUserAssistance("userAssistance");
      customstop1.setUserAddress("DevenportPlatz");
      customstop1.setUserName("XYZ");

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
