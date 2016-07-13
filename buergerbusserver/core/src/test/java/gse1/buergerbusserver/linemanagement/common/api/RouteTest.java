package gse1.buergerbusserver.linemanagement.common.api;

import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;

import org.junit.Test;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;

import gse1.buergerbusserver.SpringBootApp;
import gse1.buergerbusserver.linemanagement.logic.api.to.RouteEto;
import io.oasp.module.test.common.base.ComponentTest;

/**
 * @author MZEEN
 *
 */
@SpringApplicationConfiguration(classes = { SpringBootApp.class })
@WebAppConfiguration
public class RouteTest extends ComponentTest {

  /**
   *
   */
  @Test
  public void testRoute() {

    try {
      RouteEto route = new RouteEto();
      route.setId((long) 1);
      route.setRoute(null);
      route.setTimeStamp(null);

      RouteEto route1 = new RouteEto();
      route1.setId((long) 2);
      route1.setRoute(null);
      route1.setTimeStamp(null);

    } catch (ConstraintViolationException e) {
      // to see the actual error in JUnit.
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
