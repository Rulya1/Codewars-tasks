package JavaRush.LC;

import java.util.Arrays;

public class cantUnderstand {
    public static void main(String[] args) {
       reverseArray(new int []{1,2,3,4,5,6,7,8,9});
    }
    public static void reverseArray(int[] array) {
        for (int i = 0; i < array.length /2; i++) {
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
            System.out.println(Arrays.toString(array));
        }
    }
}
