package UdemyJavaCourse.Section8OOPpart2.Polymorphism;

public class Car1 {
    private String description;

    public Car1(String description) {
        this.description = description;
    }

    public void startEngine() {
        System.out.println("Engine started");
    }

    public void drive() {
        System.out.println("Car is driving, type is " + getClass().getSimpleName());
        runEngine();
    }

    protected void runEngine() {
        System.out.println("Engine is Running");
    }

}

class GasPoweredCar1 extends Car1 {
    private double avgKmPerLitre;
    private int cylinders;

    public GasPoweredCar1(String description) {
        super(description);
    }

    public GasPoweredCar1(String description, double avgKmPerLitre, int cylinders) {
        super(description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.cylinders = cylinders;
    }

    @Override
    protected void runEngine() {
        System.out.printf("Gas -> usage exceed the average : %.2f %n" , avgKmPerLitre);
    }

    @Override
    public void startEngine() {
        System.out.printf("Gas -> All %d cylinders are fired up , Ready!%n" , cylinders);
    }
}

class ElectricCar1 extends Car1 {
    private double avgKmPerCharge;
    private int batterySize;

    public ElectricCar1(String description) {
        super(description);
    }

    public ElectricCar1(String description, double avgKmPerCharge, int batterySize) {
        super(description);
        this.avgKmPerCharge = avgKmPerCharge;
        this.batterySize = batterySize;
    }

    @Override
    protected void runEngine() {
        System.out.printf("BEV -> usage under the average: %2f %n" , avgKmPerCharge);
    }

    @Override
    public void startEngine() {
        System.out.printf("BEV -> switch %d khw battery on , Ready!%n", batterySize);
    }
}

class HybridCar1 extends Car1 {
    private double avgKmPerLitre;
    private int cylinders;
    private int batterySize;

    public HybridCar1(String description) {
        super(description);
    }

    public HybridCar1(String description, double avgKmPerLitre, int cylinders , int batterySize) {
        super(description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.cylinders = cylinders;
        this.batterySize = batterySize;
    }

    @Override
    protected void runEngine() {
        System.out.printf("Hybrid -> usage below average : %.2f % n" , avgKmPerLitre);
    }

    @Override
    public void startEngine() {
        System.out.printf("Hybrid -> %d cylinders are fired up.%n" , cylinders);
        System.out.printf("Hybrid -> switch %d khW battery on , Ready!%n" , batterySize);
    }
}



