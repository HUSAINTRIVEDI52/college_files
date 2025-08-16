/* This programme show the createion of Lisked List and used as STACK
It demostrate the various methods of it*/ 


import java.util.*;

class DemoLinkedList_stack
{
	@SuppressWarnings("removal")
	public static void main(String args[])
	{

		LinkedList<Integer> l2=new LinkedList<Integer>();
		l2.push(new Integer(1));
		l2.push(new Integer(2));
		l2.push(new Integer(3));
		l2.push(new Integer(4));

			for(int a:l2)
				System.out.println(a);
			System.out.println("------------------");
		
			System.out.println("Popped: "+l2.pop());
			System.out.println("Popped: "+l2.pop());
	}
}
