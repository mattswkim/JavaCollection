package com.company;


import java.util.ArrayList;

public class MobilePhone {

  private String myNumber;
  private ArrayList<Contact> myContacts;

  public MobilePhone(String myNumber) {
    this.myNumber = myNumber;
    this.myContacts = new ArrayList<Contact>();
  }

  private int findContact(Contact contact) {
    return this.myContacts.indexOf(contact);
  }

  private int findContact(String name) {
    for (int i = 0; i < myContacts.size(); i++) {
      if (this.myContacts.get(i).getName().equals(name)) {
        return i;
      }
    }
    return -1;
  }

  public boolean addContact(Contact contact) {
    if (findContact(contact.getName()) >= 0) {
      return false;
    }

    this.myContacts.add(contact);
    return true;
  }

  public boolean updateContact(Contact oldContact, Contact newContact) {
    if (findContact(oldContact) < 0) {
      return false;
    }

    int position = findContact(oldContact);
    this.myContacts.set(position, newContact);

    return true;
  }

  public boolean removeContact(Contact contact) {
    if (findContact(contact) < 0) {
      return false;
    }

    int position = findContact(contact);
    this.myContacts.remove(position);
    return true;
  }



  public Contact queryContact(String name) {
    int position = findContact(name);
    if (position >= 0) {
      return this.myContacts.get(position);
    }
    return null;
  }




  public void printContacts() {
    System.out.println("Contact List");
    for (int i = 0; i < 41; i++) System.out.print("-");
    System.out.println();
    for (int i = 0; i < this.myContacts.size(); i++) {
      System.out.println((i + 1) + ". Name: " + this.myContacts.get(i).getName() +
              ", Phone Number: " + this.myContacts.get(i).getPhoneNumber());
    }

  }

}
