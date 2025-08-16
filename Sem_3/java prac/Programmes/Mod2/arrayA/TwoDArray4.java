import java.util.Scanner;  
class TwoDArray4{  
	//return 2d array....
	 int[][] create()
	{
		int[][] a={{10,20,30},{30,40,50}};
		
		return a;
		
	}
	
public static void main(String[] args) 
	{
		TwoDArray4 t=new TwoDArray4();
		int[][] temp=t.create();
			
		
		
		//Scanner sc = new Scanner(System.in);  
		System.out.println("Enter for array A");
		for(int i=0;i<3;i++)//row
		{
			for(int j=0;j<3;j++)//cols
			{
				System.out.println(temp[i][j]);
			}
		}
		

		
	
		
		
		
		
		
		
		
		
		
		
		
      
}  
}  