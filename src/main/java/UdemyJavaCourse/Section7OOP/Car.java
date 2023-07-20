package UdemyJavaCourse.Section7OOP;

public class Car {
    private String desighBy = "Tesla";
    private String model = "Model X";
    private String color = "White";
    private int doors = 2;
    private boolean convertible = true;

    public String getDesighBy() {
        return desighBy;
    }

    public String getColor() {
        return color;
    }

    public int getDoors() {
        return doors;
    }

    public boolean isConvertible() {
        return convertible;
    }

    public String getModel() {
        return model;
    }

    public void describeCar() {
        System.out.println(doors + "-Door " +
                model + " " +
                color + " " +
                desighBy + " " +
                (convertible ? "Convertible" : " "));
    }
}

