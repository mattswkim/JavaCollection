package com.company;

public class Main {

    public static void main(String[] args) {
      Animal animal = new Animal("Animal",  5, 5);

      Dog dog = new Dog("YorkiE", 8, 20, 2, 4, 1, 20, "long silky");
//      dog.eat();

      Dog caine = new Dog("hobit",1,1,5,5,1,34,"good");



//      System.out.println(dog.getName());
//      System.out.println(caine.getName());
//      dog.walk();
////      dog.run();
//
//      animal.move(3);
//      dog.move(3);
//
//      Fish goldFish = new Fish();
//
//      goldFish.swim();

      Bird parrot = new Bird("bob",2,3,"green");

      parrot.eat();

    }
}
