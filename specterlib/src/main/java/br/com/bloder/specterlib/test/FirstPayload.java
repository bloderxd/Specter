package br.com.bloder.specterlib.test;

import br.com.bloder.specterlib.annotation.Specter;

/**
 * Created by bloder on 07/07/16.
 */
public class FirstPayload {

  @Specter(name = "name")
  private final String name;

  @Specter(name = "age")
  private final int age;

  @Specter(name = "grade")
  private final float grade;

  @Specter(name = "subClass")
  private final SubPayload subPayload;

  public FirstPayload(String name, int age, float grade, SubPayload subPayload) {
    this.name = name;
    this.age = age;
    this.grade = grade;
    this.subPayload = subPayload;
  }
}
