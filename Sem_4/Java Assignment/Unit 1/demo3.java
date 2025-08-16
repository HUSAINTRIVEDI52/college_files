// Write a Java program to that will read a data from one file and write it to other file using File Handling Concepts.
import java.io.*;
public class demo3
{
public static void main(String args[])
{
try
{
File f1 = new File("my.dat");
FileInputStream fis = new FileInputStream(f1);
FileOutputStream fos = new FileOutputStream("my1.dat");
int c;
while((c=fis.read())!=-1)
{
fos.write(c);
System.out.println((char)c);
}
fos.flush();
}
catch(IOException e)
{
System.out.println("Error");
}
}
}
