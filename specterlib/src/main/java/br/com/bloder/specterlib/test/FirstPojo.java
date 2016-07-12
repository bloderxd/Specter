package br.com.bloder.specterlib.test;

import br.com.bloder.specterlib.annotation.Specter;

/**
 * Created by bloder on 07/07/16.
 */
public class FirstPojo {

  @Specter(name = "name")
  public final String name;

  @Specter(name = "age")
  public final int age;

  @Specter(name = "grade")
  public final float grade;

  @Specter(name = "subClass")
  public final SubPojo subPojo;

  public FirstPojo(String name, int age, float grade, SubPojo subPojo) {
    this.name = name;
    this.age = age;
    this.grade = grade;
    this.subPojo = subPojo;
  }
}
