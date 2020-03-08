package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("isValid " + isValid(9));
        System.out.println(hasSameLastDigit(23,32,42));
    }

    public static boolean hasSameLastDigit(int firstNumber, int secondNumber, int thirdNumber) {

        // validate the data
        if(!isValid(firstNumber) || !isValid(secondNumber) || !isValid(thirdNumber)) {
            return false;
        }


        // separate last digits from the firstNumber
        int onesFromFirstNum = firstNumber % 10;
        int onesFromSecondNum = secondNumber % 10;
        int onesFromThirdNum = thirdNumber % 10;


        // compare the first two numbers
        if((onesFromFirstNum == onesFromSecondNum)
            || (onesFromSecondNum == onesFromThirdNum)
            || (onesFromFirstNum == onesFromThirdNum)) {
            return true;
        }

        // compare last two numbers


        return false;


    }

    public static boolean isValid(int number) {
        // validate the data received
        if((number < 10) || (number > 1000)) {
            return false;
        }
        return true;
    }
}
