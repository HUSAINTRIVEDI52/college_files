/* THIS PROGRAMME SHOWS THE DEMO OF FILE CLASS. 
IT SHOWS THE USE OF FILE CLASS and its METHODS */

import java.io.*;



public class FileDemo
{
   public static void main(String[] args)
   {
      File myFile = new File("/home/vidhi/Desktop/my.txt");

      if(myFile.exists())
      {
         System.out.println(myFile.getName()+ " exists");

	 System.out.println("File Path =" + myFile.getPath());

	 System.out.println("Parent =" + myFile.getParent());
        
	 System.out.println("absolute Parent =" + myFile.getAbsolutePath());
	
	 System.out.println("The file is " + myFile.length() + " bytes long");
         
	if(myFile.canRead())
            System.out.println("Readable");
         else
            System.out.println("Non Readable");

         if(myFile.canWrite())
            System.out.println("Writeable");
         else
            System.out.println("Non Writeable");
      }
      else
         System.out.println("File does not exist");
   }
}























