package com.company;

public class VipCustomer {

  private String name;
  private double creditLimit;
  private String email;

  public VipCustomer() {
    this("Matt", 30000.00, "Matt@asdf.com");
    System.out.println("Empty constructor called");
  }

  public VipCustomer(String name, double creditLimit) {
    this(name,creditLimit,"qwrq@qwe.com");
  }

  public VipCustomer(String name, double creditLimit, String email) {
    System.out.println("VipCustomer constructor with parameters called");
    this.name = name;
    this.creditLimit = creditLimit;
    this.email = email;
  }

  public String getName() {
    return name;
  }

  public double getCreditLimit() {
    return creditLimit;
  }

  public String getEmail() {
    return email;
  }
}
