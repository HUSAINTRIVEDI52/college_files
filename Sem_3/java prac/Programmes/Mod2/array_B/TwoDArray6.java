import java.util.Scanner;  
class TwoDArray6{  
	//return 2d array from function
	int[][] create()
	{
		int[][] t={{10,20},{30,40}};
		return t;
	}	
public static void main(String[] args) 
	{
		TwoDArray6 ta=new TwoDArray6();
		int[][] ar=ta.create();
		
   for (int i =0;i<3;i++)  //row
    {  
        for(int j=0;j<3;j++)  //cols
        { 
		SOP(ar[i][j])
	}  
    }  
	
	
    
    
      
    
   }  
}  