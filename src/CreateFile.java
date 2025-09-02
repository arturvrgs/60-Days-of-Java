package src;

import java.io.*;

public class CreateFile {
    public static void main(String[] args) {

        File file = new File("src/tests/createdFile.txt");
        File dir = new File("src/tests/dir1");

        if(!dir.exists()) {
                if(dir.mkdir()) {
                    System.out.println("Dir created");
                }
        }

        if(!file.exists()) {
            try {
                if(file.createNewFile()) {
                    System.out.println("File created");

                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        Student s = new Student("Artur");

        try(FileOutputStream fos = new FileOutputStream(dir+"/student.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
        ) {
            oos.writeObject(s);
        } catch (RuntimeException | IOException e) {
            throw new RuntimeException(e);
        }

    }
}
