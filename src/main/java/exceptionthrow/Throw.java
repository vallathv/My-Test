package exceptionthrow;

public class Throw {
	
	public static void test(int age ) {
		
		if( age<18) {
		throw new ArithmeticException("Not eligible ");//
		}else System.out.println("eligible for vote");
		
		
	}

	public static void main(String[] args) {
		Throw.test(16);
	}

}