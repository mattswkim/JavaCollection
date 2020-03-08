package com.company;

public class Main {

  public static void main(String[] args) {

//        Player player = new Player();
//        player.fullName = "Matt";
//        player.weapon = "Sword";
//        player.health = 20;
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("Remaining health is " + player.healthRemaining());
//
//        damage = 11;
//        player.health = 200;
//        player.loseHealth(damage);
//        System.out.println("Remaining health is " + player.healthRemaining());


    EnhancedPlayer player = new EnhancedPlayer("Matt",200, "Sword");
    System.out.println("Initial health is " + player.getHealth());



  }

}
