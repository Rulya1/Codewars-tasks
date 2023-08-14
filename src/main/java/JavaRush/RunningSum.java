package JavaRush;


import java.util.Arrays;

public class RunningSum {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new int []{1,1,1,1,1}));
    }
    public static int[] runningSum(int[] nums) {
        int runSum = 0;
        for (int i = 1; i < nums.length ; i++){
        nums[i] += nums[i-1];
        }
        return nums;
    }

}