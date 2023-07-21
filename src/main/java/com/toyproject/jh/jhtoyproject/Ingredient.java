package com.toyproject.jh.jhtoyproject;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public record Ingredient(String id, String name, com.toyproject.jh.jhtoyproject.Ingredient.Type type) {

  public static enum Type {
    WRAP, PROTEIN, VEGGIES, CHEESE, SAUCE
  }
}
