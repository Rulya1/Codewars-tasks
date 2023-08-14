package JavaRush;

public class divisor {
    public static boolean isDivisible(int number, int... divisors) {
        if (divisors.length == 0){
            return  true;
        }
        for (int divisor: divisors) {
            if (divisor == 0){
               throw new IllegalArgumentException("Cannot be 0");
            }
            if (number %  divisor !=0){
                return  false;
            }

        }
        return true;

    }
}
