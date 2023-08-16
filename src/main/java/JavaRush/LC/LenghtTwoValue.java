package JavaRush.LC;

public class LenghtTwoValue {
    public static String[] alternate(int n, String firstValue, String secondValue) {
        String[] arr = new String [n];
        for (int i = 0; i < arr.length; i++) {
        arr[i] = (i % 2 == 0) ? firstValue : secondValue;
        }
        return arr;
    }
}
