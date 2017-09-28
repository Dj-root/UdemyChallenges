package com.holms.unit8;

public class DeluxeHamburger extends BaseHamburger {
    // b) Deluxe hamburger - comes with chips and drinks as additions, but no extra additions are allowed.
    // hint:  You have to find a way to automatically add these new additions at the time the deluxe burger
    // object is created, and then prevent other additions being made.

    private String chipsType;
    private String drinkType;
    private boolean isChipsOrdered;
    private boolean isDrinkOrdered;

    public DeluxeHamburger(String breadRollType, String meatType, double basePrice, String chipsType, String drinkType) {
        super(breadRollType, meatType, basePrice);
        this.chipsType = chipsType;
        this.drinkType = drinkType;
        this.setChipsOrdered(true);
        this.setDrinkOrdered(true);
    }

    @Override
    public void getCalculation() {
        System.out.println("\nYou ordered Delux Hamburger.\nBase price of the burger is " + getBasePrice());
        this.getAdditionsCalculation();
        System.out.println("Total cost of burger is "+this.getTotalPrice());
    }

    @Override
    public void getAdditionsCalculation() {
        if (isChipsOrdered){
            System.out.println("You added "+getChipsType()+" chips for free");
        }
        if (isDrinkOrdered){
            System.out.println("You added "+getDrinkType()+" drink for free");
        }
        System.out.println("No other additions allowed");

    }

    private void setChipsOrdered(boolean chipsOrdered) {
        isChipsOrdered = chipsOrdered;
    }

    private void setDrinkOrdered(boolean drinkOrdered) {
        isDrinkOrdered = drinkOrdered;
    }

    public String getChipsType() {
        return chipsType;
    }

    public String getDrinkType() {
        return drinkType;
    }

    @Override
    public double getTotalPrice() {
        return super.getTotalPrice();
    }
}
