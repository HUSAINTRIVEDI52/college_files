import java.util.*;

class Demolinkedhasset
{
	public static void main(String args[])
	{
		LinkedHashSet<String> t1=new LinkedHashSet<String>();
		t1.add("D");
		t1.add("C");
		t1.add("B");
		t1.add(null);
		t1.add("D");
		t1.add("D");
		t1.add("A");
		t1.add("F");
		t1.add(null);
		
		System.out.println(t1);
		System.out.println("\n size is:"+ t1.size());
		System.out.println("--");
		System.out.println("\n remove:"+ t1.remove(null));
		System.out.println("--");
		System.out.println(t1);
		System.out.println("--");
		System.out.println("\n contains:"+ t1.contains("D"));	
	}

}
