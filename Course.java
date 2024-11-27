package Course;
public class Course {
    private double courseNumber;
    private double Credits;
    private double Price;

    // Default constructor
    public Course(double courseNumber, double credits, double price){
        this.courseNumber = courseNumber;
        this.Credits = credits;
        this.Price = price;
    }

    public void setCourseNumber(double courseNumber) {
        this.courseNumber = courseNumber;
    }

    public void setCredits(double credits) {
        this.Credits = credits;
    }

    public void setPrice(double price) {
        this.Price = price;
    }

    public double getPrice() {
        return Price;
    }

    public double getCredits() {
        return Credits;
    }

    public double getCourseNumber() {
        return courseNumber;
    }
    @Override
    public String toString() {
        return "Course Number: " + courseNumber + ", Credits: " + Credits + ", Price: $" + Price;
    }
}
