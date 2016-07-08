package br.com.bloder.specterlib;

import java.lang.reflect.Field;

import br.com.bloder.specterlib.internal.FieldSpect;

/**
 * Created by bloder on 07/07/16.
 */
public class Specter<T, R> {

  private R payload;
  private T pojo;

  public Specter<T, R> transform(R payload) {
    this.payload = payload;
    return this;
  }

  public Specter<T, R> in(T pojo) {
    this.pojo = pojo;
    return this;
  }

  public T withFieldContext() {
    Field[] payloadFields = payload.getClass().getDeclaredFields();
    Field[] pojoFields = pojo.getClass().getDeclaredFields();

    for (Field originField : payloadFields) {
      if (originField.isAnnotationPresent(FieldSpect.class)) {
        for(Field destinyField : pojoFields) {
          if(originField.getAnnotation(FieldSpect.class).name().equals(destinyField.getAnnotation(FieldSpect.class).name())) {
            destinyField.setAccessible(true);
            originField.setAccessible(true);
            try {
              destinyField.set(pojo, originField.get(payload));
            } catch (IllegalAccessException e) { e.printStackTrace(); }
          }
        }
      }
    }
    return pojo;
  }
}
