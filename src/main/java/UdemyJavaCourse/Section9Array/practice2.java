package UdemyJavaCourse.Section9Array;

import java.util.Arrays;
import java.util.Random;

public class practice2 {
    public static void main(String[] args) {
       /* int b = 0;
        int[] massive = new int[15];
        for (int i = 0; i < massive.length; i++) {
            Random random = new Random();
            massive[i] = random.nextInt(10);
            System.out.print(massive[i] + " ");
            if (massive[i] > 0 && massive[i] % 2 == 0) {
                b++;
            }
        }
        System.out.println("");
        System.out.println("In masive we have " + b + " parni numbers");

        System.out.println("__________");
        int[] mass = new int[8];
        for (int i = 0; i < mass.length; i++) {
            Random rd = new Random();
            mass[i] = rd.nextInt(10);
            System.out.print(massive[i] + " ");
        }
        System.out.println("");
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] % 2 != 0) {
                mass[i] = 0;
                System.out.print(mass[i]);
            }

        }*/
        System.out.println("_______________________");
        int[] arr1 = new int[5];
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < arr1.length; i++) {
            Random random = new Random();
            arr1[i] = random.nextInt(5)+ 1;
            System.out.print(arr1[i] + " ");
            sum1 += arr1[i];
        }
         int avg1 = sum1 / arr1.length;

        System.out.println(avg1);
        System.out.println("");
        int[] arr2 = new int[5];
        for (int i = 0; i < arr2.length; i++) {
            Random r = new Random();
            arr2[i] = r.nextInt(5 )+1;
            System.out.print(arr2[i] + " ");
            sum2 += arr2[i];
        }
        int avg2 = sum2 / arr2.length;

        System.out.println(avg2);
        System.out.println("");
        if (avg1 == avg2){
            System.out.println("Equal");
        } else if (avg1> avg2){
            System.out.println("first array have biggest numbers");
        } else System.out.println("second array have biggest numbers");
        System.out.println("");
        int[] arr3 = new int[4];
        for (int j = 0; j <arr3.length ; j++) {
            Random r = new Random();
            arr3[j] = r.nextInt( 89 )+10; // why is no working? supposed to start with 10 and end with 99 , but output has 107
            System.out.print(arr3[j]+ " ");
        }

    }

}
