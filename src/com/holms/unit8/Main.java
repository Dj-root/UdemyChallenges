package com.holms.unit8;

public class Main {

    public static void main(String[] args) {
        // write your code here

//        Test BaseHamburger Class
        BaseHamburger bh = new BaseHamburger("Wheet Roll", "Pork", -5.0);
//        System.out.println(bh.addCarrot(2));
//        System.out.println(bh.addLettuce(1));
//        System.out.println(bh.addOnion(3));
//        System.out.println(bh.addTomato(3));

        bh.addCarrot(2);
        bh.addLettuce(1);
        bh.addOnion(3);
        bh.addTomato(3);

//        System.out.println("You ordered Hamburger with " + bh.getBreadRollType() + ", " + bh.getMeatType() +
//                "\nIt costs " + bh.getTotalPrice());

        bh.getCalculation();

//        Test HealthyBurger class
        System.out.println("\n\n");

        HealthyBurger hb = new HealthyBurger("Beaf", 8.0);
//        System.out.println(hb.addLettuce(1));
//        System.out.println(hb.addCarrot(1));
//        System.out.println(hb.addOnion(2));
//        System.out.println(hb.addTomato(2));
//        System.out.println(hb.addLettuce(1));

        hb.addLettuce(1);
        hb.addCarrot(1);
        hb.addOnion(2);
        hb.addTomato(2);
        hb.addLettuce(1);
//
//        System.out.println("You ordered Healthy Burger with " + hb.getMeatType() +
//                "\nIt costs " + hb.getTotalPrice());

        hb.getCalculation();

        //        Test HealthyBurger class
        System.out.println("\n\n");

        DeluxeHamburger dh = new DeluxeHamburger("Wheat Roll", "Chicken", 15.5, "Cheresos", "Pepsi");
        dh.getCalculation();

    }
}
