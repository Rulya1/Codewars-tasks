package UdemyJavaCourse.Section9Array;

import java.util.Arrays;

public class javarushTasks {
    public static void main(String[] args) {
        int[] myArr = {10, 5, 6, 7, 15, 32, 541};
        findMax(myArr);
        System.out.println(Arrays.toString(myArr));
        SerednieArufm();

    }
    public static void findMax(int[] array){
        int maxIndex = 0;
        int max = array[maxIndex];
        for (int i = 0; i < array.length ; i++) {
            if (array[i] > max){
                max = array[i];
                maxIndex = i;
            }
        }
        System.out.println(String.format("Max element is [%d] with index [%d]", max, maxIndex));

    }
    public static void SerednieArufm(){
        int num = 0;
        int[] array = new int[]{10,2,3,4,5,20};
        for (int i = 0; i < array.length ; i++) {
            num += array[i];
        }
        double seredne = (double) num / array.length;
        System.out.println(seredne);

        }
    public static int findAverage(int[] nums) {
    int num = 0;
        for (int i = 0; i < nums.length ; i++) {
            num+= nums[i];
        }
        int avg  = num / nums.length;
        return avg;
    }
    }

