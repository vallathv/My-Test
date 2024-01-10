package super1;

public class SuperChild extends SuperParent{
	
	
	public void display() {
		System.out.println("Super Child");
		System.out.println(super.a);//invoke parentclass instance variable
		System.out.println(super.b);
		super.print();//invoke parentclass method
		
	}
	
	

	public static void main(String[] args) {
	
SuperChild obj= new SuperChild();
//SuperParent obj1 = new SuperParent();
//System.out.println(super.b);  cannot use super in static method
//obj1.print();
obj.display();



	}

}
