package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(81,153));
    }

    public static int getGreatestCommonDivisor(int first, int second) {
        // validate the numbers
        if(first < 10 || second < 10) {
            return -1;
        }

        int commonDivisor = 0;
        int firstDivisor = 0;
        int secondDivisor = 0;
        int biggerNumber;
        // get bigger number for for loop
        if(first > second)
            biggerNumber = first;
         else if(second > first)
            biggerNumber = second;
         else
            biggerNumber = first;


        // find the common divisors of the two numbers
        for(int i = 1; i <= biggerNumber; i++) {


            if(first % i == 0){
                firstDivisor = i;
            }

            if(second % i == 0) {
                secondDivisor = i;
            }

            // compare two common divisors
            if(firstDivisor == secondDivisor) {
                commonDivisor = firstDivisor;
            }

            // return the greatest common divisor

        } return commonDivisor;

    }
}








































