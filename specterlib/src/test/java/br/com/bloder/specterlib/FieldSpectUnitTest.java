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

  TestPojo testPojo = new TestPojo("", 0, 0, new SubPojo("", 0, new ThirdPojo("")));
  TestPayload testPayload = new TestPayload("Daniel", 18, 12, new SubPayload("Bloder", 16, new ThirdPayload("Hello")));

  @Test
  public void fieldSpectNormalTransition() {
    testPojo = new Specter<TestPojo, TestPayload>()
            .transform(testPayload)
            .in(testPojo)
            .withFieldContext();

    assertEquals("Daniel", testPojo.name);
  }

  @Test
  public void fieldSpectWithSubClassTransition() {
    testPojo = new Specter<TestPojo, TestPayload>()
            .transform(testPayload)
            .in(testPojo)
            .withFieldContext();

    assertEquals("Bloder", testPojo.subPojo.subName);
  }

  @Test
  public void fieldSpectWithThirdClassTransition() {
    testPojo = new Specter<TestPojo, TestPayload>()
            .transform(testPayload)
            .in(testPojo)
            .withFieldContext();

    assertEquals("Hello", testPojo.subPojo.exampleTestPayload.test);
  }
}
