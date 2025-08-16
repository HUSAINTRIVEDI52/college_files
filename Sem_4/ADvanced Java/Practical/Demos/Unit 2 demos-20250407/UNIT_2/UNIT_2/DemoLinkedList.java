/* This programme show the createion of Lisked List and
It demostrate the various methods of it*/ 


import java.util.*;

class DemoLinkedList
{
	public static void main(String args[])
	{
		int sz;
		LinkedList<String> l1=new LinkedList<String>();
	//	l1.add("A");
		l1.add("B");
		l1.add("C");
		l1.add(null);
		l1.add("D");

		for(String s:l1)
			System.out.println(s);
		System.out.println("------------------");
		
		sz = l1.size();
		System.out.println("The Size of Linked List is" + sz);
		System.out.println("------------------");
		
		l1.addFirst("A");
			for(String s:l1)
				System.out.println(s);
		System.out.println("------------------");	
		
		l1.remove("B");
			for(String s:l1)
				System.out.println(s);
		System.out.println("------------------");
	
	}	
}
