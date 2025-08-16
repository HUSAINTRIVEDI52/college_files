import java.util.Scanner;  
class TwoDArray{  
public static void main(String[] args) 
	{  
		int[][] arr = new int[3][3];
		//	int rows=3; 8*3*=24
		//	int cols=3;
		//
		//int[][] arr={{10,20,30},{40,50,60},{88,99,77}}
		Scanner sc = new Scanner(System.in);  
    
   for (int i =0;i<3;i++)  //row
    {  
        for(int j=0;j<3;j++)  //cols
        { 
		arr[i][j]=sc.nextInt();
	}  
    }  
    
    for (int i =0;i<3;i++)  //row
    {  
        for(int j=0;j<3;j++)  //cols
        { 
		System.out.println("Array is : "+arr[i][j]);
	}  
    }  
    
    
      
}  
}  