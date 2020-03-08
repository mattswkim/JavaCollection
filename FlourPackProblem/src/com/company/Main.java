package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(canPack(0,5,5));

    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {

        // validate the data
        if (bigCount < 0 || smallCount < 0 || goal < 0)
            return false;


        int realBigCount = bigCount * 5;
        int sum = realBigCount + smallCount;

        for(int i = 1; i <= bigCount; i++) {
//             System.out.println("yes " + "i = " + i);

             if(smallCount > 0) {
                 for (int j = 0; j <= smallCount; j++) {
                     if ((i * 5 + j) == goal) {
                    return true;
//                         System.out.println("second loop yes");
//                         System.out.println("second i = " + i + " second j = " + j);
//                        break;
                     } // System.out.println("second no i = " + i + " second j = " + j);
                 }
             } else if(i * 5 == goal) {
                     return true;
             }
         // System.out.println("i = " + i);
        }
        if(bigCount == 0){
            for(int i = 0; i <= smallCount; i++) {
                if(i == goal) {
//                    System.out.println("second if i =" + i);
                    return true;
                }
            }
        }
        return false;

//
    }
}
