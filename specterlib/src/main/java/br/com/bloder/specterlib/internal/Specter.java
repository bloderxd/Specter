package br.com.bloder.specterlib.internal;

import java.lang.reflect.Field;

/**
 * Created by bloder on 07/07/16.
 */
public class Specter {

  private Object payload;
  private Object pojo;

  public Specter transform(Object payload) {
    this.payload = payload;
    return this;
  }

  public Object inPojoWithInstance(Object pojo) {
    this.pojo = pojo;
    specter(payload, pojo);
    return pojo;
  }

  private void specter(Object originClass, Object destinyClass) {
    Field[] pojoFields;
    Field[] payloadFields;

    if (destinyClass.getClass().getSuperclass() != Object.class) {
      pojoFields = destinyClass.getClass().getSuperclass().getDeclaredFields();
      payloadFields = originClass.getClass().getSuperclass().getDeclaredFields();
      continueSpecting(originClass, destinyClass);
      specting(payloadFields, pojoFields, originClass, destinyClass);
    } else {
      pojoFields = destinyClass.getClass().getDeclaredFields();
      payloadFields = originClass.getClass().getDeclaredFields();
    }

    specting(payloadFields, pojoFields, originClass, destinyClass);
  }

  private void continueSpecting(Object originClass, Object destinyClass) {
    Field[] payloadFields;
    Field[] pojoFields;
    pojoFields = destinyClass.getClass().getDeclaredFields();
    payloadFields = originClass.getClass().getDeclaredFields();

    specting(payloadFields, pojoFields, originClass, destinyClass);
  }

  private void specting(Field[] payloadFields, Field[] pojoFields, Object originClass, Object destinyClass) {

    for (Field originField : payloadFields) {
      if (originField.isAnnotationPresent(br.com.bloder.specterlib.annotation.Specter.class)) {
        for (Field destinyField : pojoFields) {
          if (originField.getAnnotation(br.com.bloder.specterlib.annotation.Specter.class).name().equals(destinyField.getAnnotation(br.com.bloder.specterlib.annotation.Specter.class).name())) {
            destinyField.setAccessible(true);
            originField.setAccessible(true);
            try {
              if (!destinyField.getType().isPrimitive() && !isJavaObject(destinyField)) {
                specter(originField.get(originClass), destinyField.get(destinyClass));
              } else {
                destinyField.set(destinyClass, originField.get(originClass));
              }
            } catch (IllegalAccessException e) {
              e.printStackTrace();
            }
          }
        }
      }
    }
  }

  private boolean isJavaObject(Field field) {
    for(int i = 0; i < SPEC_TYPE.values().length; i++) {
      if(field.getType().equals(SPEC_TYPE.values()[i].object)) return true;
    }
    return false;
  }
}
