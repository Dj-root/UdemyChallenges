package com.holms.unit8;

public class HealthyBurger extends BaseHamburger {

    //    private double burgerCost;
    private int freeAdditionsCount = 0;
    private int freeAdditionAllowed = 2;
    private int maxAdditionsAllowed = 6;
    private int freeLettuceQty = 0;
    private int freeTomatoQty = 0;
    private int freeCarrotQty = 0;
    private int freeOnionQty = 0;
//    private int totalAdditionsCount = 0;

    public HealthyBurger(String meatType, double basePrice) {
        super("Brown Rye Bread roll", meatType, basePrice);
    }

    // hint:  you probably want to process the 2 additional items in this new class, not the base class,
    // since the 2 additions are only appropriate for this new class.

    @Override
    public String addLettuce(int qty) {
        // Add additions for free max 2 qty
        if ((freeAdditionsCount + qty) <= freeAdditionAllowed
                && (this.getPaidAdditionsCount() + qty + freeAdditionsCount) <= maxAdditionsAllowed) {
            freeLettuceQty += qty;
            freeAdditionsCount += qty;
            return "You've added " + qty + " of lettuce for free. Total price is " + getTotalPrice();
        }
        // Add paid additions, but not more that max allowed
        else if (freeAdditionsCount >= freeAdditionAllowed
                && (this.getPaidAdditionsCount() + qty + freeAdditionsCount) <= maxAdditionsAllowed) {
            return super.addLettuce(qty);
        }
        // Add free additions, and other paid
        else if ((freeAdditionsCount + qty) > freeAdditionAllowed
                && (this.getPaidAdditionsCount() + qty + freeAdditionsCount) <= maxAdditionsAllowed) {
            int paidAdditions = qty - (freeAdditionAllowed - freeAdditionsCount);
            freeLettuceQty = qty - paidAdditions;
            System.out.println("You've added " + (qty - paidAdditions) + " of lettuce for free and");

            return super.addLettuce(paidAdditions);
        }
        return "You've cannot add more than " + maxAdditionsAllowed + " additions.\n" +
                "You've added " + (this.getPaidAdditionsCount() + this.freeAdditionsCount) + " additions.";
    }

    @Override
    public String addTomato(int qty) {
        // Add additions for free max 2 qty
        if ((freeAdditionsCount + qty) <= freeAdditionAllowed
                && (this.getPaidAdditionsCount() + qty + freeAdditionsCount) <= maxAdditionsAllowed) {
            freeTomatoQty += qty;
            freeAdditionsCount += qty;
            return "You've added " + qty + " of tomato for free. Total price is " + getTotalPrice();
        }
        // Add paid additions, but not more that max allowed
        else if (freeAdditionsCount >= freeAdditionAllowed
                && (this.getPaidAdditionsCount() + qty + freeAdditionsCount) <= maxAdditionsAllowed) {
            return super.addTomato(qty);
        }
        // Add free additions, and other paid
        else if ((freeAdditionsCount + qty) > freeAdditionAllowed
                && (this.getPaidAdditionsCount() + qty + freeAdditionsCount) <= maxAdditionsAllowed) {
            int paidAdditions = qty - (freeAdditionAllowed - freeAdditionsCount);
            freeTomatoQty += qty - paidAdditions;
            System.out.println("You've added " + (qty - paidAdditions) + " of tomato for free and");

            return super.addTomato(paidAdditions);
        }
        return "You've cannot add more than " + maxAdditionsAllowed + " additions.\n" +
                "You've added " + (this.getPaidAdditionsCount() + this.freeAdditionsCount) + " additions.";
    }

    @Override
    public String addCarrot(int qty) {
        // Add additions for free max 2 qty
        if ((freeAdditionsCount + qty) <= freeAdditionAllowed
                && (this.getPaidAdditionsCount() + qty + freeAdditionsCount) <= maxAdditionsAllowed) {
            freeCarrotQty += qty;
            freeAdditionsCount += qty;
            return "You've added " + qty + " of carrot for free. Total price is " + getTotalPrice();
        }
        // Add paid additions, but not more that max allowed
        else if (freeAdditionsCount >= freeAdditionAllowed
                && (this.getPaidAdditionsCount() + qty + freeAdditionsCount) <= maxAdditionsAllowed) {
            return super.addCarrot(qty);
        }
        // Add free additions, and other paid
        else if ((freeAdditionsCount + qty) > freeAdditionAllowed
                && (this.getPaidAdditionsCount() + qty + freeAdditionsCount) <= maxAdditionsAllowed) {
            int paidAdditions = qty - (freeAdditionAllowed - freeAdditionsCount);
            freeCarrotQty += qty - paidAdditions;
            System.out.println("You've added " + (qty - paidAdditions) + " of carrot for free and");

            return super.addCarrot(paidAdditions);
        }
        return "You've cannot add more than " + maxAdditionsAllowed + " additions.\n" +
                "You've added " + (this.getPaidAdditionsCount() + this.freeAdditionsCount) + " additions.";

    }

