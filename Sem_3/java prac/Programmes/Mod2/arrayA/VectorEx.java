import java.util.*;
class VectorEx{
	//collection framework.....fully dynamic array(grow/shrink)
	//stack.pop(10),vector,arraylist,linnked,que
	//vector
	public static void main(String[] args) 
	{
		Vector<String> vec=new Vector<String>();
		Vector<String> vec2=new Vector<String>();
		//add the elements vector
		vec.add("Dart");
		vec.add("Go");
		vec.add("Java");
		vec.add("c++");
		vec.addElement("JavaScript");
		
		System.out.println(vec);
		
		//to return size of vector
		System.out.println(vec.size());
		
		//first element
		System.out.println(vec.firstElement());
		
		//last element
		System.out.println(vec.lastElement());
		
		//index of  element
		System.out.println(vec.indexOf("Java"));
		
		//remove
		System.out.println(vec.remove("Java"));
		
		//add all
		vec2.addAll(vec);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}  
}  