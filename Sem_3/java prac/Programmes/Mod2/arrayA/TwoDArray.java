import java.util.Scanner;  
class TwoDArray{  
public static void main(String[] args) 
	{  
		//2d array...
		//1d..... hr/vr  
		int[][] a=new int[3][3];
		/*int[][] a=0 {{10,20,30},
				1 {10,20,30}}
				2	
		*/
		Scanner sc = new Scanner(System.in);  
    
		for(int i=0;i<3;i++)//row
		{
			for(int j=0;j<3;j++)//cols
			{
				a[i][j]=sc.nextInt();
			}
		}
		
		for(int i=0;i<3;i++)//row
		{
			for(int j=0;j<3;j++)//cols
			{
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}
		
		
    
    
      
}  
}  