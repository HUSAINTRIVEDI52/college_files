import java.util.*;

public class Array1 {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(50);
        numbers.add(40);
        numbers.add(30);
        numbers.add(10);
        numbers.add(20);
        Iterator<Integer> it = numbers.iterator();
        Iterator<Integer> it1 = numbers.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // while (it.hasNext()) {
        //     Integer i = it1.next();
        //     if (i < 5) {
        //         it1.remove();
        //     }
        // }
        System.out.println(numbers);

    }
}