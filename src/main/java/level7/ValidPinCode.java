package level7;

public class ValidPinCode {
    public static boolean validatePin(String pin) {
        int i;
        if (pin.length() != 4 && pin.length() != 6) {
            return false;
        }
        for (i = 0; i < pin.length(); i++) {
            if (!Character.isDigit(pin.charAt(i))) {
                return false;
            }
        }
        return true;
    }

}
