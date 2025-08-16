import java.util.*;

public class TreeMap1
{
	public static void main(String args[])
	{
		TreeMap<String, String> tmap = new TreeMap<String, String>();
		tmap.put("EM1","TOM");
		tmap.put("EM3","WATSON");
		tmap.put("EM2","PETER");
		//tmap.put(null,null);
		System.out.println(tmap);
		System.out.println("--------");		

		System.out.println(tmap.put("EM3","DK"));//modify value
		System.out.println(tmap);
		System.out.println("--------");	

		System.out.println("Key  and values in Map");
		for(Map.Entry E:tmap.entrySet())
		{
				System.out.println(E.getKey() + " " + E.getValue());	
		}
		System.out.println("Key in Map");
		for(String s:tmap.keySet())
			System.out.println(s);
		System.out.println("--------");	


		System.out.println("Values in Map");
		
		for(String s:tmap.values())
			System.out.println(s);
		System.out.println("--------");	
		
		System.out.println("Value associated with EM2 : "+tmap.get("EM2"));
		System.out.println("\n size is:"+tmap.size());
		System.out.println("remove EM2 :"+tmap.remove("EM2"));
		System.out.println(tmap);
		System.out.println("--------");	
	}
}
