package UdemyJavaCourse.Section6;

public class FirstAndLastDigit {
    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(121));
        System.out.println(sumFirstAndLastDigit(8));
        System.out.println(sumFirstAndLastDigit(-5));
        System.out.println(sumFirstAndLastDigit(762));


    }
    public static int sumFirstAndLastDigit(int number){
        if (number < 0){
            return -1;
        }
        int last = number % 10;
        while (number > 9){
            number /= 10;
        }
        return last + number;

    }
}
