package level8;

import UdemyJavaCourse.Section7OOP.StringBuilderPractice;

public class NightScoop {
    public static void main(String[] args) {
        System.out.println(multiTable(8));
    }
    public static String multiTable(int num) {
       StringBuilder sb = new StringBuilder();
        int result = 0;
        for (int i = 1; i <= 10; i++) {
           result =  i * num;
            sb.append(i + " * " + num + " = " + result + "\n");
        }
        return sb.toString().trim();
    }
    public int adjacentElementsProduct(int[] array) {
        // your code here
        return 0;
    }
}
