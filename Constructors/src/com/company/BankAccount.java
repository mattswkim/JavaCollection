package com.company;

public class BankAccount {

  private String number;
  private double balance;
  private String customerName;
  private String email;
  private String phoneNumber;

  public BankAccount() {
    this("56789", 2.50, "Default name","email@email.com" ,"default phone");
    System.out.println("Empty constructor called");
  }

  public BankAccount(String number, double balance, String customerName,
                     String email, String phoneNumber) {
    System.out.println("Account constructor with parameters called");
    this.number = number;
    this.balance = balance;
    this.customerName = customerName;
    this.email = email;
    this.phoneNumber = phoneNumber;
  }


  public BankAccount(String customerName, String email, String phoneNumber) {
    this("99999", 100.55, customerName, email, phoneNumber);
  }

  public void setNumber(String number) {
    this.number = number;
  }

  public void setBalance(double balance) {
    this.balance = balance;
  }

  public void setCustomerName(String customerName) {
    this.customerName = customerName;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public String getNumber() {
    return number;
  }

  public double getBalance() {
    return balance;
  }

  public String getCustomerName() {
    return customerName;
  }

  public String getEmail() {
    return email;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void deposit(double depositAmount) {
    this.balance += depositAmount;
    System.out.println("Deposit of " + depositAmount + " made. Now balance is " + this.balance);
  }

  public void withdrawal(double withdrawalAmount) {
    if(this.balance - withdrawalAmount < 0) {
      System.out.println("Only " + this.balance + " available. Withdrawal not processed");
    } else {
      this.balance -=withdrawalAmount;
      System.out.println("Withdrawal of " + withdrawalAmount + " processed. Remaining balance = " + this.balance);
    }
  }
}
