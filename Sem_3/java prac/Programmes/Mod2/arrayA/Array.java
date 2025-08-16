import java.util.Scanner;
class Array{
	//1d array....... []
	public static void main(String[] args)
	{
		Scanner sc=new Scnner(System.in);
		System.out.println("Enter the size");
		int sz=sc.nextInt();//10
		
		int[sz] arr=new int[sz];//declared
		
		//arr={10,20,30,40,50};
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
			
		}
		
		
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
			
		}
		
	}
		
	
	
}