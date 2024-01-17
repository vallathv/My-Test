package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Samplelist1 {

	public static void main(String[] args) {
		
		//Genric  List 
		
		
		List<String>a1 = new ArrayList();
		//add
		a1.add("Hello  ");
		a1.add("Bike");
		a1.add("Raya");
		System.out.println(a1);
		
		
		
		List<String>a3 = new ArrayList();
		//add
		a3.add("Hello World ");
		a3.add("Java");
		a3.add("Ritu");
		System.out.println(a3);
		//remove
		a3.remove(0);
		System.out.println(a3);
		
		List<Integer>a5 = new ArrayList();
		a5.add(1);
		a5.add(2);
		a5.add(1);
		System.out.println(a5);
		 

		//non generic
		List a4=new ArrayList();
		a4.add(1);
		a4.add(5);
		a4.add(5);
		a4.add("Hi");
		System.out.println(a4);
		
		

		
		//addAll
		
		List<String>a2 = new ArrayList();
		a2.add("BMW");
		a2.add("volvo");
		a2.add("Swift");
		a2.addAll(a4);
		System.out.println(a2);
		
		
		//removeall
		a5.removeAll(a5);
		System.out.println(a5);
		
		//get
		System.out.println(a4.get(2));
	
		
		//size
		
		System.out.println(a2.size());
		
		
		//contains  
		boolean a= a2.contains("Hello");
		System.out.println(a);
		boolean b= a2.contains("BMW");
		System.out.println(b);
		
		
		//iterator
		
		Iterator itr =a2.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
	}

}}
