package JavaRush;

import java.util.Arrays;
import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
            int[] array = new int[n];
            for (int i = 0; i < n; i++) {
                array[i] = scan.nextInt();
            }
           if (n % 2 == 0){
               for (int i = array.length-1; i >=0 ; i--) {
                   System.out.println(array[i]);
               }
           }
           else {
               for (int i = 0; i < array.length; i++) {
                   System.out.println(array[i]);
               }
           }

    }
}
