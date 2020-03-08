package com.company;

public class Main {

    public static void main(String[] args) {
      Car porsche = new Car(3,4);
      Car BMW = new Car(2,3);
//      Car avante = new Car();
//      Car myChiron = new Car(4,3,"chiron","V8","Yellow");


//      avante.setDoors(2);
//      avante.setModel("1967");
//      avante.setWheels(3);
//      avante.setColor("White");
//      myChiron.setColor("Gold");
      System.out.println("The color of your Chiron is " + porsche.getColor());

      System.out.println("The number of doors is " + BMW.getDoors());
      System.out.println("Model is " + porsche.getModel());

      porsche.move();

    }

}
