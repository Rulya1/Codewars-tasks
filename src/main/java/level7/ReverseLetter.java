package level7;

public class ReverseLetter {
    public static String reverseLetter(final String str) {
 if (str.trim().isEmpty()) {
     return str;
 }
    String[] words = str.split("");
 StringBuilder ReverseWords = new StringBuilder();
        for (int i = 0; i <str.length() ; i++) {
            String word = words[i];
            StringBuilder reverseword = new StringBuilder();
            reverseword.reverse();
            ReverseWords.append(reverseword);
            if (i != words.length - 1) {
                ReverseWords.append(" ");
            }
        }
            return  ReverseWords.toString();
        }
}
