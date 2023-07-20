package UdemyJavaCourse.Section10.ListIteratorAutoBoxing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MoreLists {
    public static void main(String[] args) {
        String[] items = {"Apples", "Banana", "milk", "eggs"};
        var list = List.of(items);
        System.out.println(list);
        ArrayList<String> grocery = new ArrayList<>(list);
        grocery.add("yogurt");
        System.out.println(grocery);
        ArrayList<String> newList = new ArrayList<>(List.of("HUY", "ZALUPA", "PUSSY", "DICK"));
        System.out.println(newList);
        grocery.addAll(newList);
        System.out.println(grocery);
        System.out.println(grocery.get(7));
        if (grocery.contains("HUY")) {
            System.out.println("List contains huy"); //якщо містить- contains
        }
        grocery.add("HUY"); //додає елемент
        System.out.println(grocery.indexOf("HUY")); // first index of element , (if same elements are 2)
        System.out.println(grocery.lastIndexOf("HUY")); // last index of element , (if same elements are 2)
        grocery.retainAll(List.of("HUY", "ZALUPA")); // видаляє всі елементи які не задані в параметрах
        System.out.println(grocery);
        System.out.println("IsEmpmty? = " + grocery.isEmpty()); // empty - true , not - false
        grocery.addAll(List.of("BACON", "CHEESE")); // adding elements as much as you want
        grocery.addAll(Arrays.asList("WATER", "COLA"));
        System.out.println(grocery);
        grocery.sort(Comparator.naturalOrder()); // sort by alphabet
        System.out.println(grocery);
        grocery.sort(Comparator.reverseOrder()); // reverse sort
        System.out.println(grocery);
        System.out.println("__________________");

        var groceryArray = grocery.toArray(new String[grocery.size()]);
        System.out.println(Arrays.toString(groceryArray));
        String[] arr = new String[]{"1" , "5" ,"3"};
        System.out.println(Arrays.binarySearch(arr, "5"));


    }
}
