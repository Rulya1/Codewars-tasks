package UdemyJavaCourse.Section9Array;

import java.util.Arrays;
import java.util.Random;

public class ArrayChallenge {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(getRandomArray(10)));
        int[] testSort = sortArray(new int[]{5, 10, 15, 25});
        System.out.println(Arrays.toString(testSort));

    }

    public static int[] getRandomArray(int len) {
        Random random = new Random();
        int[] arr1 = new int[len];
        for (int i = 0; i < len; i++) {
            arr1[i] = random.nextInt(1000);
        }
        return arr1;
    }

    private static int[] sortArray(int[] array) {
        int[] sortedArr = Arrays.copyOf(array, array.length);
        boolean flag = true;
        int temp = 0;
        while (flag) {
            flag = false;
            for (int i = 0; i < sortedArr.length - 1; i++) {
                if (sortedArr[i] < sortedArr[i + 1]) {
                    temp = sortedArr[i];
                    sortedArr[i] = sortedArr[i + 1];
                    sortedArr[i + 1] = temp;
                    flag = true;
                    System.out.println("->>>" + Arrays.toString(sortedArr));
                }
            }
            System.out.println("->>>" + Arrays.toString(sortedArr));
        }
        return sortedArr;
    }


}