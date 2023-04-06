package level7;

public class PrinterError {
    public static String printerError(String s) {
        int count = 0;
        int i;
        for (i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c < 'a' || c > 'm') {
                count++;
            }
        }
            return count + "/" + s.length();
        }
    }