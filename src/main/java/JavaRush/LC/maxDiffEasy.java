package JavaRush.LC;

public class maxDiffEasy {
    public static void main(String[] args) {
        System.out.println(maxDiff(new int []{1,2,3,4}));
    }
    public static int maxDiff(int[] lst) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        if (lst.length <= 0){
            return 0;
        }
        for (int i = 0; i <lst.length ; i++) {
            if (lst[i] < min){
                min = lst[i] ;
            }
            if (lst[i] > max){
                max = lst[i];
            }
        }
        int  sum = max - min;
        return sum;
    }
}
