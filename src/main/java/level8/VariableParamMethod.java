package level8;

public class VariableParamMethod {
    public static void main(String[] args) {
        System.out.println(VyrakhyvatySerednieChyslo(1,2,3,4,5,6,7,8,9,10));

    }

    public static double VyrakhyvatySerednieChyslo(int... numbers) {
        int suma = 0;
        for (int i : numbers) {
            suma += i;
        }             return (double) suma / (double) numbers.length;

    }
}