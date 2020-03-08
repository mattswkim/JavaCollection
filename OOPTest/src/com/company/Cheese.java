package com.company;

public class Cheese {

  private int quantity;
  private double cheesePrice;

  public Cheese() {
    this(0);
  }
  public Cheese(int quantity) {
    this.quantity = quantity;
    this.cheesePrice = 2.5;
  }


  public int getQuantity() {
    return quantity;
  }

  public double getCheesePrice() {
    return cheesePrice;
  }
}
