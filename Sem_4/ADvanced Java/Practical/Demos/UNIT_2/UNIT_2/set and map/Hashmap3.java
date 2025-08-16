import java.util.*;

public class Hashmap3
{
	public static void main(String args[])
	{
		HashMap<String, String> hmap = new HashMap<String, String>();
		hmap.put("EM1","TOM");
		hmap.put("EM3","PETER");
		hmap.put("EM2","WATSON");
		//hmap.put(null,null);
		System.out.println(hmap);
		HashMap <String, String> hmap2=new HashMap<String, String>();
		hmap2.putAll(hmap);
		System.out.println(hmap.put("EM3","DK"));//modify value
		System.out.println(hmap);
	
		System.out.println("Key in Map");

		for(String s:hmap.keySet())
			System.out.println(s);

		System.out.println("Values in Map");
		
		for(String s:hmap.values())
			System.out.println(s);

		System.out.println("Value associated with EM2 : "+hmap.get("EM2"));
		System.out.println("\n size is:"+hmap.size());
		System.out.println("remove EM2"+hmap.remove("EM2"));
		System.out.println(hmap);
	}
}







