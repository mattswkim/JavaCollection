package com.company;

public class Bird extends Animal {

  private int wings;
  private int beaks;
  private String featherColor;

  public Bird(String name,  int size, int weight,  String featherColor) {
    super(name, size, weight);
    this.wings = 2;
    this.beaks = 1;
    this.featherColor = featherColor;
  }

  public Bird(String name) {
    super(name, 1, 2);
  }

  public Bird() {
  }


}
