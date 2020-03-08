package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    String strnumi1;
    String strItmNum;
    String strbnum;
    String strPrice;
    String strfi;

    // get the input from the user to determine the length of the array
    System.out.print("Enter row length: ");
    strnumi1 = reader.readLine();
    int rowOfArrayLength = Integer.parseInt(strnumi1);


    // validate the number from the user
    while (rowOfArrayLength < 2) {
      System.out.println("It is invalid number, should be more than 10");
      System.out.print("Enter row length: ");

      // get the user input again, in case the user input is less than 10
      strnumi1 = reader.readLine();
      rowOfArrayLength = Integer.parseInt(strnumi1);
    }
//




    // initialize first array
    int auction[][] = new int[rowOfArrayLength][3];
    // setting the first column of the first array from 1-10
    for (int i = 0; i < rowOfArrayLength; i++) {
      auction[i][0] = i + 1;
    }
    // initialize second array
    float auctionPrice[][] = new float[rowOfArrayLength][2];

    // initialize third array
    String des[][] = new String[rowOfArrayLength][2];





    // assign values for the first columns from second and third arrays
    for (int i = 0; i < rowOfArrayLength; i++) {
      // get user input for the price
      System.out.print("Enter the price of index " + (i + 1) + ": ");

      strPrice = reader.readLine();
      // convert the string to float data type
      float price = Float.parseFloat(strPrice);
      // assign the price value from the user to the first column of auctionPrice(second) array
      auctionPrice[i][0] = price;


      System.out.println("auctionPrice [" + i + "][0] = $" + auctionPrice[i][0]);

      // get user input for description
      System.out.print("Enter the description " + (i + 1) + ": ");
      des[i][0] = reader.readLine();
    }



    // setting the second column of first array 0
    for (int i = 0; i < rowOfArrayLength; i++) {
      auction[i][1] = 0;
    }


    for (int i = 0; i < rowOfArrayLength; i++) {
      System.out.println("item numer: " + auction[i][0] + "\t" + des[i][0] + "\treserved price: $" + auctionPrice[i][0] + "\tbids: " + auction[i][1]);
    }

    // initialize the second column of second array to 0
    for (int i = 0; i < rowOfArrayLength; i++) {
      auctionPrice[i][1] = 0;
    }


// flag
    int finish = 1;

    while (finish > 0) {
      System.out.print("Enter the item number to bid: ");
      strItmNum = reader.readLine();
      int itemNumber = Integer.parseInt(strItmNum);

//      validate the user input for the item number
      while (itemNumber > rowOfArrayLength || itemNumber < 1) {
        System.out.println("It is wrong item number");
        System.out.print("Enter the item number: ");
        strItmNum = reader.readLine();
        int bid1 = Integer.parseInt(strItmNum);
        itemNumber = bid1;
      }

      // conver the item number to array index
      itemNumber = itemNumber - 1;

      System.out.println("item numer: " + auction[itemNumber][0] +
              "\t" + des[itemNumber][0] +
              "\thighest bid: $" + auctionPrice[itemNumber][1]);
      System.out.print("Enter the price you will bet: $");
      strPrice = reader.readLine();
      float price = Float.parseFloat(strPrice);

      // validate the bid if the bid is higher than the previous bid
      if (price > auctionPrice[itemNumber][1]) {
        auctionPrice[itemNumber][1] = price;
        auction[itemNumber][1] = auction[itemNumber][1] + 1;
      } else {
        System.out.println("You entered $" + price +
                "\nPrice should be higher than the previous bid");
      }

      while (price < auctionPrice[itemNumber][1]) {
        System.out.print("Enter the price you will bet: ");
        strPrice = reader.readLine();
        float pri1 = Float.parseFloat(strPrice);

        // validate if the item is sold or not
        if (pri1 > auctionPrice[itemNumber][1]) {
          auctionPrice[itemNumber][1] = pri1;
          auction[itemNumber][1] = auction[itemNumber][1] + 1;
        } else {
          System.out.println("Price should be higher than the previous bid!!");
        }

      price = pri1;

      }
      // get user input for ID
      System.out.print("Enter your ID Number: ");
      strbnum = reader.readLine();
      int idNum = Integer.parseInt(strbnum);
      auction[itemNumber][2] = idNum;
      // validate if user input is an integer
      //
      //
      //

      System.out.println("To finish the bid enter '0' or to continue enter '1'");
      strfi = reader.readLine();
      int finish1 = Integer.parseInt(strfi);
      finish = finish1;

    }


    // print the result of the auction
    for (int i = 0; i < rowOfArrayLength; i++) {
    System.out.println("item numer: " + auction[i][0] +
            "\thighest bid: " + auctionPrice[i][1] +
            "\tnumber of bids: " + auction[i][1] +
            "\tbuyer: " + auction[i][2]);
    }

    // calculate the whole price
    float fee = 0;
    int sold = 0;
    int unsold = 0;
    int nobid = 0;

    for (int i = 0; i < rowOfArrayLength; i++) {
      if (auction[i][1] == 0) {
        des[i][1] = "unsold";
        nobid++;
      } else if (auctionPrice[i][1] >= auctionPrice[i][0]) {
        fee = fee + auctionPrice[i][1] / 10;
        des[i][1] = "sold";
        sold++;
      } else {
        des[i][1] = "unsold";
        unsold++;
      }
    }

    for (int num = 0; num < rowOfArrayLength; num++) {
      System.out.println("item numer: " + auction[num][0] +
                        "\thighest bid: " + auctionPrice[num][1] +
                        "\treserved price: " + auctionPrice[num][0] +
                        "\tnumber of bids: " + auction[num][1] +
                        "\tbuyer ID: " + auction[num][2] +
                        "\t" + des[num][1]);
    }
    System.out.println("Total fee: " + fee);
    System.out.println("sold item number: " + sold +
                      "\tunsold item number: " + unsold +
                      "\tno bids: " + nobid);
  }
}

