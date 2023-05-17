package UdemyJavaCourse.Section5;

public class OverloadedMethodChallenge {
    public static void main(String[] args) {
        System.out.println("5ft , 8in = " + convertToCentimeters(5 , 8) + "cm");
        System.out.println("68in = " + convertToCentimeters(68) + "cm" );
    }
    public static double convertToCentimeters(int heightInInches){
        double Suntimeter =(double) heightInInches * 2.54;
        return Suntimeter;
    }
    public static double convertToCentimeters(int heightInFeet , int heightInInches){
        int sumOof2intToInches = heightInInches + (heightInFeet * 12);
        return  convertToCentimeters(sumOof2intToInches);
    }

}
