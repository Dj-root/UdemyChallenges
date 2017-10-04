package com.holms.unit9;

import java.util.ArrayList;

public class MobilePhone {

    private ArrayList<Contacts> phoneBook = new ArrayList<>();

    public void store(Contacts contact) {
        phoneBook.add(contact);
    }

    public void getAllContacts() {
        Contacts currentContact;
        System.out.println("Your contact list are: ");
        for (int i = 0; i < phoneBook.size(); i++) {
            currentContact = (phoneBook.get(i));
            System.out.println(i+1 + ". " + currentContact.getName() + " " + currentContact.getPhoneNo());//, currentContact.getPhoneNo().toString());
        }
    }

    public void query(String name){

    }


//    , modify, remove and query
}
