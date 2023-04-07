package level7;

public class DisemvowelTrolls {
    public static String disemvowel(String str) {
       String golosni = "[aeiouAeiou]";
        return str.replaceAll(golosni , "");

    }
}