package VirtualAcademy;

public class Autodealer {
    public static void main(String[] args) {
        Automobile a1 = new Automobile();
        a1.vyrobnyk = "MERCEDES";
        a1.model = "CLS";
        a1.litrper100kv = 10;
        a1.price = 27000;
        a1.rikVupusky = 2017;
        a1.rozmirBenzobaky = 40;
        a1.color = "WHITE";
        System.out.printf(a1.getFullInfo());

        System.out.println( "Ціна за повний бак : "+a1.PriceforFullCharge(10 ) + " літр");

        a1.Beep();


        Automobile a2 = new Automobile();
        a2.vyrobnyk = "OPEL";
        a2.model = "ASTRA J";
        a2.Beep();

    }
}
