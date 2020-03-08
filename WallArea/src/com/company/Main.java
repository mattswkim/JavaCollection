package com.company;

public class Main {

    public static void main(String[] args) {
      Wall wall = new Wall();
      wall.setWidth(-12.5);
      wall.setHeight(-12.5);
      Wall anotherWall = new Wall(-1.0,-2.0);
      System.out.println("anotherWall " + anotherWall.getHeight());
        System.out.println("width = " + wall.getWidth());
      System.out.println("height = " + wall.getHeight());
    }
}
