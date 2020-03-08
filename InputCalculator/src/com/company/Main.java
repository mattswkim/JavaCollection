package com.company;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    inputThenPrintSumAndAverage();
  }




























  public static void inputThenPrintSumAndAverage() {
    Scanner scanner = new Scanner(System.in);

    int sum = 0;
    double average = 0;
    int count = 1;

    while(true) {
      boolean isAnInt = scanner.hasNextInt();
      if (isAnInt) {
        int number = scanner.nextInt();
        sum += number;
        average = Math.round((double)(sum) / count);

        count++;

      } else {
        System.out.println("SUM = " + sum + " AVG = " + average);
        break;
      }
      scanner.nextLine();

    }
    scanner.close();

  }

  public static void anotherInputThenPrintSumAndAverage(){
    Scanner scanner = new Scanner(System.in);
    int sum = 0;
    int count = 0;
    double average = 0;


    while(scanner.hasNextInt()) {
      int number = scanner.nextInt();

      sum += number;
      count++;
    }

    average = (sum) / (double)(count);

    System.out.println("Sum = " + sum + " AVG = " + average);
  }
}
