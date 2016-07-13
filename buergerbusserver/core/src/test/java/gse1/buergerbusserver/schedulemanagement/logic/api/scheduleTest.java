package gse1.buergerbusserver.schedulemanagement.logic.api;

import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;

import org.junit.Test;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;

import gse1.buergerbusserver.SpringBootApp;
import gse1.buergerbusserver.schedulemanagement.logic.api.to.ScheduleEto;
import io.oasp.module.test.common.base.ComponentTest;

/**
 * @author MZEEN
 *
 */
@SpringApplicationConfiguration(classes = { SpringBootApp.class })
@WebAppConfiguration
public class scheduleTest extends ComponentTest {

  /**
   *
   */
  @Test
  public void testSchedule() {

    try {
      ScheduleEto schedule = new ScheduleEto();
      schedule.setLineId((long) 1);
      schedule.setLineName("Line 1");
      schedule.setStopId((long) 1);
      schedule.setTimestamp(null);

      ScheduleEto schedule1 = new ScheduleEto();
      schedule1.setLineId((long) 2);
      schedule1.setLineName("Line 3");
      schedule1.setStopId((long) 3);
      schedule1.setTimestamp(null);

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