package VirtualAcademy;

import java.util.Scanner;

public class GameOfXO {
    // фіксовані змінні які вказують на вміст комірки
    public static final String POROZNYA = "  ", KHRESTYK = " X ", NYLUK = " O ";
    public static String ActiveGamer;
    // змінні для зберігання інфи про ігрове поле і стан гри
    public static final int RYADKIV = 3, STOVPCHYKIV = 3;
    public static String[][] Sitka = new String[RYADKIV][STOVPCHYKIV];
    public static int StatusGry;
    public static final int STATUS_GAME_CONTINUE = 0, STATUS_DRAW = 1, STATUS_WINNER_X = 3, STATUS_WINNER_O = 4;
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        PochatyGry();
        do {
            OtrymatyVvedennyaGratvsya();
            ProanalizuvatySitky();
            VyvestySitky();
            if (StatusGry == STATUS_WINNER_X){
                System.out.println("X-WINNER ,  CONGRATZ!!!!");
            }
            else if(StatusGry == STATUS_WINNER_O){
                System.out.println("0-WINNER, COGRATZ!!!!!");
            }
            else if (StatusGry == STATUS_DRAW){
                System.out.println("DRAW!! GOOD GAME!");
            }
            ActiveGamer = (ActiveGamer==KHRESTYK? NYLUK:KHRESTYK);

        }
        while (StatusGry == STATUS_GAME_CONTINUE);

    }

    public static void PochatyGry() {
        for (int ryad = 0; ryad < RYADKIV; ryad++) {
            for (int stovp = 0; stovp < STOVPCHYKIV; stovp++) {
                Sitka[ryad][stovp] = POROZNYA;
            }
        }
        ActiveGamer = KHRESTYK;
        VyvestySitky();
    }

    public static void OtrymatyVvedennyaGratvsya() {
        boolean vvedennyaDijsne = false;
        do {
            System.out.println("Гравець `" + ActiveGamer + "`, введіть рядок (від 1 до 3) та стовпчик (від 1 до 3) через пробіл ");
            int ryad = in.nextInt() - 1;
            int stovp = in.nextInt() - 1;
            if (ryad >= 0 && ryad < RYADKIV && stovp >= 0 && stovp < STOVPCHYKIV && Sitka[ryad][stovp] == POROZNYA) {
                Sitka[ryad][stovp] = ActiveGamer;
                vvedennyaDijsne = true;
            } else {
                System.out.println("Неправильний ввід,спробуйте ще раз");
            }
        }
        while (!vvedennyaDijsne);
    }

    public static void ProanalizuvatySitky() {
        String Winner = FindWinner();
        if (Winner.equals(KHRESTYK)) {
            StatusGry = STATUS_WINNER_X;
        }
        else if (Winner.equals(NYLUK)){
            StatusGry = STATUS_WINNER_O;
        }
        else if (ChyzVciKlitinkyZapovneni()){
            StatusGry = STATUS_DRAW;
        }
        else StatusGry = STATUS_GAME_CONTINUE;
    }

    public static boolean ChyzVciKlitinkyZapovneni() {
        for (int ryad = 0 ; ryad < RYADKIV; ryad++){
            for (int stovp = 0 ; stovp < STOVPCHYKIV ; stovp++){
                if (Sitka[ryad][stovp] == POROZNYA){
                    return false;
                }
            }
        }
        return true;
    }

    public static String FindWinner() {
        int iKilkistOdnakovych;
       //ПЕРЕВІРКА В РЯДОК
        for (int ryad = 0; ryad < RYADKIV; ryad++) {
            iKilkistOdnakovych = 0;
            for (int stovp = 0; stovp < STOVPCHYKIV; stovp++) {
                if (Sitka[ryad][0] != POROZNYA && Sitka[ryad][0] == Sitka[ryad][stovp]) {
                    iKilkistOdnakovych++;
                }
            }
            if (iKilkistOdnakovych == 3) {
                return Sitka[ryad][0];
            }
        }
        // ПЕРЕВІРКА В СТОВПЧИК
        for (int stovp = 0; stovp < STOVPCHYKIV; stovp++) {
            iKilkistOdnakovych = 0;
            for (int ryad = 0; ryad < RYADKIV; ryad++) {
                if (Sitka[0][stovp] != POROZNYA && Sitka[0][stovp] == Sitka[ryad][stovp]) {
                    iKilkistOdnakovych++;
                }
            }
            if (iKilkistOdnakovych == 3) {
                return Sitka[0][stovp];
            }
        }
         if (Sitka[0][0] != POROZNYA && Sitka[0][0] == Sitka[1][1] && Sitka[0][0] == Sitka[2][2]){
             return Sitka[0][0];
         }
         if (Sitka[0][2] != POROZNYA && Sitka[1][1] == Sitka[0][2] && Sitka[2][0] == Sitka[0][2]){
             return Sitka[0][2];
         }
         return POROZNYA;
    }

        public static void VyvestySitky()  {
            for (int ryad = 0; ryad < RYADKIV; ryad++) {
                for (int stovp = 0; stovp < STOVPCHYKIV; stovp++) {
                    System.out.print(Sitka[ryad][stovp]);
                    if (stovp != STOVPCHYKIV - 1) {
                        System.out.print("|");
                    }
                }
                System.out.println();
                if (ryad != RYADKIV - 1) {
                    System.out.println("-----------");
                }
            }
            System.out.println();
        }

}