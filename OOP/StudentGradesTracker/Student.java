package OOP.StudentGradesTracker;

public class Student {
    private String name;
    private double grade;

    public Student(String name, double grade) {
        this.name = name;
        this.grade = grade;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public double getGrade() {
        return grade;
    }

    public void getDetails() {
        System.out.println("-------------------");
        System.out.println("Name: " + name);
        System.out.println("Grade: " + grade);
    }
}
