package com.company;

public class Animal {

  private int brain;
  private int body;
  private int size;
  private int weight;
  private String name;


  public Animal(String name, int size, int weight) {
    this.name = name;
    this.brain = 1;
    this.body = 1;
    this.size = size;
    this.weight = weight;
  }

  public Animal() {
  }

  public void eat() {
    System.out.println("Animal.eat() called");
  }

  public void move(int speed) {
    System.out.println("Animal.move() called. Animal is moving at " + speed);

  }

  public String getName() {
    return name;
  }

  public int getBrain() {
    return brain;
  }

  public int getBody() {
    return body;
  }

  public int getSize() {
    return size;
  }

  public int getWeight() {
    return weight;
  }


}
