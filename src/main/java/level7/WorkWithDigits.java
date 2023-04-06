package level7;

public class WorkWithDigits {
    public static String fakeBin(String numberString) {
        return numberString.replaceAll("[0-4]" , "0").replaceAll("[5-9]" , "1");
    }
}
//https://www.codewars.com/kata/57eae65a4321032ce000002d