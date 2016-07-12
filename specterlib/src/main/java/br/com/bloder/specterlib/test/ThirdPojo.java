package br.com.bloder.specterlib.test;

import br.com.bloder.specterlib.annotation.Specter;

/**
 * Created by bloder on 10/07/16.
 */
public class ThirdPojo extends FatherofFatherPojo {

  @Specter(name = "message")
  public final String message;

  public ThirdPojo(String name, String test) {
    super(name);
    this.message = test;
  }
}
