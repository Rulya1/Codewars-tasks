package UdemyJavaCourse.Section6;

public class SharedDigits {
    public static void main(String[] args) {
        System.out.println(SharedDigit(15 , 54));
    }
    public static boolean SharedDigit(int n1, int n2) {
        // 65 || 78
        if (n1 >= 10 && n1 <= 99 && n2 >= 10 && n2 <= 99) {
            int num1first = n1 / 10;
            int num1last = n1 % 10;
            int num2first = n2 / 10;
            int num2last = n2 % 10;
            return ( num1first == num2first || num1last == num2last || num1first == num2last || num1last == num2first );
        }
        else
        return false;
    }
}
