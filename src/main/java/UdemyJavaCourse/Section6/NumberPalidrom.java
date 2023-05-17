package UdemyJavaCourse.Section6;

public class NumberPalidrom {
    public static boolean isPalindrome(int number) {
        if (number < 0) {
            number *= -1;
        }

        int reverse = 0;
        int stored = number;
        while (stored > 0) {
            int digit = stored % 10;
            reverse = (reverse * 10) + digit;
            stored /= 10;   // same as number = number / 10;
        }

        if (number == reverse) {
            return true;
        } else {
            return false;
        }

    }
}
