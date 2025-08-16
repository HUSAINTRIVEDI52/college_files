import java.io.*;

public class dataio {
    public static void main(String[] args) {
        try {
            DataOutputStream out = new DataOutputStream(new FileOutputStream("dataio.txt"));
            out.writeInt(123);
            out.writeFloat(123.2f);
            out.writeUTF("Hello World");
            System.out.println("Data written successfully");
            out.close();

        } catch (IOException e) {

            System.out.println(e.getMessage());
        }
        try {
            DataInputStream in = new DataInputStream(new FileInputStream("dataio.txt"));
            int intt = in.readInt();
            float floatt = in.readFloat();
            String Stringss = in.readUTF();
            System.out.println("Integer:" + intt + "\nFloat Value:" + floatt + "\nString:" + Stringss);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
