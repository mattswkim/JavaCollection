package com.company;

import java.util.Scanner;

public class Main {

  private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
      int[] myIntArray = new int[2];
      int[] scores = new int[10];
      String[] students = {"matt", "Den", "bob","mary"};

      scores[0] = 12;

      students[0] = "Matt";
      students[1] = "Dennis";
      students[2] = "bob";
      students[3] = "Mary";
      String[] teacher = {"bill","Steve","Jobs"};
      String newName ="" ;

//      System.out.println("names of the teachers \n"+printArray(teacher));


      String name = getInput();

      while (name != "Dennis") {
        if (name.equals("Dennis")) {
          System.out.println("Hi, Dennis.\n Welcome back!");
          break;
        } else {
          System.out.println("You are not allowed.");
          System.out.println(name == "Dennis");
          name = getInput();
        }
      }




//      students[3] = "david";


//      myIntArray[0] = 45;
//      myIntArray[0] = 30;
//      myIntArray[5] = 50;

//      printArray(myIntArray);
//      printArray(scores);

//      double[] myDoubleArray = new double[10];
////      System.out.println(myIntArray[5]);
//
//
//
//      for(int i = 0; i < scores.length; i++) {
//        System.out.println("i = "+ i + " scores[i] = " + scores[i]);
//      }


//      // another usage
//      int[] myIntArrayInput = getIntegers(5);
//      for (int i = 0; i < myIntArrayInput.length; i++) {
//        System.out.println("Element " + i + ", value is " + myIntArrayInput[i]);
//      }
//      System.out.println("The average is " + getAverage(myIntArrayInput));

//      printArray(getIntegers(4));

    }

    // get user input
  public static String getInput() {
      Scanner scanner = new Scanner(System.in);
    System.out.print("Enter your name: ");
    String name = scanner.nextLine();

    return name;

  }

    // returns values form the array to string
    public static String printArray(String[] name) {
      // initialize String varialbe to store all the values from the array
      String newName = "";
      // loops through the array
      for (int i = 0; i < name.length; i++) {
        newName += name[i];
      }
      return  newName;
    }






    public static int[] getIntegers(int number) {
      System.out.println("Enter " + number + " integer values. \r");
      int[] values = new int[number];

      for (int i = 0; i < values.length; i++) {
        values[i] = scanner.nextInt();
      }
      return values;
    }

    public static double getAverage(int[] array) {
      int sum = 0;
      for (int i = 0; i < array.length; i++) {
        sum += array[i];
      }
      return (double) sum / (double) array.length;
    }


    public static void printArray(int[] array) {
      for(int i = 0; i < array.length; i++) {
        array[i] = i;
        System.out.println("Element " + i + ", value is " + array[i]);
      }
    }
}
