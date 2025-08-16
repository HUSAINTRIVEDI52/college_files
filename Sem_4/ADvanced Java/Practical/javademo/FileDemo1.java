

import java.io.*;
public class FileDemo1
{
   public static void main(String[] args)
   {
      File myFile = new File("/home/vidhi/Desktop/TY/");

      if(myFile.isDirectory())
      {
         	String str[]=myFile.list();
		for(int i=0;i<str.length;i++)
		{
		System.out.println(str[i]);		
		}
		for(String s:str)
		{
			System.out.println(s);		
		}
	}
}
}
























