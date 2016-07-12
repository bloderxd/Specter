package br.com.bloder.specterlib;

import org.junit.Test;

import br.com.bloder.specterlib.internal.Specter;
import br.com.bloder.specterlib.test.SubPayload;
import br.com.bloder.specterlib.test.SubPojo;
import br.com.bloder.specterlib.test.FirstPayload;
import br.com.bloder.specterlib.test.FirstPojo;
import br.com.bloder.specterlib.test.ThirdPayload;
import br.com.bloder.specterlib.test.ThirdPojo;

import static org.junit.Assert.assertEquals;

/**
 * Created by bloder on 07/07/16.
 */
public class FieldSpectUnitTest {

  FirstPojo pojo = new FirstPojo("", 0, 0, new SubPojo("", "", 0, new ThirdPojo("","")));
  FirstPayload payload = new FirstPayload("Daniel", 18, 12, new SubPayload("Ronaldinho", "Bloder", 16, new ThirdPayload("Ronaldo", "Hello")));

  @Test
  public void fieldSpectNormalTransition() {
    pojo = (FirstPojo) new Specter()
            .transform(payload)
            .inPojoWithInstance(pojo);

    assertEquals("Daniel", pojo.name);
  }

  @Test
  public void fieldSpectWithSubClassTransition() {
    pojo = (FirstPojo) new Specter()
            .transform(payload)
            .inPojoWithInstance(pojo);

    assertEquals("Bloder", pojo.subPojo.name);
  }

  @Test
  public void fieldSpectWithThirdClassTransition() {
    pojo = (FirstPojo) new Specter()
            .transform(payload)
            .inPojoWithInstance(pojo);

    assertEquals("Hello", pojo.subPojo.thirdPojo.message);
  }

  @Test
  public void classWithFatherObject() {
    pojo = (FirstPojo) new Specter()
            .transform(payload)
            .inPojoWithInstance(pojo);

    assertEquals("Ronaldo", pojo.subPojo.thirdPojo.fatherName);
  }
}
