import java.util.Scanner;  
class TwoDArray2{  
public static void main(String[] args) 
	{  
		//2d array...
		//1d..... hr/vr  
		int[][] a=new int[3][3];
		int[][] b=new int[3][3];
		int[][] c=new int[3][3];
		int oddn=0;
		int evenn=0;
		/*int[][] a=0 {{10,20,30},
				1 {10,20,30}}
				2	
		*/
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
		
		
		for(int i=0;i<3;i++)//row
		{
			for(int j=0;j<3;j++)//cols
			{
				c[i][j]=a[i][j]+b[i][j];
				
				
				if(a[i][j]%2==0)
				{
					evenn++;
				}
				else
				{
					oddn++;
				}
				
				System.out.print(c[i][j]+"\t");
			}
			System.out.println();
		}
		
	System.out.print("Total Even nos: "+evenn);
		System.out.print("Total odd nos: "+oddn);
    
    
      
}  
}  