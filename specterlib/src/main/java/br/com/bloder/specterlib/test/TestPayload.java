package br.com.bloder.specterlib.test;

import br.com.bloder.specterlib.annotation.FieldSpect;

/**
 * Created by bloder on 07/07/16.
 */
public class TestPayload {

  @FieldSpect(name = "name")
  private final String name;

  @FieldSpect(name = "age")
  private final int age;

  @FieldSpect(name = "grade")
  private final float grade;

  @FieldSpect(name = "subClass")
  public SubPayload subPayload;

  public TestPayload(String name, int age, float grade, SubPayload subPayload) {
    this.name = name;
    this.age = age;
    this.grade = grade;
    this.subPayload = subPayload;
  }
}
