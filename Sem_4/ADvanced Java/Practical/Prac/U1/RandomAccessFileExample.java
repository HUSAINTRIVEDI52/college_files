import java.io.*;

public class RandomAccessFileExample {
    public static void main(String[] args) throws IOException {
        RandomAccessFile raf = new RandomAccessFile("test.dat", "rw");

        // Write to file
        raf.writeUTF("Hello, RandomAccessFile!");
        raf.writeInt(12345);
        raf.close();

        // Read from file
        raf = new RandomAccessFile("test.dat", "r");
        System.out.println("String: " + raf.readUTF());
        System.out.println("Integer: " + raf.readInt());
        raf.close();
    }
}
