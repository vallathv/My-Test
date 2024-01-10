package accessmodifiersample;

public class Accessmodifier1 {
	//instance variable a
	public int a=10;
	private int x=100;
	protected int y =200;
	 String s="Abhi";
	int age =5;//default
	
	//static method 
	public static void add() {
		int b=20;
		int c=30;
		
	System.out.println(b+c);
	}
	
	private void print() {
		
		System.out.println("Private");
	}
	
	protected void display() {
		
		System.out.println("protected");
	}
	
	//default
	 static void studentmark() {
		
		 System.out.println("default");
	}
	

	public static void main(String[] args) {

		Accessmodifier1.add();
		Accessmodifier1 obj = new Accessmodifier1();
		System.out.println(obj.a);
		obj.print();
		System.out.println(obj.x);
		System.out.println(obj.y);
		obj.display();
		Accessmodifier1.studentmark();
		System.out.println(obj.age);
	
	}

}
