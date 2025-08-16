import java.util.*;

public class Linkedlist2 {
    public static void main(String[] args) {
        LinkedList<String> l1 = new LinkedList<String>();
        l1.add("E");
        l1.add("D");
        l1.add("C");
        l1.add("B");
        l1.add("A");

        System.out.println("--------------------------------------");
        for (String s : l1) {
            System.out.println(s);
        }
        System.out.println("The size of the linkedlist is " + l1.size());
        System.out.println("--------------------------------------");
        System.out.println("Adding first element (F) ");
        l1.addFirst("F");

        for (String s : l1) {
            System.out.println(s);
        }

        System.out.println("Removing B from the list");
        l1.remove("B");

        for (String s : l1) {
            System.out.println(s);
        }
        System.out.println("-----------------------------------------");

    }
}
