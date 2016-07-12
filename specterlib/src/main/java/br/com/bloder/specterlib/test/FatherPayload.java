package br.com.bloder.specterlib.test;

import br.com.bloder.specterlib.annotation.Specter;

/**
 * Created by bloder on 11/07/16.
 */
public class FatherPayload extends FatherofFatherPayload {

  @Specter(name = "fatherName")
  private final String name;

  @Specter(name = "fatherAge")
  private final int age;

  public FatherPayload(String fatherName, String name, int age) {
    super(fatherName);
    this.name = name;
    this.age = age;
  }
}
