package com.holms.unit9;

/* TODO:
         You job is to create a simple banking application.
         There should be a Bank class
         It should have an arraylist of Branches
         Each Branch should have an arraylist of Customers
         The Customer class should have an arraylist of Doubles (transactions)
         Customer:
         Name, and the ArrayList of doubles.
         Branch:
         Need to be able to add a new customer and initial transaction amount.
         Also needs to add additional transactions for that customer/branch
         Bank:
         Add a new branch
         Add a customer to that branch with initial transaction
         Add a transaction for an existing customer for that branch
         Show a list of customers for a particular branch and optionally a list
         of their transactions
         Demonstration autoboxing and unboxing in your code
         Hint: Transactions
         Add data validation.
         e.g. check if exists, or does not exist, etc.
         Think about where you are adding the code to perform certain actions


*/
public class BankingApp {

    public static void main(String[] args) {

        //First Version of tests
/*
//        Test Customer class

        Customer holms = new Customer("Holms", 20);
        System.out.println("Last transaction was " + holms.showLastTransaction() + "$");
        holms.showTransactionsHistory();
        holms.addTransaction(10);
        System.out.println("Last transaction was " + holms.showLastTransaction() + "$");


//       Test Branch class
        System.out.println("\nTesting Branch class");
        Branch kievBranch = new Branch("Kiev Branch ");
        System.out.println("Added new branch " + kievBranch.getBranchName());
        kievBranch.addCustomer("Ivan Petrov", 20);
        kievBranch.addCustomer("Simon Petlyura", 350);
        kievBranch.addCustomer("Alex Zeos", 5);
        kievBranch.showAllCustomers();
        kievBranch.showAllCustomersActivity();
//        Adding transactions
        kievBranch.addTransaction("Ivan Petrov", -1.0);
        kievBranch.addTransaction("Ivan Petrov", 30);
        kievBranch.addTransaction("Alex Zeos", 50);

        kievBranch.showAllCustomersActivity();

*/


//      Test Bank class
        System.out.println("Testing Bank class\n");

        Bank myBank = new Bank("My Own Bank");
        System.out.println("Added new bank " + myBank.getBankName());

        myBank.addBranch("Kiev Head Quarter");
        myBank.addBranch("Odessa Branch");
        myBank.addBranch("Kharkov Branch");

        System.out.println();
        myBank.showAllBranches();

        myBank.addCustomer("Ivan Petrov", 50, "Kiev Head Quarter");
        myBank.addCustomer("John Dou", 10, "Odessa Branch");
        myBank.addCustomer("Vasily Pupkin", 50, "Kharkov Branch");


//        myBank.


    }
}
