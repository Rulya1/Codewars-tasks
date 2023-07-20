package UdemyJavaCourse.Section7OOP;

public class StringBuilderPractice {
    public StringBuilderPractice(String s) {
    }

    public static void main(String[] args) {
        String helloWorld = "Hello" + " World";
        StringBuilderPractice helloWorld1 = new StringBuilderPractice("Hello" + " World");
        prinInformation(helloWorld);
        prinInformation(helloWorld1);

    }

    public static void prinInformation(String string) {
        System.out.println("String = " + string);
        System.out.println("Lengh = " + string.length());
    }

    public static void prinInformation(StringBuilderPractice builder) {
        System.out.println("StringBuilder = " + builder);
        System.out.println("Lengh = " + builder.toString().length());
    }

    public void append(String s) {
    }
}
