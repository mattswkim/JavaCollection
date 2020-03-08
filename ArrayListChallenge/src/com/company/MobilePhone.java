package com.company;

import java.util.ArrayList;

public class MobilePhone {

  private String myNumber;
  private ArrayList<Contacts> myContacts;

  public MobilePhone(String myNumber) {
    this.myNumber = myNumber;
    this.myContacts = new ArrayList<>();
  }

  public boolean addNewContacts(Contacts contacts) {
    if(findContacts(contacts.getName()) >= 0) {
      System.out.println("Contact is already on file");
      return false;
    }
    myContacts.add(contacts);
    return true;
  }

  public boolean updateContacts(Contacts oldContact, Contacts newContact) {
    int foundPosition = findContacts(oldContact);
    if(foundPosition < 0) {
      System.out.println(oldContact.getName() + ", was not found.");
      return false;
    } else if (findContacts(newContact.getName()) != -1) {
      System.out.println("Contact with name " + newContact.getName() +
              " already exists. Update was not successful.");
      return false;
    }

    this.myContacts.set(foundPosition,newContact);
    System.out.println(oldContact.getName() + ", was replaced with " + newContact.getName());
    return true;
  }

  public boolean removeContacts(Contacts contacts) {
    int foundPosition = findContacts(contacts);
    if(foundPosition < 0) {
      System.out.println(contacts.getName() + ", was not found.");
      return false;
    }

    this.myContacts.remove(contacts);
    System.out.println(contacts.getName() + ", was deleted.");
    return true;
  }

  private int findContacts(Contacts contacts) {
    return this.myContacts.indexOf(contacts);

  }

  private int findContacts(String contactName) {
    for(int i = 0; i < this.myContacts.size(); i++) {
      Contacts contacts = this.myContacts.get(i);
      if(contacts.getName().equals(contactName)) {
        return i;
      }
    }
    return -1;
  }

  public String queryContact(Contacts contacts) {
    if (findContacts(contacts) >= 0) {
      return contacts.getName();
    }
    return null;
  }

  public Contacts queryContact(String name) {
    int position = findContacts(name);
    if(position >= 0) {
      return this.myContacts.get(position);
    }

    return null;
  }

  public void printContacts() {
    System.out.println("Contact List");
    for(int i = 0; i < this.myContacts.size(); i++){
      System.out.println((i + 1) + ". " +
              this.myContacts.get(i).getName() + " -> " +
              this.myContacts.get(i).getPhoneNumber());
    }
  }

}
