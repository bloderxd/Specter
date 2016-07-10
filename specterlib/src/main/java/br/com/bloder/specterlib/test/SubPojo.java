package br.com.bloder.specterlib.test;

import br.com.bloder.specterlib.annotation.FieldSpect;

/**
 * Created by bloder on 09/07/16.
 */
public class SubPojo {

  @FieldSpect(name = "subName")
  public final String subName;

  @FieldSpect(name = "subAge")
  public final int subAge;

  @FieldSpect(name = "testSub")
  public final ThirdPojo thirdPojo;

  public SubPojo(String subName, int subAge, ThirdPojo exampleTestPayload) {
    this.subName = subName;
    this.subAge = subAge;
    this.thirdPojo = exampleTestPayload;
  }
}
