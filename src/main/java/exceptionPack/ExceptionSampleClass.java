package exceptionPack;

public class ExceptionSampleClass {
	

	
	public void display() {
		try {
		String s1=null;
		System.out.println(s1.length());
		}catch(Exception e) {
			
			System.out.println("Exception occured");
		}
		try {
		int array[]= {1,2,3,4,5};
		System.out.println(array[5]);}catch(Exception e) {
			System.out.println("Exception2 occured");
		}
		finally {
		int a=10;
		int b=a/2;//exception 
		System.out.println(b);//exception
		}
		
	}
	
	
	
	

	public static void main(String[] args) {
		ExceptionSampleClass obj =new ExceptionSampleClass();
		System.out.println("End of statment");
		obj.display();//exception
		System.out.println("End of statment");
	
		

	}

}
