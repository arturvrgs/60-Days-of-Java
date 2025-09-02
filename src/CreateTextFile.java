package src;

import java.io.FileOutputStream;
import java.io.IOException;

public class CreateTextFile {
    public static void main(String[] args) {

        String text = "Hello, World";

        try(FileOutputStream file = new FileOutputStream("src/tests/file.txt")) {
            file.write(text.getBytes());
            file.flush();

            System.out.println("File created");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
