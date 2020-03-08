package com.company;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

//    Scanner scanner = new Scanner(System.in);
//
//    System.out.print("Enter your year of birth: ");
//
//    boolean hasNextInt = scanner.hasNextInt();
//
//    String mystr = "daf";
//
//    if(hasNextInt) {
//      int yearOfBirth = scanner.nextInt();
//      scanner.nextLine(); // handle next line character (enter key)
//
//      System.out.print("Enter your name: ");
//      String name = scanner.nextLine();
//      int age = 2019 - yearOfBirth;
//      if(age >= 0 && age <= 100) {
//        System.out.println("Your name is " + name + ", and you are " + age + " years old");
//      } else {
//        System.out.println("Invalid year of birth");
//      }
//    } else {
//      System.out.println("Unable to parse yaer of birth.");
//    }
//
//
//    scanner.close();

    readingUserInput();
  }

  // Reading User Input Challenge
  // Read 10 numbers from the console entered by the user and print the sum of those numbers.
  // Create a Scanner like we did in the previous video.
  // Use the hasNextInt() method from the scanner to check if the user has entered an int value.
  // If hasNextInt() returns false, print the message "Invalid Number". Continue reading until you read 10 numbers.
  // Use the nextInt() method to get the number and add it to the sum

  // Before the user enters each number, print the message "Enter number #x:" where x represents the count, i.e. 1,2,3,4 etc.
  // For example, the first message printed to the user would be "Enter number #1: ", the next " Enter number #2:", and so on.

  // Hint:
  // Use a while loop
  // Use a counter variable for counting valid numbers.
  // Close the scanner after you don't need it anymore.
  // Create a project with the name ReadingUserInputChallenge.

  public static void readingUserInput() {
    Scanner scanner = new Scanner(System.in);


    int count = 1;
    int sum = 0;

    while(count <= 10) {
      System.out.print("Enter number #" + count + ": ");
      boolean isAnInt = scanner.hasNextInt();

      if(isAnInt) {
        int number = scanner.nextInt();

        sum += number;
        count ++;
      } else {
        System.out.println("Invalid Number");

      }

      scanner.nextLine(); // handle end of line (enter key)


    }

    scanner.close();
    System.out.println("The sum is " + sum);


  }


  // Minimum And Maximum Challenge

  // Read the numbers from the console entered by the user and print the minimum and maximum number the user has entered.
  // If the user enters an invalid number, break out of the loop and print the minimum and maximum number.
  // Hint:
  // Use a endless while loop
  // Bonus:
  // Create a project withe the name MinAndMaxInputChallenge




}



















