package UdemyJavaCourse.Section6;

public class ForLoop {
    public static void main(String[] args) {
        double percent = 0.25d;
        for (double i = 7.5d; i <= 10.00; i += 0.25) {
            for (double k = 100; k <= 500; k += 100) {
                if ( k >=500){
                    break;
                }

                double IntAmounth = CalculateInterest(k, i);
                System.out.println(k + "$ " + i + "% interest =$" + IntAmounth);
            }
        }
    }

    public static double CalculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }
}
