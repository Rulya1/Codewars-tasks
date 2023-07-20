package UdemyJavaCourse.Section10.ListIteratorAutoBoxing;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ListSummary {
    public static void main(String[] args) {
        String[] originalArray = new String[]{"Fisrt" , "Second" ,"Third"};
        var originalList = Arrays.asList(originalArray);
        originalList.set(0, "one");
        System.out.println("list = " + originalList);
        System.out.println("Array = " + Arrays.toString(originalArray));
        originalList.sort(Comparator.naturalOrder());
        System.out.println(Arrays.toString(originalArray));
    }
}
