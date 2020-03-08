package com.company;

public class Main {

    public static void main(String[] args) {

        ArrayStructures newArray = new ArrayStructures();

        newArray.generateRandomArray();

        newArray.insertionSort();


        for(int i = 0; i < 51; i++) System.out.print("-");
        System.out.println();
        System.out.println("selection sort is done");

        newArray. binarySearchForValue(11);
    }


}
