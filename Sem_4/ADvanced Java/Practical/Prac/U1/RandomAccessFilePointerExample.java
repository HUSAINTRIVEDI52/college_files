import java.io.*;

public class RandomAccessFilePointerExample {
    public static void main(String[] args) throws IOException {
        RandomAccessFile raf = new RandomAccessFile("test.dat", "rw");

        // Write to file
        raf.writeInt(100);
        long pointer = raf.getFilePointer(); // Save current pointer position
        raf.writeDouble(99.99);
        raf.writeChar('A');

        // Move pointer back and read the double value
        raf.seek(pointer);
        System.out.println("Double: " + raf.readDouble());

        raf.close();
    }
}
