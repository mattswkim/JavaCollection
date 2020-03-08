package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println("The sum of the digits in number 12 is "+sumDigits(12));

    }

    // Write a method with the name sumDigits that has one int parameter called number.
    // If parameter is >= 10 then the method should process the number and return sum of all digits,
    // otherwise return -1 to indicate an invalid value.
    // The numbers from 0-9 have 1 digit so we don't want to process them, also we don't want to process
    // negative numbers, so also return -1 for negative numbers.
    // For example calling the method sumDigits(125) should return 8 since 1 + 2 + 5 = 8.
    // Calling the method sumDigits(1) should return -1 as per requirements described above.

    // Add some code to the main method to test out the sumDigits method to determine that it is
    // working correctly for valid and invalid values passed as arguments.

    // Hits:
    // Use n % 10 to extract the least-significant digit.
    // Use n = n / 10 to discard the least-significant digit.
    // The method needs to be static like other methods so far in the course.

    // Tip:
    // Create a project with the name DigitSumChallenge.


    public static int sumDigits(int number) {

        if((number < 10)) {
            return -1;
        }

        int sum = 0;

//        int result = (number / 100) + ((number % 100) / 10) + (number - (number / 10 * 10)) + ((number % 100) % 10);
//
        while (number > 0) {

            // extract the least-significant digit
            int digit = number % 10;
            System.out.println("digit " + digit + " num " + number);
            sum += digit;

            // drop the least-significant digit
            number /= 10; // same as number = number / 10;
            System.out.println("drop sum " + sum + " num "  + number);
        }

        return sum;


    }
}
