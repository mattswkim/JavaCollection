package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(getLargestPrime(45));
        System.out.println(getLargestPrime1(45));
    }

    // find all the prime number
    public static int getLargestPrime1(int number){
        if(number < 0)
            return -1;
        int isPrime = 0;
        int biggestPrime = 0;


        for(int i = 2; i <= number; i++) {

            // find the prime numbers
            int count = 0;
            for(int j = 1; j < i; j++) {
                System.out.println("before count j = " + j + " i = " + i + " count " + count);
                if(i % j == 0 && i * j >= i) {
                    count++;
                }
                System.out.println("after count j = " + j + " i = " + i + " count " + count);
                if(count > 1) {
                    if(number % i == 0) {
                        isPrime = i;
                        break;
                    }
                }
            }

            if(isPrime * biggestPrime == number) {
                return biggestPrime;
            }
            System.out.println("isPrime = " + isPrime + " count = " + count);
            if(isPrime > biggestPrime){
                biggestPrime = isPrime;
            }
            System.out.println("biggest = " + biggestPrime + " isPrime " + isPrime);


        }
        return biggestPrime;
    }

    public static int getLargestPrime(int number) {
        // validate the input
        if (number <= 1) return -1;

        //
        int i;
        for (i = 2; i < number; i++) {
//            System.out.println("before if number = " + number + " i = " + i);
            if (number % i == 0) {
//                System.out.println("before /= number = " + number + " i = " + i);
                number /= i;
//                System.out.println("after /= number = " + number + " i = " + i);
                // see if there is an repeating prime
                i--;
//                System.out.println(" i-- = " + i);
            }
//            System.out.println("after if number = " + number + " i = " + i);
        }
        return i;
    }
}
