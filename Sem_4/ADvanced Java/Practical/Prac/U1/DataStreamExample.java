import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataStreamExample {
    public static void main(String[] args) throws IOException {
        // Writing data
        FileOutputStream fos = new FileOutputStream("data.dat");
        DataOutputStream dos = new DataOutputStream(fos);

        dos.writeInt(123);
        dos.writeDouble(456.78);
        dos.writeUTF("Hello World");
        dos.close();
        fos.close();

        // Reading data
        FileInputStream fis = new FileInputStream("data.dat");
        DataInputStream dis = new DataInputStream(fis);

        int intValue = dis.readInt();
        double doubleValue = dis.readDouble();
        String utfString = dis.readUTF();

        dis.close();
        fis.close();

        System.out.println("Read Integer: " + intValue);
        System.out.println("Read Double: " + doubleValue);
        System.out.println("Read String: " + utfString);
    }
}
