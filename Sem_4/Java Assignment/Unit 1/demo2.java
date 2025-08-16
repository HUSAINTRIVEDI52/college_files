// Make File class object to store one directory name and list all the file names on the terminal using for each loop.
import java.io.*;
public class demo2
{
public static void main(String args[])
{
File f1 = new File("C:/Users/ASUS/OneDrive/Desktop/AdvJAVA");
if(f1.isDirectory())
{
System.out.println("File is Directory");
String str[]=f1.list();
for(int i=0;i<str.length;i++)
{
System.out.println(str[i]);
}
for(String s:str)
{
System.out.println(s);
}
}
else
{
System.out.println("Not Directory");
}
}
}