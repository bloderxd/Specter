package br.com.bloder.specterlib;

import org.junit.Test;

import br.com.bloder.specterlib.test.TestPayload;
import br.com.bloder.specterlib.test.TestPojo;

import static org.junit.Assert.assertEquals;

/**
 * Created by bloder on 07/07/16.
 */
public class FieldSpectUnitTest {

  @Test
  public void fieldSpectTransition() {

    TestPayload testPayload = new TestPayload("Daniel", 18, 12);

    TestPojo testPojo = new TestPojo("", 0, 0);
    testPojo = new Specter<TestPojo, TestPayload>()
            .transform(testPayload)
            .in(testPojo)
            .withFieldContext();

    assertEquals("Daniel", testPojo.name);
    assertEquals(18, testPojo.age);
  }
}
