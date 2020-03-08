package com.company;

import java.util.ArrayList;

public class Bank {

  private String bankName;
  private ArrayList<Branch> branches;

  public Bank(String bankName) {
    this.bankName = bankName;
    this.branches = new ArrayList<Branch>();
  }

  public boolean addBranch(String branchName) {
    Branch branch = findBranch(branchName);
    if (branch == null) {
      this.branches.add(new Branch(branchName));
      return true;
    }

    return false;
  }

  public boolean addCustomer(String branchName, String customerName, double amount) {
    Branch branch = findBranch(branchName);
    if (branch != null) {
      return branch.addNewCustomer(customerName, amount);
    }
    return false;
  }

  public boolean addCustomerTransaction(String branchName, String customerName, double amount) {
    Branch branch = findBranch(branchName);
    if (branch != null) {
      return branch.addCustomerTransactions(customerName, amount);
    }
    return false;
  }

  private Branch findBranch(String branchName) {
    for (int i = 0; i < branches.size(); i++) {
      Branch existingBranch = this.branches.get(i);
      if (existingBranch.getBranchName().equals(branchName)) {
        return existingBranch;
      }
    }
    return null;
  }

  public boolean listOfCustomers(String branchName, boolean showTransactions) {
    Branch branch = findBranch(branchName);
    if (branch != null) {
      System.out.println("Customers details for branch \"" + branch.getBranchName() + "\"");

      ArrayList<Customer> branchCustomer = branch.getCustomers();
      for (int i = 0; i < branchCustomer.size(); i++) {
        Customer customer = branchCustomer.get(i);
        System.out.println((i + 1) + ". Customer Name: " + "\"" + customer.getName() + "\"\t");
        if (showTransactions) {
          ArrayList<Double> transactions = customer.getTransactions();
          for (int j = 0; j < transactions.size(); j++) {
            System.out.println("[" + (j + 1) + "] Amount: $" + transactions.get(j));
          }
        }

      }
      return true;
    } else {
      return false;
    }
  }

}







