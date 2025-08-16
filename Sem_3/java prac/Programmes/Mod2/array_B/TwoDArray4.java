import java.util.Scanner;  
class TwoDArray4{  
	//passing 2d array in function......
	static void display(int[][] temp)
	{
		int[][] t=temp;
		
		for (int i =0;i<3;i++)  //row
		{  
			for(int j=0;j<3;j++)  //cols
			{ 
		
				System.out.print(t[i][j]);
			}  
		System.out.println();
		}
		
	}
	
	
public static void main(String[] args) 
	{
		int[][] a=new int[3][3];	
		
	Scanner sc = new Scanner(System.in);  
   for (int i =0;i<3;i++)  //row
    {  
        for(int j=0;j<3;j++)  //cols
        { 
		a[i][j]=sc.nextInt();
	}  
    }  
	display(a);
	
    
    
      
    
   }  
}  