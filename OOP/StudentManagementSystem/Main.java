package OOP.StudentManagementSystem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("How many students you want to enter?");
        int studentCount = scan.nextInt();

        Student[] students = new Student[studentCount];

        for(int i = 0; i < studentCount; i++) {
            scan.nextLine();

            System.out.println("Enter the " + (i+1) + "º student name: ");
            String name = scan.nextLine();

            System.out.println("Enter the " + (i+1) + "º student age: ");
            int age = scan.nextInt();

            System.out.println("Enter the " + (i+1) + "º student height: ");
            double height = scan.nextDouble();

            students[i] = new Student(name, (i+1), age, height);
            System.out.println("Student added!");
        }

        StudentStatistics.showStatistics(students);
    }
}


