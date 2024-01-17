package excel;

import java.io.IOException;

public class ExcelMain {

	public static void main(String[] args) throws IOException {
		
		String  s =Excelcode.readstringdata(1,0);
		System.out.println(s);
		
		double n= Excelcode.readintdata(1,1);
		System.out.println(n);
		
		
	}

}




