package UdemyJavaCourse.Section7OOP.Inheritance.InharitanceChallenge;

public class HourlyEmpoyee  extends  Employee{
    private double hourlyPayRate;

    public HourlyEmpoyee(String name, String birthDate, String hireDate, double hourlyPayRate) {
        super(name, birthDate, hireDate);
        this.hourlyPayRate = hourlyPayRate;
    }

    @Override
    public  double collectPay(){
        return 40 * hourlyPayRate;
    }
    public double getDoublePay(){
         return 2 * collectPay();
    }
}
