package br.com.bloder.specterlib.test;

import br.com.bloder.specterlib.annotation.Specter;

/**
 * Created by bloder on 12/07/16.
 */
public class FatherofFatherPojo {

  @Specter(name = "nameOfFather")
  public final String fatherName;

  public FatherofFatherPojo(String name) {
    this.fatherName = name;
  }
}
