package UdemyJavaCourse.Section4;

public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double num1 , double num2){

        int checkNumber1 = (int) (num1 * 1000);
        int checkNumber2 = (int) (num2 * 1000);
        if (checkNumber1 - checkNumber2 ==0){
            return true;
        }
        else return false;

    }
    }
