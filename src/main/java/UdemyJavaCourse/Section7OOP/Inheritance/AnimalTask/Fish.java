package UdemyJavaCourse.Section7OOP.Inheritance.AnimalTask;

import UdemyJavaCourse.Section7OOP.Inheritance.AnimalTask.Animal;

public class Fish extends Animal {
    private  int gills;
    private  int fins;

    public Fish(String type,  double weight, int gills, int fins) {
        super(type, "small", weight);
        this.gills = gills;
        this.fins = fins;
    }
    private void moveMuscles(){
        System.out.println("Muscles moving");
    }
    private void moveBackfin(){
        System.out.println("Backfin moving");
    }

    @Override
    public void move(String speed) {
        super.move(speed);
        moveMuscles();
        if (speed == "fast"){
            moveBackfin();
        }
        System.out.println();
    }

    @Override
    public String toString() {
        return "Fish{" +
                "gills=" + gills +
                ", fins=" + fins +
                "} " + super.toString();
    }
}
