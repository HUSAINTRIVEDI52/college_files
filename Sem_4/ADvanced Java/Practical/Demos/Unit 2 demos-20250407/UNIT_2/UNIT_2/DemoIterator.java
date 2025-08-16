import java.util.*;

public class DemoIterator
{
  	public static void main(String[] args)
	{
    		ArrayList<Integer> numbers = new ArrayList<Integer>();
    		numbers.add(12);
    		numbers.add(8);
    		numbers.add(2);
    		numbers.add(23);
    
		Iterator<Integer> it = numbers.iterator();
    		Iterator<Integer> it1 = numbers.iterator();
		 // Print the item
		while(it.hasNext())
		{    		
			System.out.println(it.next());
		}
		// Remove the item
		
		while(it1.hasNext())
		{
      			Integer i = it1.next();
      			if(i < 5) 
			{
        			it1.remove();
      			}
    		}
    		System.out.println(numbers);
  	}
}