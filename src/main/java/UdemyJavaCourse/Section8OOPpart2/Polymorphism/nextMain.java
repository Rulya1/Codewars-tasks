package UdemyJavaCourse.Section8OOPpart2.Polymorphism;

public class nextMain {
    public static void main(String[] args) {
//        Car1 car = new Car1("2022 Ferrari GTS");
//        runRace(car);
//        Car1 car1 = new GasPoweredCar1("tesla" , 15.5 ,6);
//        runRace(car1);
        Car astra = new Car(4,"HUY");
        System.out.println(astra.accelerate());
        System.out.println(astra.stardEngine());
        System.out.println(astra.brake());
        System.out.println("__________");
        astra.getFullInfo();
        System.out.println("_________________");

        Car1 tesla = new ElectricCar1("Tesla 389" , 568,75);
        runRace(tesla);
    }
    public static void runRace(Car1 car1){
        car1.startEngine();
        car1.drive();
    }
}
