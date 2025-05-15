package OOP.StudentGradesTracker;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Student[] students = new Student[3];

        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < students.length; i++) {
            System.out.println("Enter the student " + (i+1) + ":");
            String name = scan.nextLine();

            System.out.println("Enter the student " + (i+1) + " grade:");
            double grade = scan.nextDouble();
            scan.nextLine();

            Student student = new Student(name, grade);

            students[i] = student;
        }

        for (Student student : students) {
            student.getDetails();
        }


    }
}
