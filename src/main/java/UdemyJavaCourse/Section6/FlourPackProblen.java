package UdemyJavaCourse.Section6;

public class FlourPackProblen {
    public static void main(String[] args) {
        System.out.println(canPack(2,2,5));
    }
    public static boolean canPack(int bigCount, int smallCount, int goal) {
        for (int i = 0; i <= bigCount; i++) {
            for (int j = 0; j <= smallCount; j++) {
                if (goal == (i * 5) + j) {
                    return true;
                }
            }
        }
        return false;
    }
}