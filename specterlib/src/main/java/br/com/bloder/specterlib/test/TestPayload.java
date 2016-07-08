package br.com.bloder.specterlib.test;

import br.com.bloder.specterlib.internal.FieldSpect;

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

  public TestPayload(String name, int age, float grade) {
    this.name = name;
    this.age = age;
    this.grade = grade;
  }
}
