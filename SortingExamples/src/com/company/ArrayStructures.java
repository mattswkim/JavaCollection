package com.company;

public class ArrayStructures {

  private int[] theArray = new int[50];
  private int arraySize = 10;


  public void generateRandomArray() {

    for(int i = 0; i < arraySize; i++) {

      theArray[i] = (int) (Math.random() * 10) + 10;

    }

  }

  public void printArray() {

    System.out.println("----------");
    for(int i = 0; i < arraySize; i++) {

      System.out.print("| " + i + " | ");
      System.out.println(theArray[i] + " |");

      System.out.println("----------");

    }
  }

  public int getValueAtIndex(int index) {
    if(index < arraySize) return theArray[index];

    return 0;
  }

  public boolean doesArrayContainThisValue(int searchValue) {
    boolean valueInArray = false;
    for(int i = 0; i < arraySize; i++) {
      if(theArray[i] == searchValue) {
        valueInArray = true;
      }
    }
    return valueInArray;
  }

  public void deleteIndex(int index) {
    if(index < arraySize) {
      for(int i = index; i < (arraySize - 1); i++) {
        theArray[i] = theArray[i + 1];
      }
      arraySize--;
    }
  }

  public void insertValue(int value) {
    if(arraySize < 50) {
      theArray[arraySize] = value;
      arraySize++;
    }
  }

  public String linearSearchForValue(int value) {

    boolean valueInArray = false;

    String indexWithValue = "";

    for(int i = 0; i < arraySize; i++) {

      if(theArray[i] == value) {

        valueInArray = true;

        indexWithValue += i + " ";

      }

      printHorzArray(i, -1);

    }

    if(!valueInArray) {

      indexWithValue = "None";

    }

    System.out.print("The value was Found in the Following: " + indexWithValue);

    System.out.println();

    return indexWithValue;
  }

  public void printHorzArray(int i, int j) {

    for(int n = 0; n < 51; n++) System.out.print("-");

    System.out.println();

    for(int n = 0; n < arraySize; n++) {

      System.out.print("| " + n + "  ");

    }

    System.out.println("|");

    for(int n = 0; n < 51; n++) System.out.print("-");

    System.out.println();

    for(int n = 0; n < arraySize; n++) {

      System.out.print("| " + theArray[n] + " ");

    }

    System.out.println("|");

    for(int n = 0; n < 51; n++) System.out.print("-");

    System.out.println();

    // End of First Part

    // Added for Bubble Sort
    if(j != -1) {

      // ADD THE +2 TO FIX SPACING

      for(int k = 0; k < ((j * 5 ) + 2); k++) System.out.print(" ");

      System.out.print(j);
    }

    // THEN ADD THIS CODE

    if(i != -1) {

      // ADD THE -1 TO FIX SPACING

      for(int l = 0; l < (5 * (i - j) - 1); l++) System.out.print(" ");

      System.out.print(i);
    }
    System.out.println();
  }

  // This bubble sort will sort everything from
  // smallest to largest
  public void bubbleSort() {

    // i starts at the end of the Array
    // As it is decremented all indexes greater
    // then it are sorted
    // To avoid resorting already sorted item.

    for(int i = arraySize - 1; i > 1; i--) {

      // The inner loop starts at the beginning of
      // the array and compares each value next to each
      // other. If the value is greater then they are
      // swapped

      for(int j = 0; j < i; j++) {

        // To change sort to Descending change to <

        if(theArray[j] > theArray[j+1]) {

          swapValues(j,j+1);

          System.out.print("j");
          printHorzArray(i,j);

        }
        System.out.print("i");
        printHorzArray(i, j);

      }

    }

  }

  public void swapValues(int indexOne, int indexTwo) {

    int temp = theArray[indexOne];

    theArray[indexOne] = theArray[indexTwo];

    theArray[indexTwo] = temp;

  }

  // The Binary Search is quicker than the linear search
  // because all the values are sorted. Because everything
  // is sorted once you get to a number larger than what
  // you are looking for you can stop the search. Also
  // you be able to start searching from the middle which
  // speeds the search. It also works best when there are
  // no duplicates.

  public void binarySearchForValue(int value) {

    int lowIndex = 0;
    int highIndex = arraySize - 1;

    while(lowIndex <= highIndex) {

      int middleIndex = (highIndex + lowIndex) /2;

      if(theArray[middleIndex] < value) lowIndex = middleIndex + 1;

      else if(theArray[middleIndex] > value) highIndex = middleIndex - 1;

      else {

        System.out.println("\nFound a Match for " + value + " at Index " + middleIndex);

        lowIndex = highIndex + 1;

      }

      printHorzArray(middleIndex, -1);

    }

  }

  // Selection sort search for the smallest number in the array
  // saves it in the minimum spot and then repeats searching
  // through the entire array each time

  public void selectionSort() {

    for(int x = 0; x < arraySize; x++) {
      int minimum = x;

      for(int y = x; y < arraySize; y++) {

        // To change direction of sort just change this from < to >

        if(theArray[minimum] > theArray[y]) {
          minimum = y;
        }

        swapValues(x, minimum);

        System.out.print("y" +y);
        printHorzArray(x, -1);
      }
      System.out.print("x" +x);
      printHorzArray(x, -1);

    }

  }

  // The Insertion Sort is normally the best of
  // the elementary sorts. Unlike the other sorts that
  // had a group sorted at any given time, groups are
  // only partially sorted here.

  public void insertionSort() {

    for(int i = 1; i < arraySize; i++) {
      int j = i;
      int toInsert = theArray[i];

      while((j > 0) && (theArray[j - 1] > toInsert)) {
        theArray[j] = theArray[j - 1];
        j--;

        System.out.print("w");
        printHorzArray(i, j);

      }
      theArray[j] = toInsert;

      printHorzArray(i, j);

      System.out.println("\nArray[" + i + "] = " + theArray[i]
              + " Array[" + j + "] = " + theArray[j]
              + " toInsert = " + toInsert
              + "\n");



    }


  }




}


