package UdemyJavaCourse.Section6;

public class LastDigitChecker {
    public static boolean hasSameLastDigit(int n1 , int n2 , int n3){
        if (n1 >= 10 && n1 <= 1000 && n2 >= 10 && n2 <= 1000 &&  n3 >= 10 && n3 <= 1000){
            int n1LastChecker = n1 % 10;
            int n2LastChecker = n2 % 10;
            int n3LastChecker = n3 % 10;
            return (n1LastChecker == n2LastChecker || n2LastChecker == n3LastChecker || n1LastChecker == n3LastChecker);
        }
        else return  false;
    }
    public static boolean isValid( int valid){
        if ( valid >= 10 && valid <= 1000){
            return true;
        }
        return false;
    }
}
