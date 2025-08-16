import java.util.*;

public class array {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<Integer>();
        num.add(new Integer(10));
        num.add(new Integer(20));
        num.add(new Integer(30));
        num.add(new Integer(40));
        num.add(new Integer(50));

        Iterator<Integer> it = num.iterator();
        
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println(num);
    }
}
