import java.io.*;

public class ConvertToUpperCase {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("a2.dat");
        for (int i = 97; i <= 122; i++) {
            fos.write(i);
        }
        fos.close();

        FileInputStream fis = new FileInputStream("a2.dat");
        FileOutputStream fos2 = new FileOutputStream("a3.dat");

        int ch;
        while ((ch = fis.read()) != -1) {
            fos2.write(Character.toUpperCase(ch));
        }

        fis.close();
        fos2.close();
    }
}
