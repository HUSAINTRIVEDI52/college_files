import java.util.*;
public class q11 {
    public static void main(String[] args)
{
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a symbol to print pattern:");
    char input=sc.next().charAt(0);
    for(int i=0;i<5;i++)
    {
        for(int j=0;j<i;j++)
        {
            System.out.print(input);
        }
        System.out.println();
    }
}
}
