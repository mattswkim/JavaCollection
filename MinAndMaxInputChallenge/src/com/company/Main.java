package com.company;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    minAndMaxInput();
  }
  // Minimum And Maximum Challenge

  // Read the numbers from the console entered by the user and print the minimum and
  // maximum number the user has entered.
  // If the user enters an invalid number, break out of the loop and print the minimum
  // and maximum number.
  // Hint:
  // Use a endless while loop
  // Bonus:
  // Create a project withe the name MinAndMaxInputChallenge

  public static void minAndMaxInput() {
    Scanner scanner = new Scanner(System.in);
    // if we set the min value to the maximum possible int
    // we don't need flag(boolean first)



    int minimumValue = 0; // 2147483647  or Integer.MAX_VALUE;
    int maximumValue = 0; // -2147483648 or Integer.MIN_VALUE;

    boolean first = true;

    while(true){
      System.out.println("Enter number:");
      boolean isAnInt = scanner.hasNextInt();

      if(isAnInt) {
        int number = scanner.nextInt();

        if(first) {
          minimumValue = number;
          maximumValue = number;
          first = false;
        }

        if(number > maximumValue){
          maximumValue = number;
        } else if(number < minimumValue) {
          minimumValue = number;
        }
      } else {
        System.out.println("Invalid Number");
        break;
      }
      System.out.println("Max = " + maximumValue + ", Min = " + minimumValue);


      scanner.nextLine();
    }

    scanner.close();

  }

}
