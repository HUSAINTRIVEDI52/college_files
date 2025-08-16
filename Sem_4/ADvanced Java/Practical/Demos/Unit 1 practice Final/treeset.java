import java.util.*;

class books implements Comparable<books> {

    int quantity, id;
    String name, title, author, publisher;

    public books(int id, int quantity, String name, String title, String author, String Publisher) {
        this.id = id;
        this.quantity = quantity;
        this.name = name;
        this.title = title;
        this.author = author;
        this.publisher = publisher;

    }

    public int compareTo(books b) {
        return this.id - b.id;
    }
}

public class treeset {
    public static void main(String[] args) {
        TreeSet<books> ts = new TreeSet<books>();
        books b1 = new books(1, 10, "Hello", "Hello", "Hello", "Hello");
        books b2 = new books(2, 101, "Hello World", "Hello World", "Hello World", "Hello World");
        ts.add(b1);
        ts.add(b2);
        for (books s : ts) {
            System.out.println( s.id + "\t" + s.quantity + "\t" + s.name + "\t" + s.title + "\t" + s.author + "\t" + s.publisher);

        }

    }

}
