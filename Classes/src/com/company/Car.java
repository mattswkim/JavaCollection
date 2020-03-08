package com.company;

public class Car {

  private int doors;
  private int wheels;
  private String model;
  private String engine;
  private String color;


  public Car (int doors, int wheels) {
    this.doors = doors;
    this.wheels = wheels;
    this.color = "silver";
    this.engine = "V6";
    this.color ="white";
  }

  public String getEngine() {
    return engine;
  }

  public void setEngine(String engine) {
    this.engine = engine;
  }

  public int getDoors() {
    return doors;
  }

  public void setDoors(int doors) {
    this.doors = doors;
  }

  public int getWheels() {
    return wheels;
  }

  public void setWheels(int wheels) {
    this.wheels = wheels;
  }

  public void setColor (String color) {
    this.color = color;
  }

  public String getColor() {
    return this.color;
  }

  public void setModel(String model) {
    String validModel = model.toLowerCase();
    if(validModel.equals("911") || validModel.equals("commodore")) {
      this.model = model;
    } else {
      this.model = "Unknown";
    }

  }

  public String getModel() {
    return this.model;
  }


  public void move () {
    System.out.println("The car has been moved");
  }


}
