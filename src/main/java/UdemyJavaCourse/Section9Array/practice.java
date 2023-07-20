package UdemyJavaCourse.Section9Array;

import java.util.Arrays;
import java.util.Random;

public class practice {
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < array.length - 1; i++) {
            array[i] = i + 1;
            System.out.println(array[i] + "");
        }
        System.out.println("________________");
        int[] firstArray = getRandomNumber(10);
        System.out.println(Arrays.toString(firstArray));
        Arrays.sort(firstArray);
        System.out.println(Arrays.toString(firstArray));

        int[] secondArray = new int[10];
        System.out.println(Arrays.toString(secondArray));
        Arrays.fill(secondArray, 4);
        System.out.println("____________________");
        int[] thirdArray = getRandomNumber(10);
        System.out.println(Arrays.toString(thirdArray));
        int[] fourArray = Arrays.copyOf(thirdArray , thirdArray.length);
        System.out.println(Arrays.toString(fourArray));
        Arrays.sort(fourArray);
        System.out.println(Arrays.toString(thirdArray));
        System.out.println(Arrays.toString(fourArray));
        System.out.println("_____________");
        int[] s1 = new int[]{1,2,3,4,5};
        int[] s2 = new int[]{2,1,4,4,5};
        Arrays.sort(s2);
        if (Arrays.equals(s1,s2)){
            System.out.println("Equal");
        }else {
            System.out.println("NOT");
        }

    }

    public static int[] getRandomNumber(int num) {
        Random random = new Random();
        int[] newInt = new int[num];
        for (int i = 0; i < num; i++) {
            newInt[i] = random.nextInt(100);
        }
        return newInt;
    }
}
