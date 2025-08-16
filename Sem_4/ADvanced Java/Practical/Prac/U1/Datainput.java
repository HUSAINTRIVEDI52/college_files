import java.io.*;

public class Datainput {
    public static void main(String[] args) {
        File f1=new File("a1.dat");
        int size=(int)f1.length();

        byte b[] =new byte[size];
        byte bt[]=new byte[size];

        try{
            DataInputStream dins=new DataInputStream(new FileInputStream(f1));

            dins.readFully(b);

            for(int i=0;i<size;i++){
                System.out.println((char)b[i]);
            }
            dins.close();

            System.out.println("--------------------------------------");
            System.out.println("File Length:"+size);
dins=new DataInputStream(new FileInputStream(f1));
dins.readFully(bt,0,11);

for(int i=0;i<bt.length;i++){
    System.out.println((char)bt[i]);
}
dins.close();
            

        }catch(FileNotFoundException e){
            System.out.println("File not found");
        }
        
        catch(IOException e){
            System.out.println("Error");
        }
    }
}
