package UdemyJavaCourse.Section8OOPpart2.BurgerChallengeOOPMaster;

public class Item {
    private String type;
    private String name;
    private double price;
    private String size = "Medium";

    public Item(String type, String name, double price) {
        this.type = type.toUpperCase();
        this.name = name.toUpperCase();
        this.price = price;
    }

    public String getName() {
        if (type.equals("SIDE") || type.equals("DRINK")) {
            return size + " " + name;
        }
        return name;
    }

    public double getPrice() {
        return price;
    }
    public double getAdjustedPrice(){
        return  switch (size){
            case "SMALL" -> getPrice() - 0.5;
            case "BIG" -> getPrice() + 1;
            default -> getPrice();
        };
    }

    public void setSize(String size) {
        this.size = size;
    }
    public static void printItem(String name , double price){
        System.out.printf("%20s:%6.2f%n" , name , price);
    }
    public void printItem(){
        printItem(getName() , getAdjustedPrice());
    }

}

