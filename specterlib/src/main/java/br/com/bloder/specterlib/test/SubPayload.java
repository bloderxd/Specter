package br.com.bloder.specterlib.test;

import br.com.bloder.specterlib.internal.FieldSpect;

/**
 * Created by bloder on 09/07/16.
 */
public class SubPayload {

  @FieldSpect(name = "subName")
  private final String subName;

  @FieldSpect(name = "subAge")
  private final int subAge;

  @FieldSpect(name = "testSub")
  private final ThirdPayload exampleTestPayload;

  public SubPayload(String subName, int subAge, ThirdPayload exampleTestPayload) {
    this.subName = subName;
    this.subAge = subAge;
    this.exampleTestPayload = exampleTestPayload;
  }
}
