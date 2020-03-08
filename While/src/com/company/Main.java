package com.company;

import java.util.Scanner;

public class Main {
  public static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
//    int count = 1;
//    while(count != 6) {
//      System.out.println("Count value from while loop is " + count);
//      count ++;
//    }
//
//    //FOR LOOP BELOW IS NOT IDENTICAL TO THE ABOVE WHILE LOOP!
//    for(int i = 1; i < 6; i++) {
//      System.out.println("Count value from for loop is " + i);
//    }
//
//    for(count = 1; count !=6; count ++) {
//      System.out.println("Count value from new for loop is " + count);
//    }
//
//    count = 1;
//    while(true) {
//      if(count ==6) {
//        break;
//      }
//      System.out.println("Count value is " + count);
//      count++;
//    }
//    count =1;
//    do {
//      System.out.println("Count value using do while loop " + count);
//      count++;
//    } while(count != 6);
//
//    int number = 4;
//    int finishNumber = 20;
//    int countWhile = 0;
//
//    while(number <= finishNumber) {
//      number++;
//      if(!isEvenNumber(number)) {
//        continue;
//      }
//
//      System.out.println("Even number " + number);
//    }

    // Modify the while code above
    // Make it also record the total number of even numbers it has found
    // and break once 5 are found
    // and at the end, display the total number of even numbers found


//    int countWhile = 0;
////
////    while(number <= finishNumber) {
////      number++;
////      if(!isEvenNumber(number)) {
////        continue;
////      }
////      countWhile++;
////      System.out.println("Even number " + number);
////      if(countWhile  >= 5){
////        break;
////      }
////    }System.out.println(countWhile);


    System.out.println("enter 0 to quit");
    System.out.println("enter 1 to turn on the A/C");
    boolean quit = false;

    while (!quit) {
      int action = scanner.nextInt();
      scanner.nextLine();


      switch (action) {
        case 0:
          System.out.println("quitting");
          quit = true;
          break;
        case 1:
          System.out.println("turn on the A/C");
          break;
      }
    }

  }


  // Create a method called isEvenNumber that takes a parameter of type int
  // Its purpose is to determine if the argument passed to the method is
  // an even number or not.
  // return true if an even number, otherwise return false;

  public static boolean isEvenNumber(int number) {
    if((number % 2) == 0) {
      return true;
    }
    return false;
  }
}
