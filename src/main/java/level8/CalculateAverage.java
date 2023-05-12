package level8;

public class CalculateAverage {
    public static double find_average(int[] array){
        double sum = 0;
        for (int val : array)
            sum += val;
        return sum / array.length;

    }
}
