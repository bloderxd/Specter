package br.com.bloder.specterlib.test;

import br.com.bloder.specterlib.annotation.Specter;

/**
 * Created by bloder on 10/07/16.
 */
public class ThirdPayload extends FatherofFatherPayload {

  @Specter(name = "message")
  private final String message;

  public ThirdPayload(String name, String test) {
    super(name);
    this.message = test;
  }
}
