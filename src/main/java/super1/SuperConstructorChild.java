package super1;

public class SuperConstructorChild extends SuperConstructorParent{
	
	
	
public SuperConstructorChild() {
	super(2,7);
	System.out.println("Default constructor");
	
		
	}

	public static void main(String[] args) {
	
		
		SuperConstructorChild obj = new SuperConstructorChild();

	}  

}
