package com.company;

public class Main {

    public static void main(String[] args) {

        // int has a width of 32
        int myMinValue = -2_147_483_648;
        int myMaxValue = 2_147_483_647;
        int myTotal = (myMinValue/2);
        System.out.println("myTotal = " + myTotal);

        // byte has a width of 8
        byte myByteValue = 127;
        byte myNewByteValue = (byte) (myByteValue/2);
        System.out.println("myNewByteValue = " + myNewByteValue);

        // short has a width of 16
        short myShortValue = 32767;
        short myNewShortValue = (short) (myShortValue/2);
        System.out.println("myNewShortValue = " + myNewShortValue);

        // long has a width of 64
        long myLongValue = -9_223_372_036_854_775_808L;


        long newVari = (long)(myMaxValue) + (long)(myByteValue);
        System.out.println("newVari " + newVari);


        //1. Create a byte variable and set it at any valid byte number.
        //2. Create a short variable and set it at any valid short number.
        //3. Create a int variable and set it to any valid int number.
        //4. Create a variable of type long, and make it equal to
        //   50000 + 10 times the sum of the byte, plus the short plus the int.

        byte myByteVariable = 100;












        byte randomByteValue = 25;
        short randomShortValue = 30;
        int randomIntValue = 20;
        long totalValue = 50000L + (10L * (randomByteValue + randomIntValue + randomShortValue));
        System.out.println("totalValue = " + totalValue);
    }
}
