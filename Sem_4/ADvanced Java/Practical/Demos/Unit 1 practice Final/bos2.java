import java.io.*;

public class bos2 {
    public static void main(String[] args) {
        try {
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("bos2.txt"));
            for (int i = 0; i < 20; i++) {
                bos.write(i);
            }
            String st = "String";
            int str = st.length();
            byte[] b = new byte[str];
            b = st.getBytes();
            bos.write(b);
            bos.close();
            System.out.println("File written successfully");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
