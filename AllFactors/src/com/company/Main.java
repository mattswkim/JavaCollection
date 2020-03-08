package com.company;

import java.util.Arrays;
import java.util.List;

public class Main {


    public static void main(String[] args) {
        findFactors(6);
        printFactors(findFactors(6));
    }

    public static int findFactors(int number) {
        if(number < 1) {
            System.out.println("Invalid Value");
        }

        int counter = 1;
        List<Arrays> name = [1,2,3];
        for(int i = 1; i <= number; i++) {

            if(number % i == 0) {
                smapleInteger.toString(i));
                counter ++;
            }
        }
        System.out.println(smaple);
        return counter;

    }

    public static void printFactors(int number) {
        System.out.println(" |");
        System.out.print("  ");
        for (int i = 0; i < number; i ++){
            System.out.print("---");
        }
    }
}









































