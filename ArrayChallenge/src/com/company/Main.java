package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

  private static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    // Create a program using arrays that sorts a list of integers in descending order.
    // Descending order is highest value to lowest.
    // In other words if the array had the values in it 106, 26, 81, 5, 15 your program should
    // ultimately have an array with 106, 81, 26, 15, 5 in it.
    // Set up the program so that the numbers to sort are read in from the keyboard.
    // Implement the following methods - getIntegers, printArray, and sortIntegers
    // getIntegers returns an array of entered integers from keyboard
    // printArray prints out the contents of the array
    // and sortIntegers should sort the array and return a new array containing the sorted numbers
    // you will have to figure out how to copy the array elements from the passed array into a new
    // array and sort them and return the new sorted array.
    printArray(anotherSort(getIntegers(5)));
  }

  public static int[] getIntegers(int number) {
    System.out.println("Enter " + number + " integer values");
    int[] values = new int[number];

    for(int i = 0; i < values.length; i++) {
      values[i] = scanner.nextInt();
    }

    return values;
  }

  public static int[] sortIntegers(int[] array) {

    int temp;

    for (int i = array.length - 1; i > 1; i--) {

      for(int j = 0; j < i; j++) {

        if(array[j] < array[j + 1]) {

          // swap the value
          temp = array[j];
          array[j] = array[j + 1];
          array[j + 1] = temp;

        }

        }
      }
      return array;
  }

  public static int[] anotherSort(int[] array) {

//    int[] sortedArray = new int[array.length];
//    for(int i = 0; i < array.length; i++) {
//      sortedArray[i] = array[i];
//    }

    int[] sortedArray = Arrays.copyOf(array, array.length);

    boolean flag = true;
    int temp;

    while(flag) {
      flag = false;

      for(int i = 0; i < sortedArray.length - 1; i++) {
        if(sortedArray[i] < sortedArray[i + 1]) {
          temp = sortedArray[i];
          sortedArray[i] = sortedArray[i + 1];
          sortedArray[i + 1] = temp;
          flag = true;
        }
      }
    }

    return sortedArray;

  }







  public static void printArray(int[] array) {
    System.out.println("========================");

    for(int i = 0; i < array.length; i++) {
      System.out.println("array[" + i + "] = " + array[i]);
    }

  }





}



















