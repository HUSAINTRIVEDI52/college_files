import java.util.Scanner;  
class Varargs{
//varargs	
	static void java(int ... a)
	{System.out.println("No of argument: "+a.length);
		//for each
		for(int i:a)
		{
			System.out.println(i);
		}
		
	}
			
public static void main(String[] args) 
	{
		//java("Hello");
		java(10,20,30,50,60,80,700);
		java(10);
	}
}  