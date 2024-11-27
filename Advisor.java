package Advisor;
import java.util.Date;
import Student.Student;
public class Advisor extends People.People {
    private String Title;
    private double Salary;
    private Date hireDate;
    private Student[] advisees;

    // Default constructor
    public Advisor() {
    }

    public Advisor(String name, double id, double phone, String email, String address, String title, double salary, Date hireDate, Student[] advisees){

        super(name, id, phone, email, address);
        this.Title = title;
        this.Salary = salary;
        this.hireDate = hireDate;
        this.advisees = advisees;

    }

    public void setTitle(String title) {
        Title = title;
    }

    public void setSalary(double salary) {
        Salary = salary;
    }

    public String getTitle() {
        return Title;
    }

    public double getSalary() {
        return Salary;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    public Date getHireDate() {
        return hireDate;
    }
    public void setAdvisees(Student [] advisees){
        this.advisees = advisees;
    }
    public Student[] getAdvisees(){
        return advisees;
    }

    public void display() {
        System.out.println("Title:" + getTitle());
        System.out.println("Salary :" + getSalary());
        System.out.println("Hired date :" +getHireDate());
        System.out.println("Advisees :" +getAdvisees());
    }
}
