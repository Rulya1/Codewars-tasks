package UdemyJavaCourse.Section8OOPpart2.ChallengeBurger;

public class Hamburger {
    private double price;
    private String name;
    private String meat;
    private String breadRollType;


    private String addition1Name;
    private String addition2Name;
    private String addition3Name;
    private String addition4Name;

    private double addition1Price;
    private double addition2Price;
    private double addition3Price;
    private double addition4Price;

    public Hamburger(String meat, String name, double price, String breadRollType) {
        this.price = price;
        this.name = name;
        this.meat = meat;
        this.breadRollType = breadRollType;
    }

    public double getPrice() {
        return price;
    }

    public void addHamburgerAddition1(String name, double price) {
        addition1Name = name;
        addition1Price = price;
    }

    public void addHamburgerAddition2(String name, double price) {
        addition2Name = name;
        addition2Price = price;
    }

    public void addHamburgerAddition3(String name, double price) {
        addition3Name = name;
        addition3Price = price;
    }

    public void addHamburgerAddition4(String name, double price) {
        addition4Name = name;
        addition4Price = price;
    }
    public double itemizeHamburger() {
        System.out.println("One order of " + name + " on " + breadRollType + " with " + addition1Name + " "
                + addition2Name + " " + addition3Name + " " + addition4Name);
        return (price + addition1Price + addition2Price + addition3Price + addition4Price);
    }

}
