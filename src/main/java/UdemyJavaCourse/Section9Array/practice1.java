package UdemyJavaCourse.Section9Array;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class practice1 {
    public static void main(String[] args) {
        int n = 0;
        for (int i = 2; i <= 20; i++) {
            if (i % 2 == 0) n++;
        }
        int[] Mas = new int[n];
        for (int i = 2, b = 0; i <= 20; i++) {
            if (i % 2 == 0) {
                Mas[b] = i;
                System.out.print(Mas[b] + " ");
                b++;
            }
        }
        System.out.println("");
        System.out.println("_____________");
        int a = 0;
        for (int i = 1 ; i <= 99 ; i++){
            if (i%2 != 0)a++;
        }
        int[] Mas1 = new int[a];
        for (int i = 1,b = 0; i <= 99 ; i++) {
            if (i%2 !=0){
                Mas1[b] = i;
                System.out.print(Mas1[b] + " " );
                b++;
            }
            }
        System.out.println("");
        for (int i = Mas1.length-1;i>=0;i--){
            System.out.print(Mas1[i] + " ");
        }
        }
    }

