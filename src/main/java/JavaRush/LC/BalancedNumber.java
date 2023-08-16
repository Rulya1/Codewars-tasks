package JavaRush.LC;

public class BalancedNumber {
   public static String oddOrEven (int[] array) {
       int sum = 0;
       for (int i = 0; i < array.length; i++) {
           sum+=i;
       }
       return sum % 2 == 0 ? "even" : "odd";
    }


}
