import java.util.*;

public class Listiterator {
    public static void main(String[] args) {
        LinkedList<String> l1 = new LinkedList<String>();
        l1.add("E");
        l1.add("D");
        l1.add("C");
        l1.add("B");
        l1.add("A");

        ListIterator it = l1.listIterator();
        System.out.println("Starting the list in forward direction");
        while (it.hasNext()) {
            System.out.println(it.next() + " ");
        }
        System.out.println();
        while (it.hasPrevious()) {
            System.out.println(it.previous() + " ");
        }
        System.out.println();
    }
}
