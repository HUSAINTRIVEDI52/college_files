import java.util.*;

public class queue {
    public static void main(String[] args) {
        Queue<String> q1 = new LinkedList<String>();
        q1.add("E");
        q1.add("D");
        q1.add("C");
        q1.add("B");
        q1.add("A");

        System.out.println("-------------------------");
        System.out.println(q1);
        for (String s : q1) {
            System.out.println(s);
        }
        System.out.println("The first element is " + q1.peek());
        System.out.println("Remove first element " + q1.poll());
        for (String s : q1) {
            System.out.println(s);
        }
    }
}
