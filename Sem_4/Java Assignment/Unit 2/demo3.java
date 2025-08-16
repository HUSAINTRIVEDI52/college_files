// 2) Write a program for adding 10 elements in a Arraylist and display them using Iterator.
->import java.util.*;
public class demo3
{
public static void main(String[] args)
{
ArrayList<Integer> n = new ArrayList<>();
for (int i = 1; i <= 10; i++)
{
n.add(i * 10);
}
Iterator<Integer> iterator = n.iterator();
while (iterator.hasNext()) {
System.out.println(iterator.next());
}
}
}