package exceptionPack;

public class SampleClass {
	
	public void test(int age) throws LicenceException  {
		
		if (age<18) {
			
			throw new LicenceException("Not Eligible");
		}else {
			System.out.println("Eligible");
			
		}
		
		
	}
	
	
	public static void main(String[] args) throws LicenceException {
		SampleClass obj =new SampleClass();
		obj.test(15);

	}

}
