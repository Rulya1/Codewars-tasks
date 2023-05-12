package level7;

public class ReverseWords {
    public static String reverseWords(final String original) {
        String someString = "";
        for (int i = 0; i < original.length(); i++) {
            if (original.charAt(i) >= 'a' && original.charAt(i) <= 'z') {
                someString = original.charAt(i) + someString;
            }
        }
        return someString;
    }
}
