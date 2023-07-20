package UdemyJavaCourse.Section6;

import java.util.Scanner;

public class MinMaxChallenge {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double minNumber = 0;
        double maxNumber = 0;
        int count = 0;
        while (true) {
            System.out.println("Enter a number or any character to exit: ");
            String nextEntry = scan.nextLine();
            try {
                double validNum = Double.parseDouble(nextEntry);
                if (count == 0 || validNum < minNumber){
                    minNumber = validNum;
                }
                if (count == 0 || validNum > maxNumber){
                    maxNumber = validNum;
                }
                count++;
            } catch (NumberFormatException npe) {
                break;
            }
        }
        if (count >0){
            System.out.println("Min =" + minNumber + "Max = " + maxNumber);
        }
        else System.out.println("No valid data");

    }
}
