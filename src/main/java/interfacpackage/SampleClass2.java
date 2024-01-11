package interfacpackage;

public class SampleClass2  implements Sample1 {
	
	public void display() {
		
		System.out.println("Abstract Method 1");
	}
	
	public void add()
	{
		
		System.out.println(a+b);
	
	}
	//method in child class 
	public void print() {
		
		System.out.println("Child class Method ");
	}
	
	public static void main(String[] args) {
	//	SampleClass2 obj =new SampleClass2(); obj created in name of class
		Sample1 obj1=new SampleClass2();// interface obj created 
		obj1.display();
		obj1.add();
		//obj1.print();
		System.out.println(obj1.a);

	}

}
