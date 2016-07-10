package br.com.bloder.specterlib.test;

import br.com.bloder.specterlib.annotation.FieldSpect;

/**
 * Created by bloder on 10/07/16.
 */
public class ThirdPojo {

  @FieldSpect(name = "message")
  public final String message;

  public ThirdPojo(String test) {
    this.message = test;
  }
}
