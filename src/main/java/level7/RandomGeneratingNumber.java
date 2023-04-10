package level7;

import java.util.Random;
import java.util.Scanner;

public class RandomGeneratingNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random kubik = new Random();
        int number = 0 , userVariable = 0 , attempt = 0;
        do {
            System.out.println("Write a number from 1 to 6: ");
            userVariable = scan.nextInt();
            number = 1 + kubik.nextInt(6);
            System.out.println("Random number is: " + number);
            System.out.println("-------------------------");
            attempt++;
        }
        while (userVariable != number);
        System.out.println("YOU GODDAMN RIGHT");
    }
}
