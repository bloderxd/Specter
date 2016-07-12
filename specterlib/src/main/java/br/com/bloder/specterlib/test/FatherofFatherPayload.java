package br.com.bloder.specterlib.test;

import br.com.bloder.specterlib.annotation.Specter;

/**
 * Created by bloder on 12/07/16.
 */
public class FatherofFatherPayload {

  @Specter(name = "nameOfFather")
  private final String name;

  public FatherofFatherPayload(String name) {
    this.name = name;
  }
}
