package assignment;

public class Class3TotalSalary extends HraClass2 {
	
	public void salaryslip() {	
	int totsal=	basicpay+H-p-deduction+bonuses;
		System.out.println("Total Salary: "+  totsal);
		super.Basicpay();
		super.hra();
		//System.out.println("Total salary by hand : " + t);
	}

	public static void main(String[] args) {
		Class3TotalSalary obj1=new Class3TotalSalary();
		obj1.salaryslip();
		
		
		
		
	}

}
