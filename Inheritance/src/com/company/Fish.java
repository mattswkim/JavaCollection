package com.company;

public class Fish extends Animal {

  private int gills;
  private int eyes;
  private int fins;

  public Fish(String name, int size, int weight, int gills, int eyes, int fins) {
    super(name, size, weight);
    this.gills = gills;
    this.eyes = eyes;
    this.fins = fins;
  }

  public Fish(String name, int size, int weight) {
    super(name, size, weight);
  }

  public Fish() {
  }

  public void swim() {
    System.out.println("Fish is swimming now");
  }

  private void rest() {

  }

  private void moveMuscles() {

  }

  private void moveBackFin() {

  }

  private void swim(int speed) {
    moveMuscles();
    moveBackFin();
    super.move(speed);
  }
}
