package OOP.StudentManagementSystem;

public class StudentStatistics {
    public static void showStatistics(Student[] students) {
        //get average age
        double averageAge = 0;

        for(Student student : students) {
            averageAge += student.age;
        }

        averageAge /= students.length;

        System.out.println("Average age: " + averageAge);

        //get average height

        double averageHeight = 0;

        for(Student student : students) {
            averageHeight += student.height;
        }

        averageHeight /= students.length;

        System.out.println("Average height: " + averageHeight);

        //get the oldest student

        Student oldestStudent = students[0];

        for(Student student : students) {
            if (oldestStudent.age < student.age) {
                oldestStudent = student;
            }
        }

        System.out.println("Oldest student: " + oldestStudent.name);

        //get the tallest student

        Student tallestStudent = students[0];

        for (Student student : students) {
            if (tallestStudent.height < student.height) {
                tallestStudent = student;
            }
        }
        System.out.println("Tallest student: " + oldestStudent.name);

    }
}
