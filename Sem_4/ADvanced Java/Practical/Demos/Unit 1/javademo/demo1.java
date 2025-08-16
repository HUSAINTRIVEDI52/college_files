 import java.io.*;

class demo1
{
	public static void main(String args[])
	{
	File f1=new File("/home/vidhi/Desktop/java/my.txt");
	//File(String path)

	//File f1=new File("/home/vidhi/Desktop/","my.txt");
	//File(String path, String FileName)

	//File f1=new File("/home/vidhi/Desktop/");
	//File f2=new File(f1,"my.txt");
	//File(File object, String FileName)
	
	
	File f3=new File("/home/vidhi/Desktop/java/demo.txt");
	if (f1.exists())
	{
	System.out.println("File is available");
	System.out.println(f1.renameTo(f3));
	System.out.println(f1.length() + " length");
	System.out.println(f1.getName() + " is available");
	System.out.println(f1.getParent() + " parent");
	System.out.println(f1.getPath() + " path");
		System.out.println(f1.getAbsolutePath() + " Absulote path");
	
		if(f1.canRead())
		System.out.println("File is readable");
		else
		System.out.println("File is not readable");
		if(f1.canWrite())
		System.out.println("File is writable");
		else
		System.out.println("File is not writable");
	}
	else
	{
	System.out.println("File is not available");
	}
	
	}
	


}
