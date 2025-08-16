import java.io.*;

public class CopyFile {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("a1.dat");
        FileOutputStream fos = new FileOutputStream("ab.dat");

        int content;
        while ((content = fis.read()) != -1) {
            fos.write(content);
        }

        fis.close();
        fos.close();
        System.out.println("File copied successfully.");
    }
}
