package UdemyJavaCourse.Section9Array;

import java.util.Arrays;
import java.util.Scanner;

public class MinimumArrayChallenge {
    public static void main(String[] args) {
       int[] returnedArr = readIntegers();
        System.out.println(Arrays.toString(returnedArr));
        int returnedMin = findMin(returnedArr);
        System.out.println("min=" + returnedMin);

    }

    private static int[] readIntegers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write a numbers what you want , delimited by comma");
        String input = scanner.nextLine();
        String[] split = input.split(",");
        int[] values = new int[split.length];

        for (int i = 0; i < split.length ; i++) {
            values[i] = Integer.parseInt(split[i].trim());
        }
        return values;
    }

    public static int findMin(int[] array) {
       int min = Integer.MAX_VALUE;
        for (int el: array) {
            if (el<min){
                min = el;
            }
        }
        return min;



    }
}
