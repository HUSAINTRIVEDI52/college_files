/* This programme show the createion of STACK
It demostrate the various methods of it*/ 


import java.util.*;

class Demostack
{
	public static void main(String args[])
	{

		Stack<Integer> l2=new Stack<Integer>();
		l2.push(new Integer(1));
		l2.push(new Integer(2));
		l2.push(new Integer(3));
		l2.push(new Integer(4));
		

			for(int a:l2)
				System.out.println(a);
			
			System.out.println("------------------");
			System.out.println(l2);
			System.out.println("------------------");
			System.out.println("Search the index of 3 :" + l2.search(3));				
			System.out.println("------------------");

			System.out.println("Popped: "+l2.pop());
			System.out.println("Popped: "+l2.pop());

			System.out.println("------------------");
			System.out.println("Peek: "+l2.peek());
			System.out.println("Peek: "+l2.peek());
			System.out.println("------------------");

	}
}



