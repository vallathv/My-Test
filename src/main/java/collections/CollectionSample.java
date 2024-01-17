package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionSample {
	

	public static void main(String args[]) {
	
		//non generic
	ArrayList a1  =new  ArrayList();
	a1.add("Varsha");//adding objects
	a1.add(1);
	a1.add(1.5);
	a1.add(23.5d);
	System.out.println(a1);
	
	//gneric arraylist
	ArrayList <String> a2  =new  ArrayList();
	a2.add("Hello");
	a2.add("hi");
	a2.add("World");
	//a2.add(4);
	System.out.println(a2);
	a2.remove(1);// remove obj from list 
	System.out.println(a2);
	

	//addAll 
	ArrayList<String>a3=new ArrayList();
	a3.add("Java");
	a3.add("HelloWorld");
	a3.add("VArsha");
	a2.addAll(a3);
	System.out.println(a2);
	
	//removeAll 
	a1.removeAll(a1);
	System.out.println(a1);
	
	//get
	System.out.println(a2.get(0));
	
	//size
	System.out.println(a2.size());
	
	//contains  
	
	boolean a =a3.contains("Hi");
	System.out.println(a);
	boolean b =a3.contains("HelloWorld");
	System.out.println(b);
	
	
	//iterator
	
	Iterator itr =a3.iterator();
	while (itr.hasNext()) {
		System.out.println(itr.next());
			
	}
	
	
	//remove
	itr.remove();
	System.out.println(a3);
	
	
	
}
}