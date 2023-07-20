package UdemyJavaCourse.Section10.ListIteratorAutoBoxing.AnotherBankingChallenge;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<Branch>();
    }

    private boolean addBranch(String name) {
        if (findBranch(name) == null) {
            Branch branch = new Branch(name);
            this.branches.add(branch);
            return true;
        }
        return false;
    }

    public boolean addCustomer(String branchName, String customerName, double initialDeposit) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            return branch.newCustomer(customerName, initialDeposit);
        } else {
            Branch newBranch = new Branch(branchName);
            newBranch.newCustomer(customerName, initialDeposit);
            this.branches.add(newBranch);
        }
        return false;
    }

    public boolean addCustomerTransaction(String branchName, String customerName, double transactions) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            return branch.addCustomerTransaction(customerName, transactions);

        }
        return false;
    }

    private Branch findBranch(String name) {
        for (var branch : this.branches) {
            if (branch.getName().equalsIgnoreCase(name)) {
                return branch;
            }
        }
        return null;
    }
    public boolean listCustomers(String branchName , boolean printTransactions){
        Branch branch = findBranch(branchName);
        if(branch == null){
            return false;
        }
        ArrayList<Customer> customers = branch.getCustomers();
        if(customers.size() == 0) {
            return false;
        }
        System.out.println("Customer details for branch " + branch.getName());
        for(Customer customer : customers) {
            System.out.println("Customer: " + customer.getName() + "[" + (customers.indexOf(customer)+1) + "]");
            if(!(printTransactions)) {
                continue;
            }
            System.out.println("Transactions");
            ArrayList<Double> transactions = customer.getTransactions();
            for (Double transaction : transactions) {
                String toString = String.format("%,.2f", transaction);
                System.out.println("[" + (transactions.indexOf(transaction)+1) + "]  Amount " + toString);
            }
        }
        return true;
    }

    }



class Branch {
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<Customer>();

    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public Customer findCustomer(String name) {
        for (var customer : customers) {
            if (customer.getName().equalsIgnoreCase(name)) {
                return customer;
            }
        }

        return null;
    }

    public boolean newCustomer(String nameOfCustomer, double initialTransaction) {
        if (findCustomer(nameOfCustomer) == null) {
            Customer customer1 = new Customer(nameOfCustomer, initialTransaction);
            customers.add(customer1);
            return true;
        } else {
            return false;
        }
    }

    public boolean addCustomerTransaction(String name, double transaction) {
        Customer customer = findCustomer(name);
        if (findCustomer(name) != null) {
            customer.transactions.add(transaction);
            return true;
        } else return false;
    }
}

class Customer {
    private String name;
    ArrayList<Double> transactions = new ArrayList<>();

    public Customer(String name, double initialDeposit) {
        this.name = name;
        this.transactions.add(initialDeposit);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }

    public void addTransactions(double transaction) {
        this.transactions.add(transaction);
    }
}

