package UdemyJavaCourse;

public class TeenNumberChecker {
    public static boolean hasTeen(int t1, int t2, int t3) {
       return  isTeen(t1) || isTeen(t2) || isTeen(t3);

    }
    public static boolean isTeen(int tt1){
        if (tt1 >= 13 && tt1 <= 19){
            return true;
        }
        else return false;
    }
}
