package br.com.bloder.specterlib.test;

import br.com.bloder.specterlib.internal.FieldSpect;

/**
 * Created by bloder on 07/07/16.
 */
public class TestPojo {

  @FieldSpect(name = "name")
  public final String name;

  @FieldSpect(name = "age")
  public final int age;

  @FieldSpect(name = "grade")
  public final float grade;

  public TestPojo(String name, int age, float grade) {
    this.name = name;
    this.age = age;
    this.grade = grade;
  }
}