    @Override
    public String addOnion(int qty) {
        // Add additions for free max 2 qty
        if ((freeAdditionsCount + qty) <= freeAdditionAllowed
                && (this.getPaidAdditionsCount() + qty + freeAdditionsCount) <= maxAdditionsAllowed) {
            freeAdditionsCount += qty;
            freeOnionQty += qty;
            return "You've added " + qty + " of onion for free. Total price is " + getTotalPrice();
        }
        // Add paid additions, but not more that max allowed
        else if (freeAdditionsCount >= freeAdditionAllowed
                && (this.getPaidAdditionsCount() + qty + freeAdditionsCount) <= maxAdditionsAllowed) {
            return super.addOnion(qty);
        }
        // Add free additions, and other paid
        else if ((freeAdditionsCount + qty) > freeAdditionAllowed
                && (this.getPaidAdditionsCount() + qty + freeAdditionsCount) <= maxAdditionsAllowed) {
            int paidAdditions = qty - (freeAdditionAllowed - freeAdditionsCount);
            freeOnionQty += qty - paidAdditions;
            System.out.println("You've added " + (qty - paidAdditions) + " of onion for free and");

            return super.addOnion(paidAdditions);
        }
        return "You've cannot add more than " + maxAdditionsAllowed + " additions.\n" +
                "You've added " + (this.getPaidAdditionsCount() + this.freeAdditionsCount) + " additions.";

    }

    @Override
    public void getCalculation() {
        System.out.println("\nYou ordered Healthy Hamburger.\nBase price of the burger is " + getBasePrice());
        this.getFreeAdditionsCalculation();
        this.getPaidAdditionsCalculation();
        System.out.println("Total cost of burger is " + getTotalPrice());
    }


    public void getFreeAdditionsCalculation() {
        if (this.getFreeLettuceQty() > 0) {
            System.out.println("You added " + getFreeLettuceQty() + " pcs of lettuce for free");
        }
        if (this.getFreeTomatoQty() > 0) {
            System.out.println("You added " + getFreeTomatoQty() + " pcs of tomato for free");
        }
        if (this.getFreeCarrotQty() > 0) {
            System.out.println("You added " + getFreeCarrotQty() + " pcs of carrot for free");
        }
        if (this.getFreeOnionQty() > 0) {
            System.out.println("You added " + getFreeOnionQty() + " pcs of onion for free");
        }
//        super.getFreeAdditionsCalculation();
    }

    public void getPaidAdditionsCalculation() {
        if (super.getLettuceQty() > 0) {
            System.out.println("You extra added " + super.getLettuceQty() + " pcs of lettuce. Addition costs " + super.getLettucePrice() +
                    ". Total cost of this addition is " + (super.getLettucePrice() * super.getLettuceQty()));
        }
        if (super.getTomatoQty() > 0) {
            System.out.println("You extra added " + super.getTomatoQty() + " pcs of tomato. Addition costs " + super.getTomatoPrice() +
                    ". Total cost of this addition is " + (super.getTomatoPrice() * super.getTomatoQty()));
        }
        if (super.getCarrotQty() > 0) {
            System.out.println("You extra added " + super.getCarrotQty() + " pcs of carrot. Addition costs " + super.getCarrotPrice() +
                    ". Total cost of this addition is " + (super.getCarrotPrice() * super.getCarrotQty()));
        }
        if (super.getOnionQty() > 0) {
            System.out.println("You extra added " + super.getOnionQty() + " pcs of onion. Addition costs " + super.getOnionPrice() +
                    ". Total cost of this addition is " + (super.getOnionPrice() * super.getOnionQty()));
        }
    }

    @Override
    public double getTotalPrice() {
        return super.getTotalPrice();
    }

    public int getFreeLettuceQty() {
        return freeLettuceQty;
    }

    public int getFreeTomatoQty() {
        return freeTomatoQty;
    }

    public int getFreeCarrotQty() {
        return freeCarrotQty;
    }

    public int getFreeOnionQty() {
        return freeOnionQty;
    }
}
