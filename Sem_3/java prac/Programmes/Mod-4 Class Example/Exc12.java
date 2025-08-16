//user defined exception

class MyException extends Exception 
{
   String s1;
   MyException(String s2) 
	{
		s1 = s2; //calling toString
	} 

   public String toString() 
	{	 
		return ("Output String = "+s1);
	}
}

public class Exc12
	{ 
   public static void main(String args[])
	{ 
	try 
	{
		throw new MyException("Custom message");
      } 
	catch(MyException exp)
      {
		System.out.println(exp);
      }
   }
}