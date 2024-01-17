package collections;

import java.util.Iterator;
import java.util.LinkedList;

public class SampleLinkedList {

	public static void main(String[] args) {
		
		
		LinkedList<String> a1 =new LinkedList();
		a1.add("HI");
		a1.add("Hello");
		a1.add("World");
		a1.add("Sky");
	System.out.println(a1);
	a1.remove(3);
	System.out.println(a1);	
		
//addAll

	LinkedList<String> a2 =new LinkedList();
	a2.add("MY");
	a2.add("Name");
	a2.add("Icecream");
	a2.addAll(a1);
	System.out.println(a2);
	
	
	a1.removeAll(a1);
	System.out.println(a1);
	
	
	
	
	//get
		System.out.println(a2.get(0));
		
		//size
		System.out.println(a2.size());
		
		//contains  
		
		boolean a =a2.contains("Hi");
		System.out.println(a);
		boolean b =a2.contains("Name");
		System.out.println(b);
		
		
	
	Iterator itr =a2. iterator();
	while(itr.hasNext()){
		System.out.println(itr.next());
		
		
		
	}
		
		
		//
	}
	}