package com.company;

import java.util.Arrays;

public class Main {

    // Write a method called reverse() with an in array as a parameter
    // The method should not return any value. In other words, the method
    // is allowed to modify the array parameter.
    //
    // In main() test the reverse() method and print the array both reversed
    // and non-reversed.
    //
    // To reverse the array, you have to swap the elements, so that the first element
    // is swapped with the last element and so on.
    //
    // For example, if the array is {1, 2, 3, 4, 5}, then the reversed array is
    // {5, 4, 3, 2 ,1}.

    // Tip:
    // Create a new console project with the name 'ReverseArrayChallenge'


    public static void reverse(int[] array) {
        int[] reversedArray = new int[array.length];

        for(int i = 0; i < array.length; i++) {
            reversedArray[i] = array[(array.length - 1) - i];
        }
        System.out.println("non-reversed arr " + Arrays.toString(array));
        System.out.println("reversed arr " + Arrays.toString(reversedArray));
    }

    public static void reverse1(int[] array) {

        int maxIndex = array.length - 1;
        int halfLength = array.length / 2;

        // swap the last to the first
        for(int i = 0; i < halfLength; i++) {

            int temp = array[i];
            array[i] = array[maxIndex - i];
            array[maxIndex - i] = temp;

        }

        System.out.println(Arrays.toString(array));


    }

    public static void main(String[] args) {

        int[] myIntArray = {1, 5, 3, 7, 11, 9};

        reverse(myIntArray);

        reverse1(myIntArray);


    }
}
