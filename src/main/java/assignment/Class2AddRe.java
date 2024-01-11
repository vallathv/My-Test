package assignment;

public class Class2AddRe extends Class1add {
	
	
	
	public void addresult() {
		
		System.out.println(super.c);
	
		int result =(c)%10;
	
		System.out.println(result);
	}


	public static void main(String[] args) {
		
		Class2AddRe obj1= new Class2AddRe();
		obj1.addresult();
		
		
	}
	

	}


