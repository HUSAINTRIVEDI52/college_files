/* This programme show the createion of STACK
It demostrate the various methods of it*/ 


import java.util.*;

class Book
{  
	int id;  
	String name,author,publisher;  
	int quantity;  

	public Book(int id, String name, String author, String publisher, int quantity)
	{  
    		this.id = id;  
    		this.name = name;  
    		this.author = author;  
    		this.publisher = publisher;  
    		this.quantity = quantity;  
	}  
} 

class Demostack_1
{
	public static void main(String args[])
	{


		Stack<Book> s1=new Stack<Book>();  
    
		//Creating Books  
    		Book b1=new Book(101,"Let us C","Yashwant Kanetkar","BPB",8);  
    		Book b2=new Book(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);  
    			
		s1.push(b1);
		s1.push(b2);
		
		for(Book b:s1)
		{  
    						System.out.println(b.id+"\t"+b.name+"\t"+b.author+"\t"+b.publisher+"\t"+b.quantity);
    		}  

	}
}
