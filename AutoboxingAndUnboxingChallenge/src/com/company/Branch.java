package com.company;

import java.util.ArrayList;

public class Branch {

  private String branchName;
  private ArrayList<Customer> customers;

  public Branch(String branchName) {
    this.branchName = branchName;
    this.customers = new ArrayList<Customer>();
  }

  public ArrayList<Customer> getCustomers() {
    return customers;
  }

  public String getBranchName() {
    return branchName;
  }

  public boolean addNewCustomer(String name, double initialAmount) {
    if (findCustomer(name) == null) {
      this.customers.add(new Customer(name, initialAmount));
      return true;
    }
    return false;
  }

  public boolean addCustomerTransactions(String name, Double value) {
    Customer existingCustomer = findCustomer(name);
    if (existingCustomer == null) {
      System.out.println("\"" + name + "\" is not a registered customer.");
      System.out.println("Adding Transaction Failed");
      return false;
    }

    existingCustomer.addTransaction(value);

    System.out.println("Transaction Successfully added");
    return true;
  }

  private Customer findCustomer(String name) {
    for (int i = 0; i < customers.size(); i++) {
      Customer existingCustomer = this.customers.get(i);
      if (existingCustomer.getName().equals(name)) {
        return existingCustomer;
      }
    }
    return null;
  }
}
