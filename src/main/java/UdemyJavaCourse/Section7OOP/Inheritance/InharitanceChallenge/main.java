package UdemyJavaCourse.Section7OOP.Inheritance.InharitanceChallenge;

public class main {
    public static void main(String[] args) {
        Worker max = new Worker("Max", "20_02_1998");
        System.out.println(max.getAge());
        System.out.println("Age =" + max.getAge());
        System.out.println("Pay =" + max.collectPay());
        SalariedEmpoyee tim = new SalariedEmpoyee("Tim", "01.02.1995", "01,01,2023", 3500);
        System.out.println(tim);
        System.out.println("Tim`s Paycheck per work day = $" + tim.collectPay());
        tim.retire();
        System.out.println("Joes Pension = $" + tim.collectPay());
        HourlyEmpoyee Mary = new HourlyEmpoyee("Mary" , "05/05/1996" , "01/01/2021" ,
                15);
        System.out.println(Mary);
        System.out.println("Mary`s paycheck = $" + Mary.collectPay());
        System.out.println("Mary`s Holliday paycheck =$" + Mary.getDoublePay());

    }
}
