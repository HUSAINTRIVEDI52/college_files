import java.io.*;

class demo2
{
	public static void main(String args[])
	{
	File f1=new File("E:\\SY\\Sem 4\\ADvanced Java\\Practical\\javademo");
	
	if(f1.isDirectory())
	{
		String str[]=f1.list();
		System.out.println("Yes Directory");
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
	System.out.println("Not");
	}
	}
	


}
