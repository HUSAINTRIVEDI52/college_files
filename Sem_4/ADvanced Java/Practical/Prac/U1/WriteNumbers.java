import java.io.*;

public class WriteNumbers {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("a1.dat");
        for (int i = 1; i <= 20; i++) {
            fos.write(i);
        }
        fos.close();

        FileInputStream fis = new FileInputStream("a1.dat");
        int number;
        while ((number = fis.read()) != -1) {
            System.out.println(number);
        }
        fis.close();
    }
}
