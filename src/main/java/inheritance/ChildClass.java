package inheritance;

public class ChildClass extends ParentClass {
	
	int b=20;
	
	public void add() {
		
		System.out.println(a+b);
	}
	
	public static void sub() {
		

		System.out.println(x);
	}

	public static void main(String[] args) {
		ChildClass obj =new ChildClass();
		obj.print();
		obj.display();
		obj.add();
		obj.sub();
	}

}

