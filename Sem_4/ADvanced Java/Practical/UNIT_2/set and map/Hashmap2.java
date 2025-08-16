import java.util.*;

public class Hashmap2
{
	public static void main(String args[])
	{
		HashMap<String, String> hmap = new HashMap<String, String>();
		hmap.put("EM1","TOM");
		hmap.put("EM2","PETER");
		hmap.put("EM3","WATSON");
		hmap.put(null,null);
		System.out.println(hmap);
	}
}
