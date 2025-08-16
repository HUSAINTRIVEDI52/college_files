import java.util.*;
public class sorted {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String input;
        System.out.println("Enter a string:");
        input=sc.nextLine();

        char[] charArray=input.toCharArray();

        Arrays.sort(charArray);
        String sorted=new String(charArray);

        System.out.println("The sorted array is "+sorted);
    }
}
