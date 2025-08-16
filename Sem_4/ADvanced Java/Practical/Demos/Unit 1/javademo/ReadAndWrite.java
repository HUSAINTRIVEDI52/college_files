/* THIS PROGRAMME TAKE INPUT FROM KEYBOARD AND 
GIVE OUTPUT ON MONITOR. IT SHOW THE USE OF INPUTSTREAM AND OUTPUTSTREAM CLASS
*/

import java.io.*;
public class ReadAndWrite
{
   public static void main(String[] args) 
   {
      InputStream istream=System.in;
      OutputStream ostream = System.out;
      int c;
      
      System.out.println("Type some characters ");
      try
      {
         while( (c= istream.read()) != -1)
            ostream.write(c);
      }
      catch(IOException e)
      {
         System.out.println("Error: " + e.getMessage());
      }
      finally
      {
         try
         {
            istream.close();
            ostream.close();
         }
         catch (IOException e)
         {
            System.out.println("File did not close");
         }
      }
   }
}
