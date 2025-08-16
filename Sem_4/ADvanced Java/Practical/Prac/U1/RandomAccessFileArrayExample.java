import java.io.*;

public class RandomAccessFileArrayExample {
    public static void main(String[] args) throws IOException {
        RandomAccessFile raf = new RandomAccessFile("array.dat", "rw");

        // Write array to file
        int[] array = {10, 20, 30, 40, 50, 60, 70};
        for (int value : array) {
            raf.writeInt(value);
        }

        // Read only odd-indexed values
        raf.seek(0); // Go to the start of the file
        System.out.println("Odd-indexed values:");
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 1) {
                raf.seek(i * 4); // Move to the position of the odd index
                System.out.println(raf.readInt());
            }
        }

        raf.close();
    }
}
