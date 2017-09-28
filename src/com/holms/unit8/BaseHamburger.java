package com.holms.unit8;

public class BaseHamburger {

    //    bread roll type, meat and up to 4 additional additions (things like lettuce, tomato, carrot, etc)
    private String breadRollType;
    private String meatType;
    private int lettuceQty = 0;
    private int tomatoQty = 0;
    private int carrotQty = 0;
    private int onionQty = 0;

    private double totalPrice = 0;
    private double basePrice = 6.99;
    private double lettucePrice = 0.5;
    private double tomatoPrice = 0.4;
    private double carrotPrice = 0.35;
    private double onionPrice = 0.25;
    private int additionsCount = 0;


    public BaseHamburger(String breadRollType, String meatType, double basePrice) {
        this.breadRollType = breadRollType;
        this.meatType = meatType;
        if (basePrice > 0) {
            this.basePrice = basePrice;
            this.totalPrice += basePrice;
        } else {
            this.totalPrice += this.basePrice;
        }

    }


    public String addLettuce(int qty) {
        if (qty > 0 && qty < 4) {
            lettuceQty += qty;
            totalPrice += (lettucePrice * qty);
            additionsCount += qty;
            return "You've extra added " + qty + " of lettuce. Total price is " + totalPrice;
        }
        return "You've typed incorrect quantity. Please type quantity between 1 and 3";
    }

    public String addTomato(int qty) {
        if (qty > 0 && qty < 4) {
            tomatoQty += qty;
            totalPrice += (tomatoPrice * qty);
            additionsCount += qty;
            return "You've extra added " + qty + " of tomatoes. Total price is " + totalPrice;
        }
        return "You've typed incorrect quantity. Please type quantity between 1 and 3";
    }

    public String addCarrot(int qty) {
        if (qty > 0 && qty < 4) {
            carrotQty += qty;
            totalPrice += (carrotPrice * qty);
            additionsCount += qty;
            return "You've extra added " + qty + " of carrot. Total price is " + totalPrice;
        }
        return "You've typed incorrect quantity. Please type quantity between 1 and 3";
    }

    public String addOnion(int qty) {
        if (qty > 0 && qty < 4) {
            onionQty += qty;
            totalPrice += (onionPrice * qty);
            additionsCount += qty;
            return "You've extra added " + qty + " of onion. Total price is " + totalPrice;
        }
        return "You've typed incorrect quantity. Please type quantity between 1 and 3";
    }

    //  All 3 classes should have a method that can be called anytime to show the base price of the hamburger
    // plus all additionals, each showing the addition name, and addition price, and a grand total for the
    // burger

    public void getCalculation() {

        System.out.println("\nYou ordered Base Hamburger.\nBase price of hamburger is " + getBasePrice());
        this.getAdditionsCalculation();
        System.out.println("Total cost of burger is " + getTotalPrice());

    }

    public void getAdditionsCalculation() {
        if (getLettuceQty() > 0) {
            System.out.println("You extra added " + getLettuceQty() + " pcs of lettuce. Addition costs " + getLettucePrice() +
                    ". Total cost of this addition is " + (getLettucePrice() * getLettuceQty()));
        }
        if (getTomatoQty() > 0) {
            System.out.println("You extra added " + getTomatoQty() + " pcs of tomato. Addition costs " + getTomatoPrice() +
                    ". Total cost of this addition is " + (getTomatoPrice() * getTomatoQty()));
        }
        if (getCarrotQty() > 0) {
            System.out.println("You extra added " + getCarrotQty() + " pcs of carrot. Addition costs " + getCarrotPrice() +
                    ". Total cost of this addition is " + (getCarrotPrice() * getCarrotQty()));
        }
        if (this.getOnionQty() > 0) {
            System.out.println("You extra added " + getOnionQty() + " pcs of onion. Addition costs " + getOnionPrice() +
                    ". Total cost of this addition is " + (getOnionPrice() * getOnionQty()));
        }
    }

    public double getBasePrice() {
        return basePrice;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public String getBreadRollType() {
        return breadRollType;
    }

    public String getMeatType() {
        return meatType;
    }

    public int getPaidAdditionsCount() {
        return additionsCount;
    }

    public int getLettuceQty() {
        return lettuceQty;
    }

    public int getTomatoQty() {
        return tomatoQty;
    }

    public int getCarrotQty() {
        return carrotQty;
    }

    public int getOnionQty() {
        return onionQty;
    }

    public double getLettucePrice() {
        return lettucePrice;
    }

    public double getTomatoPrice() {
        return tomatoPrice;
    }

    public double getCarrotPrice() {
        return carrotPrice;
    }

    public double getOnionPrice() {
        return onionPrice;
    }
}
