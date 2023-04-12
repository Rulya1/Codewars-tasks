package level7;

public class ExesAndOhs {
    public static boolean getXO (String str) {
        if (str == null) {
            return false;
        }
        int countX = 0;
        int countO = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = Character.toLowerCase(str.charAt(i));
            if (c == 'x') {
                countX++;
            } else if (c == 'o') {
                countO++;
            }
        }
        return countX == countO;

    }
}
