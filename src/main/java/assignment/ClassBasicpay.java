package assignment;

public class ClassBasicpay {
	
	int basicpay =1000;
	int deduction=100;
	int bonuses =500;
	
	public void Basicpay() {
		System.out.println("Basicpay: " +basicpay);
		System.out.println("Deduction: " +deduction);
		System.out.println("Bonuses : " + bonuses);
	} 
	
	

	public static void main(String[] args) {
		ClassBasicpay obj =new ClassBasicpay();
		obj.Basicpay();

	}

}
