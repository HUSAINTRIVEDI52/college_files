import java.io.*;

public class demo2 {
    public static void main(String[] args) {
        File ff = new File("E:/");
        if (ff.isDirectory()) {
            System.out.println("File is Directory");
            String str[] = ff.list();
            for (int i = 0; i < str.length; i++) {
                System.out.println(str[i]);
            }
            // for (String s : str) {
            // System.out.println(s);
            // }
        } else {
            System.out.println("It is not a directory");
        }

    }
}
