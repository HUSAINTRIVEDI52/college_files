import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamExample {
    public static void main(String[] args) throws IOException {
        String data = "This is a test string.";
        byte[] byteArray = data.getBytes();

        FileOutputStream fos = new FileOutputStream("a1.dat");
        BufferedOutputStream bos = new BufferedOutputStream(fos);

        bos.write(byteArray);
        bos.close();
        fos.close();

        System.out.println("Data written to file successfully.");
    }
}
