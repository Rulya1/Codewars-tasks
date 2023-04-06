package level7;

import java.util.Locale;

public class NameIntoInitials {
    public static String abbrevName(String name) {
        String[] names = name.split(" ");

        return (names[0].charAt(0) + "." + names[1].charAt(0)).toUpperCase();
    }
}
//https://www.codewars.com/kata/57eadb7ecd143f4c9c0000a3