package level7;

public class HighestAndLowest {
    public static String highAndLow(String numbers) {
        String[] array = numbers.split(" ");
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length(); i++) {
            int value = Integer.parseInt(array[i]);
            if (value < min) min = value;
            if (value > max) max = value;
        }
       return String.format("%d %d", max , min);
    }

}

