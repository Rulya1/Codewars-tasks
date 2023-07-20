package UdemyJavaCourse.Section9Array;

import java.util.Arrays;

public class ReverseArrayChallenge {
    public static void main(String[] args) {
        int[] array = {1,3,2,5,6};
        System.out.println(Arrays.toString(array));
        reverse(array);
        System.out.println(Arrays.toString(array));

    }
    public static void reverse(int[] array){
        int[] tempArray = new int[array.length];
        for(int i = 0; i < array.length; i++) {
            tempArray[i] = array[(array.length - 1) - i]; //ask brother
        }
        for(int i = 0; i < array.length; i++) {
            array[i] = tempArray[i];
        }
    }
}
