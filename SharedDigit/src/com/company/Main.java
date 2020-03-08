package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12,23));
    }

    public static boolean hasSharedDigit(int firstNumber, int secondNumber) {

        if((firstNumber < 10 || firstNumber > 99) || (secondNumber < 10 || secondNumber > 99)) {
            return false;
        }

        // separate the second number
        int onesOfNumber2 = secondNumber % 10;
        int tensOfNumber2 = secondNumber / 10;

        // separate the first number
        while(firstNumber > 0) {
            // get ones place number from number1
            int onesOfNumber1 = firstNumber % 10;

            // check if there's a shared number
            if((onesOfNumber1 == onesOfNumber2) || (tensOfNumber2 == onesOfNumber1)) {
                return true;
            }

            firstNumber /= 10;

        }

        return false;
    }
}
