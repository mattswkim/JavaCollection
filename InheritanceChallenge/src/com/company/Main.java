package com.company;

public class Main extends Object {

  public static void main(String[] args) {
    // Challenge.
    // Start with a base class of aVehicle, then create a Car class that inherits from this base class.
    // Finally, create another class, a specific type of Car that inherits from the Car class.
    // You should be able to hand steering, changing gears, and moving (speed in other words).
    // You will want to decide where to put the appropriate state and behaviours ( fields and methods)
    // As mentioned above, changing gears, increasing/decreasing speed should be included.
    // For you specific type of vehicle you will want to add something specific for that type of car.


    Volvo xc90 = new Volvo(120);

    xc90.steer(40);
    xc90.accelerate(30);
    xc90.accelerate(-31);

  }
}
