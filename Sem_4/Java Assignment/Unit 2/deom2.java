// 1) Write a program for adding 10 elements in a Arraylist and display them using ListIterator.
->import java.util.*;
public class demo2
{
public static void main(String[] args)
{
ArrayList<Integer> n = new ArrayList<>();
for (int i = 1; i <= 10; i++)
{
n.add(i * 10);
}
ListIterator<Integer> iterator = n.listIterator();
while (iterator.hasNext())
{
System.out.println(iterator.next());
}
}
}