package UdemyJavaCourse.Section7OOP;

public class Customer {
    private String name;
    private int creditLimit;
    private String emailAdress;

    public Customer(String name , int creditLimit , String emailAdress){
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAdress = emailAdress;
    }
    public Customer(){
        this("Nobody" , "nobodynowhere.com");
    }
    public Customer(String name , String emailAdress){
        this(name , 1000 , emailAdress);
    }

    public String getName() {
        return name;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAdress() {
        return emailAdress;
    }
}
