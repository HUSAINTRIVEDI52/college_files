import java.util.Scanner;  
class TwoDArray3{  
	
	static void display(int[][] temp1,int[][] temp2)
	{
		int[][] t1=temp1;
		int[][] t2=temp2;
		
		for(int i=0;i<3;i++)//row
		{
			for(int j=0;j<3;j++)//cols
			{
				System.out.println(t[i][j]);
			}
		}
	}
	
public static void main(String[] args) 
	{  	//passing 2d array as arguments.....
		
		int[][] a=new int[3][3];
		int[][] b=new int[3][3];
		
		Scanner sc = new Scanner(System.in);  
		System.out.println("Enter for array A");
		for(int i=0;i<3;i++)//row
		{
			for(int j=0;j<3;j++)//cols
			{
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter for array B");
		for(int i=0;i<3;i++)//row
		{
			for(int j=0;j<3;j++)//cols
			{
				b[i][j]=sc.nextInt();
			}
		}

		
	display(a,b);
		
		
		
		
		
		
		
		
		
		
		
      
}  
}  