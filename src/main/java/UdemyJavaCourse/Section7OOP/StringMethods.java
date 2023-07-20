package UdemyJavaCourse.Section7OOP;

public class StringMethods {
    public static void main(String[] args) {
        String birthDate = "08/01/1999";
        int startingIndex = birthDate.indexOf("1999");
        System.out.println("Starting index :" + startingIndex);
        System.out.println("Year of birth = " + birthDate.substring(startingIndex));
        System.out.println("Month = " + birthDate.substring(3,5));
        String newDate = String.join("/" , "25" , "11" ,"1998");
        System.out.println("newDate = " + newDate);
        System.out.println(newDate.replace('/' , '-'));
        System.out.println((newDate + "\n").repeat(4));



    }
}
