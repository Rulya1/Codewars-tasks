package UdemyJavaCourse.Section10.ListIteratorAutoBoxing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

record GroceryItem(String name , String type , int count){
    public GroceryItem(String name ){
       this(name, "Darry" , 1);
    }
    @Override
    public String toString(){
        return String.format("%d %s in %s" , count , name.toUpperCase() , type);
    }
}

public class ArrayList1 {
    public static void main(String[] args) {
        GroceryItem[] groceryArray = new GroceryItem[3];
        groceryArray[0] = new GroceryItem("milk");
        groceryArray[1] = new GroceryItem("apples", "fruit", 5);
        groceryArray[2] = new GroceryItem("oranges", "fruit", 6);
        System.out.println(Arrays.toString(groceryArray));

        ArrayList <GroceryItem> groceryList = new ArrayList<>();
        groceryList.add(new GroceryItem("Butter"));
        groceryList.add(new GroceryItem("Yogurt"));
        groceryList.add(new GroceryItem("Yogurt" , "DrinkProduct" , 2));
        groceryList.add(0 ,new GroceryItem("Apples" , "fruit" , 2));
        groceryList.set(0, new GroceryItem("Replace first element[0]"));
        groceryList.remove(2);

        System.out.println(groceryList);

    }
}
