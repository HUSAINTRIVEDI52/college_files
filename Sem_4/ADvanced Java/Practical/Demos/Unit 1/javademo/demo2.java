import java.io.*;

class demo2
{
	public static void main(String args[])
	{
	File f1=new File("/home/vidhi/Desktop/TY");
	
	if(f1.isDirectory())
	{
	System.out.println("Yes Directory");
	String str[]=f1.list();
	for(int i=0;i<str.length;i++)
	{
		System.out.println(str[i]);
	
	}
	for(String s:str)
	{
			System.out.println(s);
	}
	else
	{
	System.out.println("Not");
	}
	}
	


}
