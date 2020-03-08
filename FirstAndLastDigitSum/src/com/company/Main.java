package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(-5));

    }

    public static int sumFirstAndLastDigit(int number) {


        // validate the value
        if(number < 0) {
            return -1;
        }

        int sum = 0;
        int count = 0;


        // get the first digit and add it
        while(number != 0) {

            if(count == 0) {
                if(number < 10) {
                    sum += number;
                }
                sum += (number % 10);
            }

            number /= 10;
            if(number < 10) {
                sum += number;
            }
            count ++;

        }

        return sum;
    }
}

















































