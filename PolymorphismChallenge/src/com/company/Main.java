package com.company;


class Car {
  private String name;
  private int wheels;
  private boolean engine;
  private int cylinders;

  public Car(String name, int cylinders) {
    this.name = name;
    this.cylinders = cylinders;
    this.wheels = 4;
    this.engine = true;
  }

  public String getName() {
    return name;
  }

  public int getCylinders() {
    return cylinders;
  }

  public String startEngine() {
    return "Car -> startEngine()";

  }

  public String accelerate() {
    return "Car -> accelerate()";
  }

  public String brake() {
    return "Car -> brake";
  }
}


class Mitsubishi extends Car {
  public Mitsubishi(String name, int cylinders) {
    super(name, cylinders);
  }

  @Override
  public String startEngine() {
    return "Mitsubishi -> startEngine()";
  }

  @Override
  public String accelerate() {
    return "Mitsubishi -> accelerate()";
  }

  @Override
  public String brake() {
    return "Mitsubishi -> brake()";
  }
}

class Ford extends Car {
  public Ford(String name, int cylinders) {
    super(name, cylinders);
  }

  @Override
  public String startEngine() {
    return getClass().getSimpleName() + " -> startEngine()";
  }

  @Override
  public String accelerate() {
    return getClass().getSimpleName() + " -> accelerate()";
  }

  @Override
  public String brake() {
    return getClass().getSimpleName() + " -> brake()";
  }
}






public class Main {

  public static void main(String[] args) {
    // We are going to go back to the car analogy.
    // Create a base class called Car
    // It should have a few fields that would be appropriate for a generic car class.
    // engine, cylinders, wheels, etc.
    // Constructor should initialize cylinders (number of) and name, and set wheels to 4
    // and engine to true. Cylinders and names would be passed parameters.
    //
    // Create appropriate getters
    //
    // Create some methods like startEngine, accelerate, and brake
    //
    // show a message for each in the base class
    // Now create 3 sub classes for your favorite vehicles.
    // Override the appropriate methods to demonstrate polymorphism in use.
    // put all classes in the one java file (this one).

    Car car = new Car("Base car", 8);

    System.out.println(car.startEngine());
    System.out.println(car.accelerate());
    System.out.println(car.brake());

    Mitsubishi mitsubishi = new Mitsubishi("Outlander 4WD", 6);
    System.out.println(mitsubishi.startEngine());
    System.out.println(mitsubishi.accelerate());
    System.out.println(mitsubishi.brake());

    Ford ford = new Ford("Falcon", 6);
    System.out.println(ford.startEngine());
    System.out.println(ford.accelerate());
    System.out.println(ford.brake());


  }

}
