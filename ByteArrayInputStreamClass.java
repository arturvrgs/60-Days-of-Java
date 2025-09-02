import java.io.ByteArrayInputStream;

public class ByteArrayInputStreamClass {
    public static void main(String[] args) {

        byte[] data = {72, 101, 108, 108, 111};

        try {
            ByteArrayInputStream inputStream = new ByteArrayInputStream(data);
            int byteData;

            while ((byteData = inputStream.read()) != -1) {
                System.out.print((char)byteData);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
