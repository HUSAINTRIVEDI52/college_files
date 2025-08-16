import java.util.*;

public class Hashmap1
{
	public static void main(String args[])
	{

		HashMap<Integer, String> hmap = new HashMap<Integer, String>();
 		 
		/*Adding elements to HashMap*/
      	
		hmap.put(12, "Chaitanya");
     		hmap.put(2, "Rahul");
		hmap.put(2,"abc");
      		hmap.put(7, "Singh");
     		hmap.put(49, "Ajeet");
      		hmap.put(2, "Anuj");
		hmap.put(5, "Rahul");
		hmap.put(null,null);
		hmap.put(null,null);
		hmap.put(null,"vidhi");
		hmap.put(6,null);
		System.out.println(hmap);
		/*for(Map.Entry m:hmap.entrySet())
		{  
   			
			int x=(int)m.getKey();
			//if(x%2==0)
			{
			System.out.println("key="+m.getKey()+" value="+m.getValue());  
				}*/

  		
	//}
}
	
}










