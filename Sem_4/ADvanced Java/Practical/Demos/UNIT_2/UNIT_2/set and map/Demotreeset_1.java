/* This programme show the createion of STACK
It demostrate the various methods of it*/

import java.util.*;

class Book implements Comparable<Book> {
	int id;
	String name, author, publisher;
	int quantity;

	public Book(int id, String name, String author, String publisher, int quantity) {
		this.id = id;
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.quantity = quantity;
	}

	@Override
	public int compareTo(Book o) {
		// TODO Auto-generated method stub
		return this.id - o.id;

	}
}

class Demotreeset_1 {
	public static void main(String args[]) {
		TreeSet<Book> s1 = new TreeSet<Book>();

		// Creating Books
		Book b1 = new Book(103, "Let us C", "Yashwant Kanetkar", "BPB", 8);
		// Book b2=new Book(102,"Data Communications & Networking","Forouzan","Mc Graw
		// Hill",4);
		// Book b3=new Book(101,"xml","ashok","BPB",8);
		s1.add(b1);
		// s1.add(b2);
		// s1.add(b3);

		for (Book b : s1) {
			System.out.println(b.id + "\t" + b.name + "\t" + b.author + "\t" + b.publisher + "\t" + b.quantity);
		}

	}
}
