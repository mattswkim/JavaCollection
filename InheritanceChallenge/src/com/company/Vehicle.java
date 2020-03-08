package com.company;

public class Vehicle {

  private String name;
  private int weight;
  private int size;

  private int currentVelocity;
  private int currentDirection;

  public Vehicle(String name, int weight, int size) {
    this.name = name;
    this.weight = weight;
    this.size = size;
    this.currentVelocity = 0;
    this.currentDirection = 0;
  }


  public void steer(int direction) {
    this.currentDirection += direction;
    System.out.println("Vehicle.steer(): Steering at " + currentDirection + " degrees.");

  }

  public void move(int velocity, int direction) {
    currentDirection = direction;
    currentVelocity = velocity;
    System.out.println("Vehicle.move(): Moving at " + currentVelocity + " in direction " + currentDirection);
  }

  public void stop() {
    this.currentVelocity = 0;

  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getWeight() {
    return weight;
  }

  public void setWeight(int weight) {
    this.weight = weight;
  }

  public int getSize() {
    return size;
  }

  public void setSize(int size) {
    this.size = size;
  }

  public int getCurrentVelocity() {
    return currentVelocity;
  }

  public void setCurrentVelocity(int currentVelocity) {
    this.currentVelocity = currentVelocity;
  }

  public int getCurrentDirection() {
    return currentDirection;
  }

  public void setCurrentDirection(int currentDirection) {
    this.currentDirection = currentDirection;
  }
}
