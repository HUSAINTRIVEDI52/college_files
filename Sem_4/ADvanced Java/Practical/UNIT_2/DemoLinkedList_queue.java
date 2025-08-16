/* This programme show the createion of Lisked List and used as Queue
It demostrate the various methods of it*/ 


import java.util.*;

class DemoLinkedList_queue
{
	@SuppressWarnings("removal")
	public static void main(String args[])
	{

		LinkedList<Long> l3=new LinkedList<Long>();
		l3.add(new Long(1));
		l3.add(new Long(2));
		l3.add(new Long(3));
		l3.add(new Long(4));

			for(Long b:l3)
				System.out.println(b);
		System.out.println("------------------");

		//to display element at first position
		System.out.println("First element :" + l3.peek());
		System.out.println("------------------");
		
		//to remove element from first position
		System.out.println("Remove First Element : " + l3.poll());
		System.out.println("------------------");
		System.out.println(l3);

		}
}
