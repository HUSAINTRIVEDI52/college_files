import java.util.*;

class Hashset1
{
	public static void main(String args[])
	{
		HashSet<String> h1=new HashSet<String>();
		h1.add(null);
		h1.add("Z");
		h1.add("A");
		h1.add("a");
		h1.add("C");
		h1.add("B");
		h1.add(null);
		h1.add("B");
		System.out.println(h1);
		for(String s:h1)
			System.out.println(s);//iterating

		System.out.println("--");
		System.out.println("\n size is:"+ h1.size());
		System.out.println("--");
		System.out.println("\n remove:"+ h1.remove(null));
		System.out.println("--");
		System.out.println(h1);
		System.out.println("--");
		System.out.println("\n contains:"+ h1.contains("D"));

		//subset
		HashSet<String> h2=new HashSet<String>();
		h2.add("A");
		h2.add("C");
		h2.add("B");
		System.out.println("--");
		System.out.println("\n h2 is subset of h1:"+ h1.containsAll(h2));

		System.out.println(h1);

	}	
}
