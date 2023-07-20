package UdemyJavaCourse.Section7OOP.Inheritance.CylinderTask;

public class Circle {
    private double radius;
    public Circle(double radius) {
        this.radius = radius < 0 ? 0 : radius;
    }
    public double getRadius(){
        return radius;
    }
    public double getArea(){
        return radius * radius * Math.PI;
    }

}
