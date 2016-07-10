package br.com.bloder.specterlib.test;

import br.com.bloder.specterlib.internal.FieldSpect;

/**
 * Created by bloder on 10/07/16.
 */
public class ThirdPojo {

  @FieldSpect(name = "test")
  public final String test;

  public ThirdPojo(String test) {
    this.test = test;
  }
}
