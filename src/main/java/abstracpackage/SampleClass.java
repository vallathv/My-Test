package abstracpackage;

public class SampleClass extends SampleAbstrac {
	
	public void print() {
		
		System.out.println("abstract Method ");
	}
	
	public static void main(String args[]) {
		
		SampleClass obj =new SampleClass();
		obj.print();
		obj.display();
		
		
		
	}

}
	