import java.io.*;

class bufinput{
public static void main(String[] args) {
    

    try{
    BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("ab.dat"));
    for(int i=0;i<=11;i++){
        bos.write(i);
    }

    String str="Hello";
    int len=str.length();
    byte b[]=new byte[len];
    b=str.getBytes();
    bos.write(b);
    bos.close();

}
catch(IOException e){
    System.out.println("Error: ");

}

}}