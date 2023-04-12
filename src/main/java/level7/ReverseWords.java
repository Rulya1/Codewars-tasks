package level7;

public class ReverseWords {
    public static String reverseWords(final String original) {
        if (original.trim().isEmpty()) {
            return original;
        }

        String[] words = original.split(" ");
        StringBuilder reversedString = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            StringBuilder reversedWord = new StringBuilder(word);
            reversedWord.reverse();
            reversedString.append(reversedWord);
            if (i != words.length - 1) {
                reversedString.append(" ");
            }
        }
        return reversedString.toString();
    }
}
