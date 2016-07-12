package br.com.bloder.specterlib.test;

import br.com.bloder.specterlib.annotation.Specter;

/**
 * Created by bloder on 09/07/16.
 */
public class SubPojo extends FatherPojo {

  @Specter(name = "testSub")
  public final ThirdPojo thirdPojo;

  public SubPojo(String fatherOfFatherName, String subName, int subAge, ThirdPojo exampleTestPayload) {
    super(fatherOfFatherName, subName, subAge);
    this.thirdPojo = exampleTestPayload;
  }
}
