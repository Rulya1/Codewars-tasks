package level8;

public class CanCarRideOrNot {
    public static boolean zeroFuel(double distanceToPump, double mpg, double fuelLeft) {
        double OurDistance = fuelLeft * mpg;
        if (distanceToPump <= OurDistance){
            return true;
        }
        else return false;
    }
}
//https://www.codewars.com/kata/5861d28f124b35723e00005e