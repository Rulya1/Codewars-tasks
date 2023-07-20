package UdemyJavaCourse.Section7OOP.PoolArea;

public class Rectangle {
    private double width;
    private double length;

    public Rectangle(double width, double lenght) {
        this.width = width < 0 ? 0 : width;
        this.length = lenght < 0 ? 0 : lenght;
    }
    public double getWidth(){
        return  width;
    }
    public double getLenght(){
        return  length;
    }
    public double getArea(){
        return  width * length;
    }

    public static void main(String[] args) {

    }
}
