import java.util.Scanner;
class Array2{
	//1d array....... []
	
	static void min(int[] a)
	{
		int[] temp=a;
		int m=temp[0];
		
		for(int i=1;i<temp.length;i++)
		{
			
			if(m>temp[i])
			{
				m=temp[i];
			}
			
		}
		System.out.println("Minimum value is : "+m);
		
	}
	
	static void countodd(int[] a)
	{
		int[] temp=a;
		
		int odd=0;
		for(int i=1;i<temp.length;i++)
		{
			if(temp[i]%2!=0)
			{
				odd++;
			}
			
		}
		
		System.out.println("Odd nos count is : "+odd);
	}

	
	
	public static void main(String[] args)
	{
		int[] arr={10,20,30,-5,-3,0,5,3,8};//declared
		
		min(arr);
		countodd(arr);






		
		
		
	}
		
	
	
}