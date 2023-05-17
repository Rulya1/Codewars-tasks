package UdemyJavaCourse.Section5;

public class SecondsAndMinutesChallenge {
    public static void main(String[] args) {
        System.out.println(getDurationString(-1995));
        System.out.println(getDurationString(-9, 65));
    }

    public static String getDurationString(int seconds) {
        if (seconds < 0) {
            System.out.println("Invalid value (" + seconds + ") , must be a positive number");
        }
        int minutes = seconds / 60;
        return getDurationString(minutes, seconds);
    }

    public static String getDurationString(int minutes, int seconds) {
        if (minutes < 0) {
            System.out.println("Invalid value (" + minutes + ") , must be a positive number");
        }
        if (seconds <= 0 || seconds >= 59) {
            System.out.println("Invalid data for (" + seconds + ") , must be between 0 - 59  ");
        }
        int hours = minutes / 60;
        int remainingMinutes = minutes % 60;
        int remainingSeconds = hours % 60;
        return hours + "h " + remainingMinutes + "m " + remainingSeconds + "s";
    }
}
