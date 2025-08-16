import java.io.*;

public class demo1 {

    public static void main(String[] args) {
        
        File ff=new File("E://demo1.txt/");
        File fff = new File("E:/demo2.txt/");
        if (ff.exists()) {
            System.out.println("The length of the file is " + ff.length());
            System.out.println("The FIle is available " + ff.getName());
            System.out.println(ff.renameTo(fff) + "File renamed");
            System.out.println(ff.getPath() + " Path");
            System.out.println("THe abso;ute path is " + ff.getAbsolutePath());

            if (ff.canRead()) {
                System.out.println("File can read");
            } else {
                System.out.println("File cannot read");
            }
            if (ff.canWrite()) {
                System.out.println("File Can write");
            } else {
                System.out.println("File cannot write");
            }

        }
        else {
            System.out.println("File is not available");
        }

        
    }

}
