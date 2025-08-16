import java.io.RandomAccessFile;
import java.io.*;

public class Demo1 {
    public static void main(String[] args) throws IOException {
        RandomAccessFile ref = new RandomAccessFile("abc.dat", "rw");
        int x[] = { 11, 22, 55, 44, 77, 88, 99 };
        for (int i = 0; i < x.length; i++) {
            ref.write(x[i]);
        }

        ref.write(11);
        ref.writeInt(11);
        long dp = ref.getFilePointer();
        ref.writeDouble(11.45);
        ref.writeDouble(11.58);
        ref.writeChar('A');
        ref.writeChar('B');
        ref.seek(0);
        System.out.println("Int no is " + ref.readInt());
        ref.seek(ref.getFilePointer() + 4);

        System.out.println("Int no is " + ref.readInt());
        ref.seek(ref.getFilePointer() + 4);

        System.out.println("Int no is " + ref.readInt());

        ref.seek(dp);

        System.out.println("Double number is " + ref.readDouble());
        ref.seek(ref.getFilePointer() + 8); 
        System.out.println("Char is " + ref.readChar());
        ref.close();

    }
}
