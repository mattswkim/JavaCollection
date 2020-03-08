package com.company;

import java.util.ArrayList;

class IntClass {
  private int myInt;

  public IntClass(int myInt) {
    this.myInt = myInt;
  }

  public int getMyInt() {
    return myInt;
  }

  public void setMyInt(int myInt) {
    this.myInt = myInt;
  }
}

public class Main {



  public static void main(String[] args) {
    String[] strArray = new String[10];
    int[] intArray = new int[10];

    ArrayList<String> strArrayList = new ArrayList<>();
    strArrayList.add("time");

//        ArrayList<int> intArrayList = new ArrayList<int>();

    ArrayList<IntClass> intClassArrayList = new ArrayList<IntClass>();
    intClassArrayList.add(new IntClass(54));


    Integer integer = 54;
    Double doubleValue = new Double(23.23);


    ArrayList<Integer> intArrayList = new ArrayList<Integer>();
    // auto boxing
    for (int i = 0; i <= 10; i++) {
      intArrayList.add(Integer.valueOf(i));
    }

    //unboxing
    for (int i = 0; i <= 10; i++) {
      System.out.println(i + "----->" + intArrayList.get(i).intValue());
    }

    Integer myIntValue = 56; // Interger.valueOf(56);
    int myInt = myIntValue; // myInt.intValue();


    ArrayList<Double> myDoubuleValues = new ArrayList<Double>();
    for (double  dbl = 0; dbl <= 10.0; dbl += 0.5) {
      myDoubuleValues.add(dbl);
    }

    for (int i = 0; i < myDoubuleValues.size(); i++) {
      double value = myDoubuleValues.get(i);
      System.out.println(i + " ---> " + value);
    }


  }
}



























