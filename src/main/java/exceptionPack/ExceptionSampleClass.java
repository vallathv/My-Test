package exceptionPack;

public class ExceptionSampleClass {
	

	
	public void display() {
		String s1=null;
		System.out.println(s1.length());
		 
		int array[]= {1,2,3,4,5};
		System.out.println(array[5]);
		
		int a=10;
		int b=a/0;//exception 
		System.out.println(b);//exception
		
		
	}
	
	
	
	

	public static void main(String[] args) {
		ExceptionSampleClass obj =new ExceptionSampleClass();
		System.out.println("End of statment");
		obj.display();//exception
		System.out.println("End of statment");
	
		

	}

}
