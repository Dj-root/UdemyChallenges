package com.holms.unit9;

import java.util.ArrayList;

public class Customer {
    private String customerName;
    private double balance = 0;

    private ArrayList<Double> transaction = new ArrayList<>();

    public Customer(String customerName, double amount) {
        this.customerName = customerName;
        if (amount > 0) {
//            transaction.add(amount);
            this.transaction.add(amount);
        } else {
            this.balance = 0;
        }
    }


    public boolean addTransaction(double amount) {
        if (balance + amount < 0) {
            System.out.println("Cannot process the transaction. You have no credit limit");
            return false;
        }

        transaction.add(amount);
        this.balance += amount;
        System.out.println("You have added " + amount + "$ to your account");
        return true;
    }

    public void showTransactionsHistory() {
        double accountTotal = 0;
        double currentTran;

        for (int i = 0; i < transaction.size(); i++) {
            currentTran = transaction.get(i);
            accountTotal += currentTran;

            System.out.println("Transaction id " + (i + 1) + ", transaction amount " + currentTran
                    + "$, subTotal " + accountTotal+"$");
        }
    }

    public int transactionsQty() {
        return transaction.size();
    }

    public double showLastTransaction() {
        int lastTranId = transactionsQty()-1;
        return transaction.get(lastTranId);
    }


    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        Customer holms = new Customer("Holms", 20);
        System.out.println("Last transaction was "+holms.showLastTransaction()+"$");
        holms.showTransactionsHistory();
        holms.addTransaction(10);
        System.out.println("Last transaction was "+holms.showLastTransaction()+"$");
    }
}
