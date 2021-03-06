package com.holms.unit9;

import java.util.ArrayList;

public class Bank {
    String bankName;
    private ArrayList<Branch> branches = new ArrayList<>();

    public Bank(String bankName) {
        this.bankName = bankName;
    }


    public boolean addBranch(String branchName) {
        if (isBranchExists(branchName)) {
            System.out.println("This branch already exists. You cannot add it again");
            return false;
        }
        branches.add(new Branch(branchName));
        return true;
    }

    public boolean addCustomer(String customerName, double initialBallance, String branchName) {

        Branch currentBranch;
// Check if branch exists
        if (isBranchExists(branchName)) {
            currentBranch = getBranch(branchName);
        } else {
            System.out.println("Branch " + branchName + " does not exists");
            return false;
        }

// Check if customer exists
        if (currentBranch.isCustomerExists(customerName)) {
            System.out.println("Customer " + customerName + " already exists in the " + currentBranch.getBranchName() +
                    " branch");
        } else {
            currentBranch.addCustomer(customerName, initialBallance);
        }

        return false;
    }
//    public boolean addTransaction(String customerName, double transactionAmount) {
//        if (!isCustomerExists(customerName)) {
//            System.out.println("This customer is not exists. You cannot process transaction");
//            return false;
//        }
//        Customer currentCustomer = getCustomer(customerName);
//        if (currentCustomer.addTransaction(transactionAmount)) {
//            return true;
//        }
//        return false;
//    }

    public void showAllBranches() {
        Branch branch;
        for (int i = 0; i < branches.size(); i++) {
            branch = branches.get(i);
            System.out.println(i+1 + ". " + branch.getBranchName());
//            Little bit redesigned
//            System.out.println(branch.getBranchName());
        }
    }

    public ArrayList getAllBranchesArrayList(){
        return branches;
    }

    private Branch getBranch(String branchName) {
        int branchId;
        branchId = getBranchIdx(branchName);
        if (branchId >= 0) {
            return branches.get(branchId);
        } else {
            return null;
        }
    }

    private boolean isBranchExists(String branchName) {
        if (getBranchIdx(branchName) >= 0) {
            return true;
        }
        return false;
    }

    private int getBranchIdx(String branchName) {
        Branch branch;
        for (int i = 0; i < branches.size(); i++) {
            branch = branches.get(i);
            if (branch.getBranchName().equals(branchName)) {
                return i;
            }
        }
        return -1;
    }


    public String getBankName() {
        return bankName;
    }
}
