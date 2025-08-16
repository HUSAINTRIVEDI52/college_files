import java.io.ByteArrayInputStream;
import java.io.IOException;

public class ByteArrayInputStreamExample {
    public static void main(String[] args) throws IOException {
        byte[] byteArray = {65, 66, 67, 68, 69}; // ASCII for A, B, C, D, E

        ByteArrayInputStream bais = new ByteArrayInputStream(byteArray);

        int data;
        System.out.println("Reading from ByteArrayInputStream:");
        while ((data = bais.read()) != -1) {
            System.out.print((char) data + " ");
        }
        bais.close();
    }
}
