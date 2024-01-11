package encapsulation;

public class EncapClass {

	private String name;
	private int age ;
	
	public void setter(String name, int age  ) {
		
		this.name=name;//assigning instance variable =localvariable
		this.age=age;
	}
	
	
	public void getter() {
		System.out.println(name);
		//age=age*2;
		System.out.println(age);
		
	}
	
	
}
