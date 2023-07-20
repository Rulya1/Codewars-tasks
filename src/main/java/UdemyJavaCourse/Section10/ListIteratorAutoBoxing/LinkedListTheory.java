package UdemyJavaCourse.Section10.ListIteratorAutoBoxing;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListTheory {
    public static void main(String[] args) {
        // LinkedList<String> placeToVisit = new LinkedList<>(); OR WE CAN DO IT WITH VAR
        var placetoVisit = new LinkedList<String>();
        placetoVisit.add("Sydney");
        placetoVisit.add(0, "Australia");
        System.out.println(placetoVisit);

        addElemnets(placetoVisit);
        System.out.println(placetoVisit);

     //   removeElements(placetoVisit);
     //   System.out.println(placetoVisit);
     //   getElements(placetoVisit);
        printItinerary(placetoVisit);
        System.out.println("____________");
       // printItinerary3(placetoVisit);
        testIterator(placetoVisit);


    }

    private static void addElemnets(LinkedList<String> list) {
        list.addFirst("Darwin");
        list.addLast("Hobart");
        list.offer("London");
        list.offerFirst("Italy");
        list.offerLast("Africa");
        list.push("Ukraine");
    }

    private static void removeElements(LinkedList<String> list) {
        list.remove(4);
        list.remove("Italy");
        System.out.println(list);
        String s1 = list.remove();
        System.out.println(s1 + " was removed");
        String s2 = list.removeFirst();
        System.out.println(s2 + " was removed");
        String s3 = list.removeLast();
        System.out.println(s3 + " was removed");
        String p1 = list.poll();
        System.out.println(p1 + "was removed");
        String p2 = list.pollFirst();
        System.out.println(p2 + "was removed");
        String p3 = list.pollLast();
        System.out.println(p3 + "was removed");
        list.push("huy");
        list.push("adn");
        list.push("da3");
        System.out.println(list);
        String p4 = list.pop();
        System.out.println(p4);
    }
    private static void getElements(LinkedList<String> list){
        System.out.println("Element = " + list.get(4));
        System.out.println("First Element = " + list.getFirst());
        System.out.println("Last = " + list.getLast());
        System.out.println("Ukraine is on position : " + list.indexOf("Ukraine"));
        System.out.println("Last Elements is : " + list.lastIndexOf(list.getLast()));
        //Queue retrieval method
        System.out.println("Element from elements() =  " + list.element());
       //Stack retrieval methods
        System.out.println("Element from peek() = " + list.peek() );
        System.out.println("First Element from peek() = " + list.peekFirst() );
        System.out.println("Last Element from peek() = " + list.peekLast() );

    }
    public static void printItinerary(LinkedList<String> list){
        System.out.println("Trip starts at : " + list.getFirst());
        for (int i = 1; i < list.size() ; i++) {
            System.out.println(">>> From: " + list.get(i-1) + " to: " +   list.get(i));
        }
        System.out.println("Trip ends at : " + list.getLast());
        
    }
    public static void printItinerary2(LinkedList<String> list){
        System.out.println("Trip starts at : " + list.getFirst());
        String previousTown = list.getFirst();
        for (String town: list) {
            System.out.println(">>>>> From : " + previousTown  + " to " + town);
            previousTown = town;
        }
        System.out.println("Trip ends at : " + list.getLast());
    }
    public static void printItinerary3(LinkedList<String> list){
        System.out.println("Trip starts at : " + list.getFirst());
        String previousTown = list.getFirst();
        ListIterator<String> iterator = list.listIterator(1);
        while (iterator.hasNext()){
            var town = iterator.next();
            System.out.println(">>>>> From : " + previousTown  + " to " + town);
            previousTown = town;
        }
        System.out.println("Trip ends at : " + list.getLast());

    }
    private static void testIterator(LinkedList<String> list){
        var iterator = list.listIterator();
        while (iterator.hasNext()){
          //  System.out.println(iterator.next());
            if (iterator.next().equals("Italy")){
                iterator.remove();
            }
        }
        System.out.println(list);
    }
}
