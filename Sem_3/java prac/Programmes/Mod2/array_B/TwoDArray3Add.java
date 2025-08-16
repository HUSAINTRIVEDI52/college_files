import java.util.Scanner;  
class TwoDArray3Add{  
public static void main(String[] args) 
	{  
		int[][] arr1 = new int[3][3];
		int[][] arr2 = new int[3][3];
		int[][] arr3=new int[3][3];
		
		int oddnos=0;
		int evennos=0;
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
		if(arr[i][j]%2==0)
		{
			evennos++;
		}
		else
		{
			oddnos++;
		}
		
		System.out.print(arr[i][j]+"\t");
	}  
	System.out.println();
    }  
    
    System.out.println("Total odd Nos: "+oddnos);
    System.out.println("Total even Nos: "+evennos);
    
   }  
}  