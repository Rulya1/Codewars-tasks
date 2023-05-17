package UdemyJavaCourse.Section6;

import java.util.Scanner;

public class InputUserChallenge {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = 1;
        double sum = 0;
        while (count <= 5) {
            System.out.println("Enter number  #" + count);
            String nextNumber = scan.nextLine();
            try {
                //int number = Integer.parseInt(nextNumber);
                double number = Double.parseDouble(nextNumber);
                count++;
                sum += number;
            } catch (NumberFormatException nfe){
                System.out.println("Invalid Value");
            }
            }
        System.out.println("Total of numbers = " + sum);

        }
    }
