package com.company;

public class Main {

  public static void main(String[] args) {
//    isPalindrome(125);
//    System.out.println(isPalindrome(12212));

//    int num = 123456789;
//    int sum = 0;
//
//    while (num != 0) {
//      int digit = num % 10;
//      sum += digit;
//      num /= 10;
//    }
//    System.out.println(sum);
    int k = 1;
    while (k < 21) {
      System.out.print("-");
      k++;
    }
    k = 1;
    while (k < 15) {
      System.out.print(" ");
      k++;
    }
    k = 1;
    while (k < 21) {
      System.out.print("-");
      k++;
    }
    System.out.println();


    for (int i = 0; i < 3; i++) {
      System.out.print("|");
      k = 1;
      while (k < 19) {
        System.out.print(" ");
        k++;
      }
      System.out.print("|");

      k = 1;
      while (k < 15) {
        System.out.print(" ");
        k++;
      }
      System.out.print("|");
      k = 1;
      while (k < 19) {
        System.out.print(" ");
        k++;
      }
      System.out.println("|");

    }

    k = 1;
    while (k < 21) {
      System.out.print("-");
      k++;
    }
    k = 1;
    while (k < 15) {
      System.out.print(" ");
      k++;
    }
    k = 1;
    while (k < 21) {
      System.out.print("-");
      k++;
    }
    System.out.println();
    k = 1;
    while (k < 27) {
      System.out.print(" ");
      k++;
    }
    System.out.println("/\\");
    k = 1;
    while (k < 26) {
      System.out.print(" ");
      k++;
    }
    System.out.println("/  \\");
    k = 1;
    while (k < 25) {
      System.out.print(" ");
      k++;
    }
    System.out.println("/    \\");
  }













































//  public static boolean isPalindrome(int number) {
//    int reverse = 0;
//    int original = number;
//    // reverse the original number
//    while(number != 0) {
//      int digit = number % 10;
//      reverse = reverse * 10 + digit;
//      number /= 10;
//    }
//    // check if the number is palindrome
//    if(reverse == original) {
//      return true;
//    }
//    return false;
//  }
}
