package com.holms.unit9;

import java.util.ArrayList;

public class Branch {
    private String branchName;
    private ArrayList<Customer> customers = new ArrayList<>();

    public Branch(String branchName) {
        this.branchName = branchName;
    }

    public boolean addCustomer(String customerName, double initAmount) {
        if (isCustomerExists(customerName)) {
            System.out.println("This customer already exists. You cannot add it again");
            return false;
        }
        customers.add(new Customer(customerName, initAmount));
        return true;
    }

    public boolean addTransaction(String customerName, double transactionAmount) {
        if (!isCustomerExists(customerName)) {
            System.out.println("This customer is not exists. You cannot process transaction");
            return false;
        }
        Customer currentCustomer = getCustomer(customerName);
        if (currentCustomer.addTransaction(transactionAmount)) {
            return true;
        }
        return false;
    }

    public void showAllCustomers() {
        Customer customer;
        for (int i = 0; i < customers.size(); i++) {
            customer = customers.get(i);
            System.out.println((i + 1) + ". " + customer.getCustomerName());
        }
    }

    public void showAllCustomersActivity() {
        Customer customer;
        for (int i = 0; i < customers.size(); i++) {
            customer = customers.get(i);
            System.out.print((i + 1) + ". " + customer.getCustomerName());
            System.out.println(" has following activity: ");
            showCustomersTransactions(customer);
            System.out.println();
        }
    }

    private void showCustomersTransactions(Customer customer) {
        customer.showTransactionsHistory();
    }

    private Customer getCustomer(String customerName) {
        int customerId;
        customerId = getCustomerIdx(customerName);
        if (customerId >= 0) {
            return customers.get(customerId);
        } else {
            return null;
        }
    }

    public boolean isCustomerExists(String customerName) {
        if (getCustomerIdx(customerName) >= 0) {
            return true;
        }
        return false;
    }

    private int getCustomerIdx(String customerName) {
        Customer customer;
        for (int i = 0; i < customers.size(); i++) {
            customer = customers.get(i);
            if (customer.getCustomerName().equals(customerName)) {
                return i;
            }
        }
        return -1;
    }


    public String getBranchName() {
        return branchName;
    }
}
