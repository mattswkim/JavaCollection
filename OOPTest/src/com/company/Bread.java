package com.company;

public class Bread {

  private String rollType;
  private int breadPrice;

  public Bread() {
    this("white");
  }

  public void setRollType(String rollType) {
    this.rollType = rollType;
  }

  public Bread(String rollType) {
    this.rollType = rollType;
    this.breadPrice = 2;
  }

  public int getBreadPrice() {
    return breadPrice;
  }
}
