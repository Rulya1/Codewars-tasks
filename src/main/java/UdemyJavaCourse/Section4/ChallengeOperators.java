package UdemyJavaCourse.Section4;

public class ChallengeOperators {
    public static void main(String[] args) {

        double d = 20.00d;
        double d2 = 80.00d;
        double sum = (d + d2) * 100;
        System.out.println(sum);
        double Remainder = sum % 40d;
        System.out.println(Remainder);
        boolean test = (Remainder ==0) ? true : false;
        System.out.println(test);
        if (!test){
            System.out.println("GOT SOME REMINDER");
        }
    }
}