package com.company;

public class Main {

    public static void main(String[] args) {
      printSquareStar(2);
    }

    public static void printSquareStar(int number) {
        if(number < 5) {
            System.out.println("Invalid Value");
            return;
        }
        int rowCount = 1;

        for(int i = 0; i < number; i++) {
            if(number < 5) {
                System.out.println("Invalid Value");
                break;
            }

            System.out.print("*");
            int columnCount = 1;
            for(int j = 2; j < number; j++){

                if(rowCount == 1 || rowCount == number) {
                    System.out.print("*");
                    columnCount++;
                } else if(columnCount + 1 == rowCount || (number - rowCount) == columnCount){
                    System.out.print("*");
                    columnCount++;

                } else {
                    System.out.print(" ");
                    columnCount++;
                }

            }
//            System.out.println(number-rowCount);
            System.out.println("*");
//            System.out.println(" row " + rowCount +" column " + columnCount);
            rowCount++;
        }

    }
}
