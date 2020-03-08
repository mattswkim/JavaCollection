package com.company;

public class Burger {

  private Bread bread;
  private Meat meat;
  private double price;
  private Pineapple pineapple;
  private Cheese cheese;
  private Tomato tomato;
  private Lettuce lettuce;
  private double basePrice = 4;


  public Burger(Bread bread, Meat meat) {
    this.bread = bread;
    this.meat = meat;
    this.price = this.bread.getBreadPrice() + this.meat.getMeatPrice();
  }

  public double getBasePrice() {
    return basePrice;
  }

  public Burger(Bread bread, Meat meat, Pineapple pineapple, Cheese cheese, Tomato tomato, Lettuce lettuce) {
    this.bread = bread;
    this.meat = meat;
    this.pineapple = pineapple;

    this.cheese = cheese;
    this.tomato = tomato;
    this.lettuce = lettuce;
    this.price = (basePrice
            + (pineapple.getQuantity() * pineapple.getPineapplePrice())
            + (cheese.getCheesePrice() * cheese.getQuantity())
            + (tomato.getQuantity() * tomato.getTomatoPrice())
            + (lettuce.getLettucePrice() * lettuce.getQuantity()));
    System.out.println("Your base burger is ready.");
    additionCalculator();
    priceCalculator();
  }

  public void additionCalculator() {
    if(this.pineapple.getQuantity() > 0) {
      System.out.println(this.pineapple.getQuantity()
              + " pineapple has been added $"
              +(this.pineapple.getQuantity() * this.pineapple.getPineapplePrice()));
    }
    if(this.cheese.getQuantity() > 0) {
      System.out.println(this.cheese.getQuantity()
              + " cheese has been added $"
              +(this.cheese.getQuantity() * this.cheese.getCheesePrice()));
    }
    if(this.lettuce.getQuantity() > 0) {
      System.out.println(this.lettuce.getQuantity()
              + " lettuce has been added $"
              + (this.lettuce.getQuantity() * this.lettuce.getLettucePrice()));
    }
    if(this.tomato.getQuantity() > 0) {
      System.out.println(this.tomato.getQuantity()
              + " has been added $"
              + (this.tomato.getQuantity() * this.tomato.getTomatoPrice()));
    }
  }

  public void priceCalculator() {
    this.price = (basePrice
            + (pineapple.getQuantity() * pineapple.getPineapplePrice())
            + (cheese.getCheesePrice() * cheese.getQuantity())
            + (tomato.getQuantity() * tomato.getTomatoPrice())
            + (lettuce.getLettucePrice() * lettuce.getQuantity()));
    System.out.println("The total for Base Burger is $" + price);
    System.out.println("========================================");
  }


}

class HealthyBurger extends Burger {

  private Cheese cheese;
  private Tomato tomato;

  @Override
  public void additionCalculator() {

    if(this.cheese.getQuantity() > 0) {
      System.out.println(this.cheese.getQuantity()
              + " cheese has been added $"
              +(this.cheese.getQuantity() * this.cheese.getCheesePrice()));
    }

    if(this.tomato.getQuantity() > 0) {
      System.out.println(this.tomato.getQuantity()
              + " has been added $"
              + (this.tomato.getQuantity() * this.tomato.getTomatoPrice()));
    }
  }

  public HealthyBurger(Bread bread, Meat meat, Cheese cheese, Tomato tomato) {
    super(bread, meat);
    this.cheese = cheese;
    this.tomato = tomato;

    System.out.println("Your Healthy burger is ready");
    additionCalculator();
    priceCalculator();
  }

  @Override
  public void priceCalculator() {
    double price = this.getBasePrice()
            + (cheese.getCheesePrice() * cheese.getQuantity())
            + (tomato.getTomatoPrice() * tomato.getQuantity());
    System.out.println("The total for healthy burger is $" + price);

  }
}

