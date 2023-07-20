package UdemyJavaCourse.Section8OOPpart2.Polymorphism;

import java.util.Scanner;

public class runner {
    public static void main(String[] args) {
        Movie movie = Movie.getMovie("Adv" , "BlackBird");
        movie.watchMovie();
        Scanner s = new Scanner(System.in);
        while (true){
            System.out.printf("Enter a type of movie (A for Adv , C for Comedy , S for Science , Q for Quit");
            String type = s.nextLine();
            if ("qQ".contains(type)){
                break;
            }
            System.out.printf("Enter Movie title");
            String title = s.nextLine();
            Movie movie1 = Movie.getMovie(type , title);
            movie1.watchMovie();
        }
    }
}
