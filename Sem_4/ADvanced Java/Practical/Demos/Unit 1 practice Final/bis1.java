import java.io.*;

public class bis1 {
    public static void main(String[] args) {
        try {

            BufferedInputStream bis = new BufferedInputStream(new FileInputStream("bis.txt"));
            int c;
            while ((c = bis.read()) != -1) {
                System.out.println(c);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
