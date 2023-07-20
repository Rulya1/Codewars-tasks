package VirtualAcademy;

public class Automobile {
    String vyrobnyk;
    String model;
    int rikVupusky;
    String color;
    double price;
    boolean vydkydnuydakh;
    int litrper100kv;
    int rozmirBenzobaky;
    int weight;
    public  void Beep(){
        System.out.println(vyrobnyk + " " + model + " beep-bebep ");
    }
    public String getFullInfo(){
        return vyrobnyk + " " + model
                +"("+ color + ")\n"
                + "  $" + price + "\n"
                + " " + litrper100kv + " літрів на 100 км, бак : "
                +rozmirBenzobaky + "л\n";
    }
     double PriceforFullCharge(double PriceperLitr){
        return PriceperLitr*rozmirBenzobaky;
     }

}
