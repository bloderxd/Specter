package br.com.bloder.specterlib.test;

import br.com.bloder.specterlib.annotation.Specter;

/**
 * Created by bloder on 11/07/16.
 */
public class FatherPojo extends FatherofFatherPojo {

  @Specter(name = "fatherName")
  public String name;

  @Specter(name = "fatherAge")
  public int age;

  public FatherPojo(String fatherName, String name, int age) {
    super(fatherName);
    this.name = name;
    this.age = age;
  }
}
