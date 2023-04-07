package level7;

import java.util.Scanner;

public class PracticeWithCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String vvedennya = "0.0";
        double chyslo = 0 , suma = 0  , serednechyslo = 0;
        int  kilkistchysel = 0;
        while (vvedennya.equals(".") != true){
            chyslo = Double.parseDouble(vvedennya);
            suma = suma + chyslo;
            System.out.println("Введіть число або . щоб зупинитись: ");
            vvedennya = scan.nextLine();
            kilkistchysel++;
        }
        serednechyslo = suma / --kilkistchysel;
        System.out.println("СЕРЕДНЄ ЧИСЛО з " + kilkistchysel + " чисел: " + serednechyslo );
    }
}
