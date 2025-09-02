package src.tests;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOS {
    public static void main(String[] args) {
        try(FileOutputStream fos = new FileOutputStream("src/tests/data.bin");
            DataOutputStream dos = new DataOutputStream(fos);
        ) {
            dos.writeDouble(3.14);
            dos.writeInt(42);
            dos.writeChar('H');
            dos.writeUTF("hELLOI");
            dos.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
