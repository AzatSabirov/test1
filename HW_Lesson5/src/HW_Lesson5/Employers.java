package HW_Lesson5;

public class Employers {

    protected String name;
    protected String position;
    protected String email;
    protected String mobileNumber;
    protected int salary;
    protected int age;



    public Employers(String name, String position, String email, String mobileNumber, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.mobileNumber = mobileNumber;
        this.salary = salary;
        this.age = age;



    }

    public int getAge() {
        return age;
    }
    void printEmployers40(){
        System.out.println(name + "");
    }

    public void printInfo() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Employers{" +
                "name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", email='" + email + '\'' +
                ", mobileNumber='" + mobileNumber + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }



}

