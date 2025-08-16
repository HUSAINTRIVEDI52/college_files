import java.io.*;

public class dataio2 {
    public static void main(String[] args){
        File f1 = new File("DATAIO.TXT");
        int size = (int) f1.length();
        
        byte b[] =new byte[size];
        byte bt[] = new byte[size];
        
        try{
            DataInputStream dis = new DataInputStream(new FileInputStream(f1));
            dis.readFully(b);

            for (int i = 0; i < size; i++) 
                System.out.println((char) b[i]);
                 dis.close();
                System.out.println("---------------------------------------------------------------");
                System.out.println("The length of the file is "+size);
                dis=new DataInputStream(new FileInputStream(f1));
                dis.readFully(bt,3,20);

                for(int i=0;i<bt.length;i++){
                    System.out.println((char)bt[i]);
                    dis.close();
                }

                  
                 
            }catch(IOException e){
                System.out.println(e.getMessage());
             }
        }
    }

