package level8;

public class AEIOUaeiou {
    public static String replace(final String s) {
     s.replaceAll("[aeiouAEIOU]" , "!");
        return s;
    }
}