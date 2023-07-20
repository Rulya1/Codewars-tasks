package UdemyJavaCourse.Section7OOP.Inheritance;

public class Main {
    public static void main(String[] args) {
        FootballTeams teams = new FootballTeams("Country", "Players", "Coach");
        teams.training();
        System.out.println(teams);
        BarcelonaTeam team = new BarcelonaTeam("Spain" , "All players" ,"XAVI" , "Now Camp"
                , "Barcelona");
        System.out.println(team);
        team.training();





        /*Animal animal = new Animal("Labrador" ,"Huge" , 30.5 );
        doAnimalStuff(animal , "slow");
        Dog dog = new Dog();
        doAnimalStuff(dog , "fast");
        Dog yorkie = new Dog("Yorkiy", 15 );
        doAnimalStuff(yorkie,"fast");
        Dog retriever = new Dog("Labrador Retriver" , 60 ,"Floppy" ,"Swimmer");
        doAnimalStuff(retriever , "slow");
        Fish goldie = new Fish("Goldfish" , 0.25 , 2 ,3);
        doAnimalStuff(goldie, "fast");

    }
    public static  void doAnimalStuff(Animal animal , String speed){
        //cant realy figure our how parametrs Animal animal works
        animal.makeNoise();
        animal.move(speed);
        System.out.println(animal);
        System.out.println("_____________");
    }*/
    }
}
