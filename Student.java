package Student;

import Course.Course;
import java.util.Arrays;
import java.util.Date;

public class Student extends People.People {
    private String Major;
    private double Tuition;
    private Course[] courses;
    private Date admittedData;

    public Student(String name, double id, double phone, String email, String address, String major, double tuition, Course[] courses, Date admittedData) {
        super(name, id, phone, email, address);
        this.Major = major;
        this.Tuition = tuition;
        this.courses = courses;
        this.admittedData = admittedData;
    }

    public void setMajor(String major) {
        Major = major;
    }

    public void setTuition(double tuition) {
        Tuition = tuition;
    }

    public double getTuition() {
        return Tuition;
    }

    public String getMajor() {
        return Major;
    }

    public void setAdmittedData(Date admittedData) {
        this.admittedData = admittedData;
    }

    public Date getAdmittedData() {
        return admittedData;
    }

    public Course[] getCourses() {
        return courses;
    }

    public void setCourses(Course[] courses) {
        this.courses = courses;
    }

    public double calculateTotalTuition() {
        return Tuition;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Major: " + getMajor());
        System.out.println("Tuition per Semester: $" + getTuition());
        System.out.println("Courses: " + Arrays.toString(getCourses())); // Properly displaying courses
        System.out.println("Total Tuition: $" + calculateTotalTuition());
    }
}
