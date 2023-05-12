package UdemyJavaCourse;

public class BarkingDog {
    public static boolean shouldWakeUp(boolean barking ,int hoursOfDay ) {
        if (!barking || hoursOfDay < 0 || hoursOfDay > 23 || (hoursOfDay > 7 && hoursOfDay < 23)) {
            return false;
        }
        return true;
    }
}

