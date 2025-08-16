import java.util.*;

public class b {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number 1:");
        int a=sc.nextInt();

        System.out.println("Enter number 2");
        int b=sc.nextInt();

        a=a+b;
        b=a-b;
        a=a-b;

        System.out.println("The number after swapping is \n a:"+a+"\nb"+b);

        
    }
    
}
