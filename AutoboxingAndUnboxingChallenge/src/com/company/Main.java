package com.company;

public class Main {

    public static void main(String[] args) {

        // Your job is to create a simple banking application.
        // There should be a Bank class
        // It should have an arraylist of Branch
        // Each Branch should have an arraylist of Customer
        // The customer class should have an arraylist of Double (transactions)
        // Customer:
        // Name, and the ArrayList of doubles.
        // Branch:
        // need to be able to add a new customer and initial transaction amount.
        // Also needs to add additional transactions for that customer/branch
        // Bank:
        // Add a new branch
        // Add a customer to that branch with initial transaction
        // Add a transaction for an existing customer for that branch
        // Show a list of customers for a particular branch and optionally a list
        // of their transactions.
        // Demonstration autoboxing and unboxing in your code
        // Hint: Transactions
        // Add data validation.
        // e.g. check if exists, or does not exist, etc.
        // Think about where you are adding the code to perform certain actions


        Bank bank = new Bank("Citi Bank");

        bank.addBranch("Shanghai");
        bank.addCustomer("Shanghai", "Matt", 200.00);
        bank.addCustomer("Shanghai", "Bob", 50.00);
        bank.addCustomer("Shanghai", "Kate", 150.0);

        bank.addBranch("Beijing");
        bank.addCustomerTransaction("Shanghai", "Matt", 12.12);
        bank.addCustomerTransaction("Beijing", "Matt", 41233.12);
        bank.addCustomer("Beijing", "Mike", 21.42);

        bank.listOfCustomers("Shanghai",true);
        bank.listOfCustomers("Beijing", true);

    }
}























