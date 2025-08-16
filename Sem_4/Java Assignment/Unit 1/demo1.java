// 1) Make File class object and check File Name, length, Path, Readble, hidden, available,delete methods. Pass file name using command line arguments.

import java.io.*;
public class demo1
{
public static void main(String args[])
{
String filename = args[0];
File f1 = new File(filename);
if(f1.exists())
{
System.out.println("File name is:"+f1.getName());
System.out.println("Length of file:"+f1.length());
System.out.println("File Path:"+f1.getPath());
System.out.println("File is Hidden:"+f1.isHidden());
System.out.println("File is available:");
//System.out.println("File is deleted:"+f1.delete());
}
else
{
System.out.println("File doesn't exist");
}
if(f1.canRead())
{
System.out.println("File is readable");
}
}
}