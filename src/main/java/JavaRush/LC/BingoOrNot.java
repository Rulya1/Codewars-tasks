package JavaRush.LC;

import java.util.Arrays;

public class BingoOrNot {
    public static void main(String[] args) {
        System.out.println(bingo(new int []{2,9,5,14,7,20,15}));
    }
    public static String bingo(int[] numberArray) {
        int[] checker = {2, 9, 14, 7, 15};
        int count = 0;

        for(int item : checker)
            for(int val: numberArray)
                if(item == val) {
                    count++;
                    break;
                }
        return (count == checker.length) ? "WIN" : "LOSE";

    }
}
