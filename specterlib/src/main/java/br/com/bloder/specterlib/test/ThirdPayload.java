package br.com.bloder.specterlib.test;

import br.com.bloder.specterlib.annotation.FieldSpect;

/**
 * Created by bloder on 10/07/16.
 */
public class ThirdPayload {

  @FieldSpect(name = "message")
  private final String message;

  public ThirdPayload(String test) {
    this.message = test;
  }
}
