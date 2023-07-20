package UdemyJavaCourse.Section10.ListIteratorAutoBoxing;

import java.util.LinkedList;
import java.util.Scanner;

record Town(String name, int distance) {
    @Override
    public String toString() {
        return String.format("%s (%d)", name, distance);
    }
}


public class LinkedListChallenge {
    public static void main(String[] args) {

        LinkedList<Town> townToVisit = new LinkedList<>();
        Town Adelaide = new Town("Adelaide", 1375);
        addPlace(townToVisit, Adelaide);
        addPlace(townToVisit, new Town("Adelaide", 1375));
        addPlace(townToVisit, new Town("Brisbane", 917));
        addPlace(townToVisit, new Town("Perth", 3923));
        addPlace(townToVisit, new Town("Alice Spring", 2771));
        addPlace(townToVisit, new Town("Darwin", 3972));
        addPlace(townToVisit, new Town("Melbourne", 877));
        addPlace(townToVisit, new Town("Kyiv", 14000));
        townToVisit.addFirst(new Town("Sidney", 0));
        System.out.println(townToVisit);
        var iterator = townToVisit.listIterator();
        Scanner scanner = new Scanner(System.in);
        boolean quitLoop = false;
        boolean forward = true;


        printMenu();
        while (!quitLoop) {
            if (!iterator.hasPrevious()){
                System.out.println("Originating : " + iterator.next());
                forward = true;
            }
            if (!iterator.hasNext()){
                System.out.println("Final : " + iterator.previous());
                forward = false;
            }

            System.out.println("Enter a value");
            String menuItem = scanner.nextLine().toUpperCase().substring(0, 1);
            switch (menuItem) {
                case "F":
                    System.out.println("User wants go forward");
                    if (!forward) {
                        forward = true;
                        if (iterator.hasNext()) {
                            iterator.next();
                        }
                    }
                    if (iterator.hasNext()){
                        System.out.println(iterator.next());
                    }
                    break;
                case "B":
                    System.out.println("User wants go backwards");
                    if (forward) {
                        forward = false;
                        if (iterator.hasPrevious()) {
                            iterator.previous();
                        }
                    }
                    if (iterator.hasPrevious()){
                        System.out.println(iterator.previous());
                    }
                    break;
                case "M":
                    printMenu();
                    break;
                case "L":
                    System.out.println(townToVisit);
                    break;
                default:
                    quitLoop = true;
                    break;
            }
        }

    }

    private static void addPlace(LinkedList<Town> list, Town town) {
        if (list.contains(town)) {
            System.out.println("Found duplicate : " + town);
            return;
        }
        for (Town t : list) {
            if (t.name().equalsIgnoreCase(town.name())) {
                System.out.println("Found Duplicate " + town);
                return;
            }
        }
        int matchIndex = 0;
        for (var listTown : list) {
            if (town.distance() < listTown.distance()) {
                list.add(matchIndex, town);
                return;
            }
            matchIndex++;
        }
        list.add(town);
    }

    private static void printMenu() {
        System.out.println("""
                Available actions (select word or letter):
                                 (A)dd
                                 (F)orward
                                 (B)ackward
                                 (L)ist Places
                                 (M)enu
                                 (Q)uit """);
    }
}