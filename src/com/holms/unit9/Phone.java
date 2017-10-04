package com.holms.unit9;

import java.util.Scanner;

public class Phone {

    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone addressBook = new MobilePhone();

    public static void main(String[] args) {
        boolean quit = false;
        int choise = 0;

//        Contacts contact = new Contacts("Ivan", "321");
//        addressBook.store(new Contacts("Ivan", "321"));
//        addressBook.store(new Contacts("Petro", "1243"));
//        addressBook.store(new Contacts("Vasyl", "321"));
//        addressBook.printContactList();
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
//               02
                case 6:
                    quit = true;
                    break;
            }
        }

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

    private static void addContact(){
        System.out.println("Please enter the new contact.");
        System.out.print("Name and phone No ");
        Contacts newContact = new Contacts(scanner.nextLine(), scanner.nextLine());
        addressBook.store(newContact);
    }


}
