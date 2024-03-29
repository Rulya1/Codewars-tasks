package UdemyJavaCourse.Section10.ListIteratorAutoBoxing.AutoBoxingChallenge;

import java.util.ArrayList;


record Customer(String name, ArrayList<Double> transactions) {

    public Customer(String name, double initialDeposit) {
        this(name.toUpperCase(),
                new ArrayList<Double>(5000));
        transactions.add(initialDeposit);
    }


    public static void main(String[] args) {
   Customer bob = new Customer("Bob S " , 1000.5);
        System.out.println(bob);
        Bank bank = new Bank("Chase");
        bank.addNewCustomer("Jane A" , 500.0);
        System.out.println(bank);
        bank.AddTransaction("Jane A" , -10.25);
        bank.AddTransaction("Jane A" , -75);
        bank.printStatement("Jane a");
    }
}
class Bank{
    private String name;
    private ArrayList<Customer> customers = new ArrayList<>(5000);

    public Bank(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "name='" + name + '\'' +
                ", customers=" + customers +
                '}';
    }

    private  Customer getCust(String customerName) {
        for (var customer : customers) {
            if (customer.name().equalsIgnoreCase(customerName)) {
                return customer;
            }
        }
        System.out.printf("Customer (%s) wasn`t found %n" , customerName);
        return null;
    }
     public void addNewCustomer(String customerName , double initialDeposit){
        if (getCust(customerName) == null){
            Customer customer = new Customer(customerName , initialDeposit);
            customers.add(customer);
            System.out.println("New customer added " + customer);
        }
     }
     public void AddTransaction(String name, double transactionAmount){
        Customer customer =getCust(name);
        if (customer != null){
            customer.transactions().add(transactionAmount);
        }
     }
     public void printStatement(String customerName){
        Customer customer = getCust(customerName);
        if (customer == null){
            return;
        }
         System.out.println("_".repeat(30));
         System.out.println("Customer Name = " + customer.name());
         System.out.println("Transactions: ");
         for (double d : customer.transactions()){
             System.out.printf("$%10.2f (%s) %n ", d , d < 0 ? "debital" : "credit");
         }
     }
}