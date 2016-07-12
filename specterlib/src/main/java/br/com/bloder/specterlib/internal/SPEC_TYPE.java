package br.com.bloder.specterlib.internal;

import java.util.Map;

/**
 * Created by bloder on 12/07/16.
 */
public enum SPEC_TYPE {

  STRING(String.class),
  MAP(Map.class);

  public final Class<?> object;

  SPEC_TYPE(Class<?> specType) {
    this.object = specType;
  }
}
