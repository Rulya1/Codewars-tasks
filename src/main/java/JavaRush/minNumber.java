package JavaRush;

import java.util.Arrays;
import java.util.Scanner;

public class minNumber {
    public static int[] array;

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scan.nextInt();
        }
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < array.length ; i++) {
            if ( min > array[i]){
                min = array[i];
            }
        }
        System.out.println(min);
}
}
