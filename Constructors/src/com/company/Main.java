package com.company;

public class Main {

    public static void main(String[] args) {
        // Create a new class for a bank account
        // Create fields for the account number, balance, customer name, email and phone number.
        //
        // Create getters and setters for each field
        // create two additional methods
        // 1. To allow the customer to deposit funds (this should increment the balance field).
        // 2. To allow the customer to withdraw funds. This should deduct from the valance field,
        // but not allow the withdrawal to complete if their are insufficient funds.
        // You will want to create various code in the Main class ( the one created by IntelliJ) to
        // confirm your code is working.
        // Add some System.out.printlns in the two methods above as well.
       BankAccount mattsAccount = new BankAccount(); //"12345",
//                0.00, "Matt Kim",
//                "aasdf@asfdda.asd", "123-1123-1231");
        System.out.println(mattsAccount.getNumber());
        System.out.println("Current balance is " + mattsAccount.getBalance());
        mattsAccount.withdrawal(2.5);
//        BankAccount mattsAccount = new BankAccount();

//        mattsAccount.setNumber("12345");
//        mattsAccount.setBalance(0.00);
//        mattsAccount.setCustomerName("Matt Kim");
//        mattsAccount.setEmail("asdfas@asdf.asd");
//        mattsAccount.setPhoneNumber("1231 -123123 -123123");
//        mattsAccount.withdrawal(100.0);
//
//        mattsAccount.deposit(50.0);
//        mattsAccount.withdrawal(100.0);
//
//        mattsAccount.deposit(51.0);
//        mattsAccount.withdrawal(100);
//
//        BankAccount katesAccount = new BankAccount("kate", "kate@af.com", "123");
//        System.out.println(katesAccount.getNumber() + " name " + katesAccount.getCustomerName());


        // Create a new classe VipCustomer
        // it should have 3 fields name, credit limit, and email address.
        // create 3 constructors
        // 1st constructor empty should call the constructor with 3 parameters with default values
        // 2nd constructor should pass on the 2 values it receives and add a default value for the 3rd
        // 3rd constructor should save all fields
        // create getters only for this using code generation of intellij as setters won't be needed
        // test and confirm it works.

        System.out.println("-----------------------");

//        VipCustomer person1 = new VipCustomer();
//        System.out.println(person1.getName());
//
//        VipCustomer person2 = new VipCustomer("Matt", 900000);
//        System.out.println(person2.getName());
//
//        VipCustomer person3 = new VipCustomer("Kate", 50000, "asdfas@adsf.com");
//        System.out.println(person3.getName());
//        System.out.println(person3.getEmail());


    }


}
