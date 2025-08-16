import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class BufferedInputStreamReadFullyExample{
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("output.txt");
        BufferedInputStream bis = new BufferedInputStream(fis);

        byte[] buffer = new byte[fis.available()];
        bis.read(buffer);

        System.out.println("Reading data from file using readFully:");
        System.out.println(new String(buffer));

        bis.close();
        fis.close();
    }
}
