package com.holms.unit9;

import java.util.Scanner;

public class Phone {

    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone addressBook = new MobilePhone();

    public static void main(String[] args) {
//        Contacts contact = new Contacts("Ivan", "321");
        addressBook.store(new Contacts("Ivan", "321"));
        addressBook.store(new Contacts("Petro", "1243"));
        addressBook.store(new Contacts("Vasyl", "321"));

        addressBook.printContactList();

    }
}
