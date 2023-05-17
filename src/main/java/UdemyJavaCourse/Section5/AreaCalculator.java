package UdemyJavaCourse.Section5;

public class AreaCalculator {
    public static double Area(double radius) {
        if (radius < 0) {
            return -1;
        }
        double AreaofCicle = radius * radius * Math.PI;
    return  AreaofCicle;
    }

    public static double Area(double x, double y) {
        if (x < 0 || y < 0) {
            return -1;
        }
        double AreaOfRectangle = x * y;
        return AreaOfRectangle;
    }

}
