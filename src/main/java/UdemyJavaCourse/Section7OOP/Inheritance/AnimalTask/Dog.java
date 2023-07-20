package UdemyJavaCourse.Section7OOP.Inheritance.AnimalTask;

import UdemyJavaCourse.Section7OOP.Inheritance.AnimalTask.Animal;

public class Dog  extends Animal {
    private String earShape;
    private String tailShape;

    public Dog(){
        super("Matt" , "Big" , 50);
    }
    public Dog(String type , double weight){
        this(type , weight , "Perky" , "Curled");
    }
    public Dog(String type,  double weight, String earShape, String tailShape) {
        super(type, (weight < 15 ? "Small" : (weight < 35 ? "Medium" : "Large")) , weight);
        this.earShape = earShape;
        this.tailShape = tailShape;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "earShape='" + earShape + '\'' +
                ", tailShape='" + tailShape + '\'' +
                "} " + super.toString();
    }

    @Override
    public void move(String speed) {
        super.move(speed);
        if (speed == "slow"){
            walk();
            wagTail();
        }else {
            run();
            bark();
        }
        System.out.println();
    }

    @Override
    public void makeNoise() {
    bark();
        System.out.println();
    }
    private void bark(){
        System.out.println("WOOF! ");
    }
    private void run(){
        System.out.println("Dog running! ");
    }
    private void walk(){
        System.out.println("Dog walking ");
    }
    private void wagTail(){
        System.out.println("Tail Wagging");
    }

}
