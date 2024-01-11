  package inheritance;

public class MultiChildclass extends MultiParentClass {	
	
public void mul() {
	System.out.println(a*b);
		
	}


public static void main(String[] args) {
	MultiChildclass obj=new MultiChildclass();
    obj.add();
	obj.sub();
	obj.mul();
}
}
