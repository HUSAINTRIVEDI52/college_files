import java.util.Vector;
public class VectorDemo {
    public static void main(String args[])
    {
        Vector<String> vec = new Vector<String>(1);
	Vector<String> vec2 = new Vector<String>(1);
	    	
	    //add elemetns using add method
	vec.add("Dart");
	vec.add("GoLanguage");
	vec.add("Java");
	vec.addElement("C++");
	    
	vec2.addAll(vec);
	
	//to check the sizeof vector...
	System.out.println(vec.size());
	
	//to access the first element    
	System.out.println(vec.firstElement());    
	    
	//to access the first element    
	System.out.println(vec.lastElement());

	vec.add("JavaScript");
	
	//remove
	vec.remove("Java");
	System.out.println(vec);
	
	//to check the index o f
	System.out.println(vec.indexOf("C++"));
        
    }
}