package level8;

public class PersonalizedGreeting {
    static String greet(String name, String owner) {
        if (name.equals(owner)) {
            return "Hello boss";
        } else {
            return "Hello guest";
        }
    }
}
//https://www.codewars.com/kata/5772da22b89313a4d50012f7