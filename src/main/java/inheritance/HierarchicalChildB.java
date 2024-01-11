package inheritance;

public class HierarchicalChildB extends HierarchicalParent {
	

public void mul() {
		
		System.out.println(a*b);
	}

	

	public static void main(String[] args) {
	
		HierarchicalChildB obj=new HierarchicalChildB();
		obj.mul();

	}

}
