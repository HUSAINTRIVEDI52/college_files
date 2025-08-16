// Write a Java program to take student details rollno, name, surname, and 5 subject
// marks and display the total and percentage. All values should be taken from the
// Scanner class.

import java.util.*;
public class q3 {
    public static void main(String[] args)
    {
        int[] marks=new  int[5];
        int sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the students name");;
        String name=sc.nextLine();

        System.out.println("Enter the roll no");
        int rollno=sc.nextInt();

        System.out.println("Enter your Surname:");
        String surname=sc.next();
        // for(int i=0;i<5;i++)
        // {
        //     System.out.println("Enter the Marks of subject "+i);
        //     sc.nextInt();
        // }
        for(int i=0;i<5;i++)
        {
            System.out.println("Enter the Marks of subject "+i);
            marks[i]=sc.nextInt();
            sum+=marks[i];
        }
        System.out.println("The name of the student is "+name);
        System.out.println("The surname of the student is  "+surname);
        System.out.println("The roll no of the student is"+ibjects is "+sum);
        float percentage=sum/5;
        System.out.println("The percentage of the student is "+percentage);

    }
}
