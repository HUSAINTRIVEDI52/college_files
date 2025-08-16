import java.util.*;

class dividebyzeroexception extends Exception{
    public dividebyzeroexception(String s)
    {
        super(s);
    }

}


public class a{
   public static  double divide(double numerator,double denominator) throws dividebyzeroexception
    {
        if(denominator==0)
        {   
            throw new dividebyzeroexception("You cannot divide by zero magajjj");
        }
        
        return numerator/denominator;
        
    }
    public static void main(String[] args) throws dividebyzeroexception {
        System.out.println("Enter  a numerator for the division of the number:");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();

        System.out.println("Enter a denominator for the division of the nmbers:");
        int den=sc.nextInt();

        double div= divide(num,den);
        System.out.println("The division of the two number is "+div);

        
    }
}