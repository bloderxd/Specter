package br.com.bloder.specterlib.test;

import br.com.bloder.specterlib.internal.FieldSpect;

/**
 * Created by bloder on 10/07/16.
 */
public class ThirdPayload {

  @FieldSpect(name = "test")
  private final String test;

  public ThirdPayload(String test) {
    this.test = test;
  }
}
