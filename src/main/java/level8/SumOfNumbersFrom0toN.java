package level8;

public class SumOfNumbersFrom0toN {

    public static String showSequence(int value){

        if (value < 0)
            return value + "<0";
        if (value == 0)
            return "0=0";
        int sum = 0;
        String result = "0";
        for (int i = 1; i <= value; i++) {
            result += "+" + i;
            sum += i;
        }

        return result += " = " + sum;
    }
}
