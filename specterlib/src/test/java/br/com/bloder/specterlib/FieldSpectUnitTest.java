package br.com.bloder.specterlib;

import org.junit.Test;

import br.com.bloder.specterlib.internal.Specter;
import br.com.bloder.specterlib.test.SubPayload;
import br.com.bloder.specterlib.test.SubPojo;
import br.com.bloder.specterlib.test.TestPayload;
import br.com.bloder.specterlib.test.TestPojo;
import br.com.bloder.specterlib.test.ThirdPayload;
import br.com.bloder.specterlib.test.ThirdPojo;

import static org.junit.Assert.assertEquals;

/**
 * Created by bloder on 07/07/16.
 */
public class FieldSpectUnitTest {

  TestPojo pojo = new TestPojo("", 0, 0, new SubPojo("", 0, new ThirdPojo("")));
  TestPayload payload = new TestPayload("Daniel", 18, 12, new SubPayload("Bloder", 16, new ThirdPayload("Hello")));

  @Test
  public void fieldSpectNormalTransition() {
    pojo = (TestPojo) new Specter()
            .transform(payload)
            .inPojoWithInstance(pojo);

    assertEquals("Daniel", pojo.name);
  }

  @Test
  public void fieldSpectWithSubClassTransition() {
    pojo = (TestPojo) new Specter()
            .transform(payload)
            .inPojoWithInstance(pojo);

    assertEquals("Bloder", pojo.subPojo.subName);
  }

  @Test
  public void fieldSpectWithThirdClassTransition() {
    pojo = (TestPojo) new Specter()
            .transform(payload)
            .inPojoWithInstance(pojo);

    assertEquals("Hello", pojo.subPojo.thirdPojo.message);
  }
}
