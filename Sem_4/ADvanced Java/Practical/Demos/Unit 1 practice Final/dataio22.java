import java.io.*;

public class dataio22 {
    public static void main(String[] args) {

        File f1 = new File("DATAIO.TXT");
        int size = (int) f1.length();
        byte b[] = new byte[size];
        try {

            DataInputStream dis = new DataInputStream(new FileInputStream(f1));
            dis.readFully(b);
            System.out.println("The length of the file is " + size);
            for (int i = 0; i < size; i++) {
                System.out.println((char) b[i]);
            }
            dis.close();

            System.out.println("-----------------------------------------------------------");
            byte bt[] = new byte[size];
            DataInputStream diss = new DataInputStream(new FileInputStream(f1));
            diss.readFully(bt, 2, 20);

            for (int i = 0; i < bt.length; i++) {
                System.out.println((char) bt[i]);
            }
            diss.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
