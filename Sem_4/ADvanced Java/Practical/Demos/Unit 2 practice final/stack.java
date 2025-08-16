import java.util.*;

class Book {
    int id;
    String name, title, Publisher;
    int quantity;

    Book(int id, String name, int quantity, String title, String Publisher) {
        this.id = id;
        this.name = name;
        this.title = title;
        this.Publisher = Publisher;
        this.quantity = quantity;
    }
}

public class stack {
    public static void main(String[] args) {
        Stack<Book> bk = new Stack<Book>();
        Book b1 = new Book(10, "Husain", 10, "Hello", "L.K.RObins");
        Book b2 = new Book(1001, "Trivedi Husain", 110, "Hello World", "Q.R.RObins");
        bk.push(b1);
        bk.push(b2);
        for (Book s : bk) {
            System.out.println(s.id + "\t" + s.name + "\t" + s.title + "\t" + s.Publisher + "\t" + s.quantity);
        }
    }
}
