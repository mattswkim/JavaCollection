package com.company;

public class Tomato {

  private int quantity;
  private double tomatoPrice;

  public double getTomatoPrice() {
    return tomatoPrice;
  }

  public Tomato() {
    this(0);
  }

  public int getQuantity() {
    return quantity;
  }

  public Tomato(int quantity) {
    this.quantity = quantity;
    this.tomatoPrice = 1.5;
  }
}
