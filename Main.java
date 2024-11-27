import People.People;
import Student.Student;
import Course.Course;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner input = new Scanner(System.in);

        // Get student details
        System.out.print("Enter student's name: ");
        String name = input.nextLine();

        System.out.print("Enter student ID: ");
        double id = input.nextDouble();

        System.out.print("Enter phone number: ");
        double phone = input.nextDouble();
        input.nextLine(); // Consume leftover newline

        System.out.print("Enter email: ");
        String email = input.nextLine();

        System.out.print("Enter address: ");
        String address = input.nextLine();

        System.out.print("Enter major: ");
        String major = input.nextLine();

        System.out.print("Enter tuition per semester: ");
        double tuition = input.nextDouble();
        input.nextLine(); // Consume leftover newline

        // Get admitted date
        System.out.print("Enter admitted date (MM/dd/yyyy): ");
        String admittedDateString = input.nextLine();
        Date admittedDate = new SimpleDateFormat("MM/dd/yyyy").parse(admittedDateString);

        // Get courses
        System.out.print("Enter the number of courses: ");
        int numberOfCourses = input.nextInt();
        input.nextLine(); // Consume leftover newline

        Course[] courses = new Course[numberOfCourses];
        for (int i = 0; i < numberOfCourses; i++) {
            System.out.println("Enter details for course " + (i + 1) + ":");

            System.out.print("  Course number: ");
            double courseNumber = input.nextDouble();

            System.out.print("  Credits: ");
            double credits = input.nextDouble();

            System.out.print("  Price: ");
            double price = input.nextDouble();
            input.nextLine(); // Consume leftover newline

            // Create the course and add to array
            courses[i] = new Course(courseNumber, credits, price);
        }

        // Create the Student object
        Student student = new Student(name, id, phone, email, address, major, tuition, courses, admittedDate);

        // Display the student information
        student.display();
    }
}
