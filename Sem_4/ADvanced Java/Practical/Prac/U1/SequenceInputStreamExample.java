import java.io.*;

public class SequenceInputStreamExample {
    public static void main(String[] args) throws IOException {
        FileInputStream fis1 = new FileInputStream("file1.txt");
        FileInputStream fis2 = new FileInputStream("file2.txt");

        SequenceInputStream sis = new SequenceInputStream(fis1, fis2);

        int data;
        System.out.println("Reading data from both files:");
        while ((data = sis.read()) != -1) {
            System.out.print((char) data);
        }

        sis.close();
        fis1.close();
        fis2.close();
    }
}
