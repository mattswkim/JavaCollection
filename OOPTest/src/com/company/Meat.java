package com.company;

public class Meat {

  private String meatType;
  private int quantity;
  private double meatPrice;

  public Meat() {
    this.quantity = 1;
    this.meatPrice = 2;
    this.meatType = "beef";
  }

  public Meat(int quantity) {
    this.quantity = quantity;
    this.meatType = "beef";
    this.meatPrice = 2;
  }

  public double getMeatPrice() {
    return meatPrice;
  }
}
