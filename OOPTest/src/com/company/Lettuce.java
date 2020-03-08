package com.company;

public class Lettuce {
  private int quantity;
  private double lettucePrice;

  public double getLettucePrice() {
    return lettucePrice;
  }

  public int getQuantity() {
    return quantity;
  }

  public Lettuce() {
    this(0);
  }

  public Lettuce(int quantity) {
    this.quantity = quantity;
    this.lettucePrice = 1.25;
  }
}
