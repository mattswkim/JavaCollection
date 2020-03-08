package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

      // reference data type
      // pointing to the address
      Customer customer = new Customer("Tim", 54.23);
      Customer anotherCustomer;
      anotherCustomer = customer;
      anotherCustomer.setBalance(12.14);
      System.out.println("Balance for customer " + customer.getName() + " is " + customer.getBalance());


      // for an array to add a data in the middle you need to all other following data down.
      // which might take a long time when you have millions of them
      ArrayList<Integer> intList = new ArrayList<>();

      intList.add(1);
      intList.add(3);
      intList.add(5);

      for (int i = 0; i < intList.size(); i++) {
        System.out.println(i + ": " + intList.get(i));
      }
      intList.add(1,2);

      for (int i = 0; i < intList.size(); i++) {
        System.out.println(i + ": " + intList.get(i));
      }

    }
}
