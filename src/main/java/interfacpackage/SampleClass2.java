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
	SampleClass2 obj =new SampleClass2(); //obj created in name of class ,the data in interface and connected class can be viewed.
		//Sample1 obj1=new SampleClass2();// interface obj created ,so view the contents of interface only
		obj.display();
		obj.add();
		obj.print();
		System.out.println(obj.a);
		System.out.println(obj.b);

	}

}
