import java.io.*;

public class bos {
    public static void main(String[] args) {

        try {

            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("bos.txt"));
            for (int i = 0; i < 20; i++) {
                bos.write(i);
            }
            bos.write(10);
            String str = "Hello";
            int len = str.length();
            byte[] b = new byte[len];
            b = str.getBytes();
            bos.write(b);
            bos.close();

        } catch (IOException e) {
            System.out.println(e.getMessage());

        }

    }

}
