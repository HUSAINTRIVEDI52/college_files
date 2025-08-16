import java.io.*;

public class bis {

    public static void main(String[] args) {
        try {
            BufferedInputStream bis = new BufferedInputStream(new FileInputStream("bis.txt"));
            int c;
            while ((c = bis.read()) != -1) {
                System.out.println(c);
            }
            bis.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}