import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class BufferedInputStreamReadExample {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("a1.dat");
        BufferedInputStream bis = new BufferedInputStream(fis);

        int data;
        System.out.println("Reading data from file:");
        while ((data = bis.read()) != -1) {
            System.out.print((char) data);
        }

        bis.close();
        fis.close();
    }
}
