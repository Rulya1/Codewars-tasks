package JavaRush;

import java.util.Scanner;

public class DeleteTheSame {
    public static String[] strings;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        strings = new String[6];
        for (int i = 0; i < 6; i++) {
            strings[i] = scan.nextLine();
        }
        for (int i = 0; i < strings.length; i++) {
            if (strings[i].equals(strings[i - 1])) {
                strings[i] = null;
            }
        }
        for (int i = 0; i < strings.length; i++) {
            System.out.print(strings[i] + ", ");
        }

    }
}
