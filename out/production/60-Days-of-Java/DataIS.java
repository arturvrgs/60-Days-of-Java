package src.tests;

import java.io.*;

public class DataIS {
    public static void main(String[] args) {

        InputStream fileStream = DataIS.class.getClassLoader().getResourceAsStream("data.txt");

        if(fileStream == null) {
            System.out.println("File doesn't exists");
            return;
        }

        try(BufferedInputStream bis = new BufferedInputStream(fileStream)) {

            int data;

            while((data = fileStream.read()) != -1) {
                System.out.print((char)data);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
