package UdemyJavaCourse.Section6;

public class NewSwitchStatementChallenge {
    public static void main(String[] args) {
        pringDayOfWeek(0);
        pringDayOfWeek(1);
        pringDayOfWeek(2);
        pringDayOfWeek(3);
        pringDayOfWeek(4);
        pringDayOfWeek(5);
        pringDayOfWeek(6);
        pringDayOfWeek(7);

    }

    public static void pringDayOfWeek(int day) {
        String dayOfWeek = switch (day) {
            case 0 -> "Sunday";
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            default -> "Invalid day";
        };
        System.out.println(day + " stands for " + dayOfWeek);
    }
}
