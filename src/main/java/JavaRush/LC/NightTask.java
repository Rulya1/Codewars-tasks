package JavaRush.LC;

public class NightTask {
    public static void main(String[] args) {
        System.out.println(solve(new int []{-3,1,2,3,-1,-4,-2}));
    }
    public static int solve(int [] arr){
        int res = 0;
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] + arr[j] == 0){
                    arr[i] = 0;
                    arr[j] = 0;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0){
                res=arr[i];
            }
        }
        return res;

    }
}
