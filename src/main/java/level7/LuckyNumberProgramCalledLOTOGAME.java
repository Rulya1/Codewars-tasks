package level7;

import java.util.Random;
import java.util.Scanner;

public class LuckyNumberProgramCalledLOTOGAME {
    public static void main(String[] args) {
       //STEP 1 - ОТРИМАТИ ВВЕДЕННЯ ВІД КОРИСТУВАЧА
        System.out.println("Введіть 6 чисел через кому  (від 1 до 54): ");
        Scanner scan = new Scanner(System.in);
        String chysla = scan.nextLine();
        scan.close();
        String[] strMassyvvedenyhChysel = chysla.split(",");

        //STEP2 - ПРОВЕДЕННЯ РОЗІГРАШУ
        int[] ThisLOto = new int[6];
        Random r = new Random();
        int iNumberOfLOto = 0;
        while (iNumberOfLOto != 6) {
            boolean ExistingNumber = false;
            int ThisNumber = r.nextInt(54) + 1;
            for (int ExistNumber : ThisLOto) {
                if (ExistNumber == ThisNumber) {
                    ExistingNumber = true;
                    break;

                }
            }
            if (ExistingNumber != true) {
                ThisLOto[iNumberOfLOto++] = ThisNumber;
            }
        }

       //STEP3 - Перевірити числа на співпадіння з виграшними
        int iKilkistSpivpadin = 0 ;
        for (int k=0; k<strMassyvvedenyhChysel.length ; k++){
            int chyslo = Integer.parseInt(strMassyvvedenyhChysel[k]);
                for (int ThisWinningNumber : ThisLOto){
                    if (chyslo == ThisWinningNumber){
                        iKilkistSpivpadin++;
                    }
                }
        }
        //STEP 4 - Вивести результат
        String AllNumbers = "";
        for ( int Chyslo : ThisLOto){
            AllNumbers = AllNumbers + Chyslo + " ";

        }        System.out.println("У розіграші співпало ("+ AllNumbers +"): "  + iKilkistSpivpadin);





    }
}
