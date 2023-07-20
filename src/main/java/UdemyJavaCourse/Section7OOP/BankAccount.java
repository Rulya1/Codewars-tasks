package UdemyJavaCourse.Section7OOP;

public class BankAccount {
    private int bankAccount;
    private double balance;
    private String customerName;
    private String emailAddress;
    private String phoneNumber;

    public BankAccount() {
        this(3345, 1000.5, "Ruslan", "ruslanmurmilo@gmail.com",
                "380_98_76_74_518");
        System.out.println("Empty Constructor called");
    }

    public BankAccount(int bankAccount, double balance, String customerName, String emailAddress, String phoneNumber) {
        System.out.println("Constructor with parameters");
        this.bankAccount = bankAccount;
        this.balance = balance;
        this.customerName = customerName;
        this.emailAddress = emailAddress;
        this.phoneNumber = phoneNumber;


    }


    public void depositFunds(double depositAmount) {
        balance += depositAmount;
        System.out.println("Deposit of $" + depositAmount + " New Balance : $" + balance);
    }

    public void withdrawMetod(double withdrawAmount) {
        if (balance - withdrawAmount < 0) {
            System.out.println("Insuffiens Fund! You only have :$" + balance + " in your account");
        } else {
            balance -= withdrawAmount;
            System.out.println("Withdraw of $" + withdrawAmount + " New Balance : $" + balance);
        }
    }

    public int getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(int bankAccount) {
        this.bankAccount = bankAccount;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
