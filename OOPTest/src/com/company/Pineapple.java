package com.company;

public class Pineapple {
  private int quantity;
  private double pineapplePrice;

  public int getQuantity() {
    return quantity;
  }

  public double getPineapplePrice() {
    return pineapplePrice;
  }

  public Pineapple() {
    this(0);
  }


  public Pineapple(int quantity) {
    this.quantity = quantity;
    this.pineapplePrice = 1.5;
  }
}
