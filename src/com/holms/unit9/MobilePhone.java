package com.holms.unit9;

import java.util.ArrayList;

public class MobilePhone {

    private ArrayList<Contacts> phoneBook = new ArrayList<>();

    public void store(Contacts contact) {
        phoneBook.add(contact);
    }

    public void printContactList() {
        Contacts currentContact;
        System.out.println("Your contact list are: ");
        for (int i = 0; i < phoneBook.size(); i++) {
            currentContact = (phoneBook.get(i));
            System.out.println(i + 1 + ". " + currentContact.getName() + " " + currentContact.getPhoneNo());//, currentContact.getPhoneNo().toString());
        }
    }

    public void query(String name) {
        if (isNameExists(name)) {
            int position = findItem(name);
            Contacts currentContact;

            currentContact = phoneBook.get(position);
            System.out.println(currentContact.getName() + " " + currentContact.getPhoneNo());
        } else {
            System.out.println("The contact " + name + " was not found");
        }
    }

    public void updateContact(String item, Contacts newContact) {

        int position = findItem(newContact);
        if (position >= 0) {
            updateContact(position, newContact);
        }
    }

    public void removeContact(String contact) {
        int position = findItem(contact);
        Contacts currentContact;

        if (position >= 0) {
            currentContact = phoneBook.get(position);
            System.out.println(currentContact.getName() + " was removed");
            removeContact(position);
        } else {
            System.out.println("Contact " + contact + " was not found");
        }
    }


    private void updateContact(int position, Contacts newContact) {
        phoneBook.set(position, newContact);
        System.out.println("Contact " + newContact.getName() + " was modified");
    }

    private void removeContact(int position) {
        phoneBook.remove(position);
    }

    private int findItem(String name) {
        // using name or phone no
        Contacts currentContact;
        int position;
        for (int i = 0; i < phoneBook.size(); i++) {
            position = i;
            currentContact = (phoneBook.get(position));
            if (currentContact.getName().equals(name) | currentContact.getPhoneNo().equals(name)) {
                return position;
            }
        }
        return -1;
    }

    private int findItem(Contacts contact) {
        // using name or phone no
        Contacts currentContact;
        int position;
        for (int i = 0; i < phoneBook.size(); i++) {
            position = i;
            currentContact = (phoneBook.get(position));
            if (currentContact.getName().equals(contact.getName()) | currentContact.getPhoneNo().equals(contact.getPhoneNo())) {
                return position;
            }
        }
        return -1;
    }

    private boolean isNameExists(String name) {
        if (findItem(name) >= 0) {
            return true;
        }
        return false;
    }

//    , modify, remove and query
}
