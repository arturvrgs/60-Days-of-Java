package src;

import java.io.Serializable;

public class Student implements Serializable {
    private static final long serialUID = 1;
    private String name;

    public Student(String name) {
        this.name = name;
    }
}
