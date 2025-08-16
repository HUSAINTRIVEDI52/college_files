import java.io.*;


public class BufInpu {
    public static void main(String[] args) {
        try{
                BufferedInputStream bis=new BufferedInputStream(new FileInputStream("ab.dat"));

                int c;
                while((c=bis.read())!=-1){
                    System.out.println(c);
                }
                bis.close();
        }catch(IOException e){
                    System.err.println("Eror");
        }
    }
}
