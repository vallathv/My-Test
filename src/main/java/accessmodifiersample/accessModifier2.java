package accessmodifiersample;

public class accessModifier2 extends Accessmodifier1{

	public static void main(String[] args) {
		add();
		accessModifier2 obj1= new accessModifier2();
	   System.out.println(obj1.a);
	   //obj1.print();
	  // System.out.println(obj1.x);
	   obj1.display();
	   System.out.println(obj1.y);
	   accessModifier2.studentmark();
	   System.out.println(obj1.age);
	   

	}

}
