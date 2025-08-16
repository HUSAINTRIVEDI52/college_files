import java.util.Scanner;
class Array3{
	//1d array....... []
	
	static int[] create()
	{
		int[] temp={10,20,30,40,50,8,2,3,7};
		int[] odd=new int[];
		int[] even=new int[];
		for(int i=0;i<temp.length;i++)
		{
			if(temp[i]%2==0)
			{
				even[i]=temp[i];
			}
			else
			{
				odd[i]=temp[i];
			}
			
		}
		
		
		return even;
	}

	public static void main(String[] args)
	{
		int[] a=create();
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
		
		
		
		
		

		
		
		
	}
		
	
	
}