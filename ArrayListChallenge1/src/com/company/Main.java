package com.company;

import java.util.Scanner;

public class Main {

  private static MobilePhone mobilePhone = new MobilePhone("131-1312-1212");

  private static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    // Create a program that implements a simple mobile phone with the following capabilities.

    // Able to store, modify, remove and query contact names.
    // You will want to create a separate class for Contacts (name and phone number).

    // Create a master class (MobilePhone) that holds the ArrayList of Contacts
    // The MobilePhone class has the functionality listed above.

    // Add a menu of options that are available.
    // Options: Quit, print list of contacts, add new contact, update existing contact, remove contact
    // and search/find contact.

    // When adding or updating be sure to check if the contact already exists (use name)
    // Be sure not to expose the inner workings of the Arraylist to MobilePhone
    // e.g. no ints, no .get(i) etc
    // MobilePhone should do everything withe Contact objects only.


    boolean quit = false;
    startPhone();


    while (!quit) {
      showOptions();
      System.out.println();
      for (int i = 0; i < 41; i++) System.out.print("-");
      System.out.println();
      System.out.println("Enter number: (press 6 to see all the options)");
      int number = scanner.nextInt();
      scanner.nextLine();

      System.out.println();

      switch (number) {
        case 0:
          quit = true;
          System.out.println("Quitting . . . .");
          System.out.println();
          System.out.println("See you!");
          break;
        case 1:
          mobilePhone.printContacts();
          break;
        case 2:
          addContact();
          break;
        case 3:
          updateContact();
          break;
        case 4:
          removeContact();
          break;
        case 5:
          searchContact();
          break;
        case 6:
          showOptions();
          break;

      }

    }


  }

  private static void startPhone() {
    System.out.println("Phone starting . . .");
  }

  private static void showOptions() {
    System.out.println("0 - quit the program\n" +
                       "1 - print contact list\n" +
                       "2 - add new contact\n" +
                       "3 - update existing contact\n" +
                       "4 - remove existing contact\n" +
                       "5 - search contact\n" +
                       "6 - show options\n");
  }
  private static void addContact() {
    System.out.print("Enter new contact name: ");
    String name = scanner.nextLine();

    if (mobilePhone.queryContact(name) != null) {
      System.out.println("\"" + name + "\" is already on the contact list.");
      return;
    }
    System.out.print("Enter phone number: ");
    String phoneNumber = scanner.nextLine();
    Contact newContact = Contact.createContact(name, phoneNumber);

    if (mobilePhone.addContact(newContact)) {
      System.out.println("\"" + name + "\" has been successfully added.");
    }
  }

  private static void updateContact() {
    System.out.print("Enter existing name: ");
    String oldName = scanner.nextLine();

    if (mobilePhone.queryContact(oldName) == null) {
      System.out.println("\"" + oldName + "\" does not exist on the contact list.");
      return;
    }

    Contact oldContact = mobilePhone.queryContact(oldName);

    System.out.println("Enter new contact name: ");
    String newName = scanner.nextLine();
    System.out.println("Enter new phone number: ");
    String newNumber = scanner.nextLine();
    Contact newContact = Contact.createContact(newName, newNumber);

    if (mobilePhone.updateContact(oldContact, newContact)) {
      System.out.println("\"" + newName + "\" has been successfully added to the contact.");
    }

  }

  private static void removeContact() {
    System.out.print("Enter existing name: ");
    String name = scanner.nextLine();

    if (mobilePhone.queryContact(name) == null) {
      System.out.println("\"" + name + "\" does not exist on the contact list.");
      return;
    }

    if (mobilePhone.removeContact(mobilePhone.queryContact(name))) {
      System.out.println("\"" + name + "\" has been successfully removed from the list.");
    }

  }

  private static void searchContact() {
    System.out.print("Enter existing name: ");
    String name = scanner.nextLine();

    if (mobilePhone.queryContact(name) == null) {
      System.out.println("\"" + name + "\" does not exist on the contact list.");
      return;
    }

    Contact contact = mobilePhone.queryContact(name);
    System.out.println("Name: \"" + contact.getName() + "\", Phone Number: " + contact.getPhoneNumber());

  }






}
