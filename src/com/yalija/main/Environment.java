package com.yalija.main;

import java.util.HashMap;
import java.util.Map;

public class Environment {
  final Environment enclosingEnvironment;
  private final Map<String, Object> values = new HashMap<>();

  Environment() {
    enclosingEnvironment = null;
  }

  Environment(Environment enclosingEnvironment) {
    this.enclosingEnvironment = enclosingEnvironment;
  }

  Object get(Token name) {
    if (values.containsKey(name.lexeme)) {
      return values.get(name.lexeme);
    }

    if (enclosingEnvironment != null) return enclosingEnvironment.get(name);

    throw new RuntimeError(name, "Undefined variable '" + name.lexeme + "'.");
  }

  void assign(Token name, Object value) {
    if (values.containsKey(name.lexeme)) {
      values.put(name.lexeme, value);
      return;
    }

    if (enclosingEnvironment != null) {
      enclosingEnvironment.assign(name, value);
      return;
    }

    throw new RuntimeError(name, "Undefined variable '" + name.lexeme + "'.");
  }

  void define(String name, Object value) {
    values.put(name, value);
  }
}
