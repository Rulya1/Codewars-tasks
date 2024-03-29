package UdemyJavaCourse.Section7OOP;

public class Person {
    private String firstName;
    private String lastName;
    private int age =0;
    public Person(String firstName , String lastName , int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
    public Person(String firstName , String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public  boolean isTeen(){
        if (this.age > 12 && this.age < 20){
            return true;
        }
        else return false;
    }
    public  String getFullName(){
       if (this.firstName.isEmpty() && this.lastName.isEmpty()) {
           return "";
       }
        else if (this.lastName.isEmpty()){
           return this.firstName;
       }
        else if (this.firstName.isEmpty()){
           return this.lastName;
       }
        else {
           return this.firstName + " "+ this.lastName;
       }
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0 || age > 100){
           age = 0;
        }
        else
        this.age = age;
    }
}
