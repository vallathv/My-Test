package polymorphism;

public class ChildClass extends ParentClass {
	
	final int b=60;// final keyword in variable 
	
	@Override
	public void display() {
		
		System.out.println("Child Class");
		super.display();
		//b =70; we can't change the  values of variable due to final keyword used
	}

	public static void main(String[] args) {
		
		ChildClass obj = new ChildClass ();
		obj.display();
		
		
	}

}
