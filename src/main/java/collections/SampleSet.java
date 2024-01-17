package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SampleSet {

	public static void main(String[] args) {
		
		//add
		
		Set<String> a1 = new HashSet();  
		a1.add("Hello");
		a1.add("Abhi");
		a1.add("Java");
		System.out.println(a1);
		
		//addAll
		Set<String>a2 = new HashSet();
		
		a2.add("Hi");
		a2.add("Asha");
		a2.add("Bike");
		
		a2.addAll(a1);
		
		System.out.println(a2);
		
		
		
		//get
			//System.out.println(a2.get());
				
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
		
		

	}

}
