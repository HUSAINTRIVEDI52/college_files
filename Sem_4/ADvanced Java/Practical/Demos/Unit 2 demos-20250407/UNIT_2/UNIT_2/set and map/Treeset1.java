import java.util.*;

class Treeset1
{
	public static void main(String args[])
	{
		TreeSet<String> t1=new TreeSet<String>();
		t1.add("D");
		t1.add("C");
		t1.add("B");
		t1.add("D");
		t1.add("D");
		t1.add("A");
		t1.add("F");
		//t1.add(null);
		System.out.println(t1);
	for(String s:t1)
			System.out.println(s);//iterating
		
		System.out.println("--");
		System.out.println(t1.first());
		System.out.println("--");
		System.out.println(t1.last());
		System.out.println("--");
		System.out.println(t1.size());
}
		}


