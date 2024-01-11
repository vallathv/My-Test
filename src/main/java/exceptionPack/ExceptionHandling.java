package exceptionPack;

public class ExceptionHandling {
	
	
public void display() {
		
		int a=10;
		try {
					
		int b=a/0;//exception 
		System.out.println(b);//exception
		
	}/*catch(Exception x) {
		System.out.println("Exception handled ");
		System.out.println(x);
}*/
	finally {
		System.out.println("Finally Block");
	}	
		
}

	public static void main(String[] args) {
		ExceptionHandling obj =new ExceptionHandling();
	
		obj.display();//exception
		//System.out.println("End of statment");
		
	}

}



