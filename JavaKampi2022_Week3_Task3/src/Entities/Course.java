package Entities;

public class Course {
    private String courseName;
    private double price;

    public Course(String name, double price) {
        this.courseName = name;
        this.price = price;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
