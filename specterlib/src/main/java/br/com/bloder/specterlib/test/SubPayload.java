package br.com.bloder.specterlib.test;

import br.com.bloder.specterlib.annotation.Specter;

/**
 * Created by bloder on 09/07/16.
 */
public class SubPayload extends FatherPayload {

  @Specter(name = "testSub")
  private final ThirdPayload thirdPayload;

  public SubPayload(String fatherOfFatherName ,String subName, int subAge, ThirdPayload exampleTestPayload) {
    super(fatherOfFatherName, subName, subAge);
    this.thirdPayload = exampleTestPayload;
  }
}
