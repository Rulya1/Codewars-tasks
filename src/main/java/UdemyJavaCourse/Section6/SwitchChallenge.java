package UdemyJavaCourse.Section6;

public class SwitchChallenge {
    public static void main(String[] args) {

        char variable = 'A';
        switch (variable) {
            case 'A':
                System.out.println("A is Able");
                break;
            case 'B':
                System.out.println("B isBaker");
                break;
            case 'C':
                System.out.println("C is Charlie");
                break;
            case 'D':
                System.out.println("D is Dog");
                break;
            case 'E':
                System.out.println("E is Easy");
            default:
                System.out.println("Letter " + variable + " is not found in the switch statement");
        }

    }
}