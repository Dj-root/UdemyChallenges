package com.holms.unit9;

import java.util.Scanner;

public class Phone {

    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone addressBook = new MobilePhone();

    public static void main(String[] args) {
        boolean quit = false;
        int choise = 0;

        printInstruction();

        while (!quit) {
            System.out.print("Enter Your choise: ");
            choise = scanner.nextInt();
            scanner.nextLine();

            switch (choise) {
                case 0:
                    printInstruction();
                    break;
                case 1:
                    addressBook.printContactList();
                    break;
                case 2:
                    addContact();
                    break;
                case 3:
                    changeContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    findContact();
                    break;
                case 6:
                    quit = true;
                    break;
            }
        }
        System.out.println("Thanks for using this APP");
    }

    private static void printInstruction() {
        System.out.println("\nPress ");
        System.out.println("\t 0 - To print choice options.");
        System.out.println("\t 1 - To print the list of grocery items.");
        System.out.println("\t 2 - To add an item to the list.");
        System.out.println("\t 3 - To modify an item in the list.");
        System.out.println("\t 4 - To remove an item from the list.");
        System.out.println("\t 5 - To search for an item in the list.");
        System.out.println("\t 6 - To quit the application.");
    }

    private static void addContact() {
        System.out.println("Please enter the new contact.");
        System.out.print("Person's name: ");
        String name = scanner.nextLine();
        System.out.print("Person's phone No: ");
        String phoneNo = scanner.nextLine();
        Contacts newContact = new Contacts(name, phoneNo);

        if (addressBook.existsContact(newContact)) {
            System.out.println("The contact with name " + newContact.getName() + " already exists. Contact wasn't added");
        } else {
            addressBook.store(newContact);
        }
    }

    private static void changeContact() {
        System.out.println("Please enter the name of contact you need to change.");
        System.out.print("Person's name: ");
        String oldName = scanner.nextLine();

        Contacts oldContact = new Contacts(oldName, null);
        if (!addressBook.existsContact(oldContact)) {
            System.out.println("Contact " + oldContact.getName() + " wasn't found");
            return;
        }

        System.out.println("Enter new name and phone no");
        System.out.print("Person's name: ");
        String name = scanner.nextLine();
        System.out.print("Person's phone No: ");
        String phoneNo = scanner.nextLine();
        Contacts newContact = new Contacts(name, phoneNo);

        addressBook.updateContact(oldContact, newContact);
    }

    private static void removeContact() {
        System.out.println("Please enter the name of contact you need to delete.");
        System.out.print("Person's name: ");
        String name = scanner.nextLine();

        Contacts contactToDelete = new Contacts(name, null);
        if (!addressBook.existsContact(contactToDelete)) {
            System.out.println("Contact " + contactToDelete.getName() + " wasn't found");
            return;
        } else {
            addressBook.removeContact(contactToDelete);
        }
    }


    private static void findContact() {
        System.out.println("Please enter the name of contact you need to delete.");
        System.out.print("Person's name: ");
        String name = scanner.nextLine();

        Contacts contactToFind = new Contacts(name, null);
        if (!addressBook.existsContact(contactToFind)) {
            System.out.println("Contact " + contactToFind.getName() + " wasn't found");
            return;
        } else {
            addressBook.query(contactToFind);
        }
    }
}
