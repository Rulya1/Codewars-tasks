package UdemyJavaCourse.Section9Array;

import java.util.Arrays;
import java.util.Scanner;

public class SortedArray {
    public static void main(String[] args) {
       int[] sort = sortIntegers(new int[] {5,15,6,20,25,10});
        System.out.println(Arrays.toString(sort));
    }
    public static int[] getIntergers(int number) {
        Scanner sc = new Scanner(System.in);
        int[] myArray = new int[number];
        System.out.println("Enter " + number + " integers:");
        for (int i = 0; i < number; i++) {
            myArray[i] = sc.nextInt();
        }
        sc.close();
        return myArray;
    }

    public static void printArray(int[] myArray) {

        for (int i = 0; i < myArray.length; i++) {
            System.out.println("Element " + i + " contents " + myArray[i]);
        }
    }

    public static int[] sortIntegers(int[] myArray) {

        int[] sortedArray = Arrays.copyOf(myArray, myArray.length);
        boolean flag = true;
        int temp;

        while (flag) {
            flag = false;
            for (int i = 0; i < sortedArray.length -1; i++) {
                if (sortedArray[i] < sortedArray[i + 1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i + 1] = temp;
                    flag = true;
                }
            }
        }
        return sortedArray;
    }
}
