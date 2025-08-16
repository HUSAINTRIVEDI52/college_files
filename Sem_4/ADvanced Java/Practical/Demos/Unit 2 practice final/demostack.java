
import java.util.*;

public class demostack {
    public static void main(String[] args) {
        Stack<Integer> s1 = new Stack<Integer>();
        s1.push(new Integer(80));
        s1.push(new Integer(70));
        s1.push(new Integer(60));
        s1.push(new Integer(50));
        s1.push(new Integer(40));
        s1.push(new Integer(30));
        s1.push(new Integer(20));
        s1.push(new Integer(10));
        for (int a : s1) {
            System.out.println(a);
        }
        System.out.println("--------------------------------");
        System.out.println("The first index is " + s1.search(0));
        System.out.println("The third index is " + s1.search(3));
        System.out.println("Popped" + s1.pop());
        System.out.println("Popped" + s1.pop());
        System.out.println("----------------------------------");
        System.out.println("Peek" + s1.peek());
        System.out.println("Peek" + s1.peek());
        for (int a : s1) {
            System.out.println(a);
        }

    }
}
