package excel;

import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

public class ExcelreadClass2 {

	public static void main(String[] args) throws IOException {
	String  s =Excelcode.readstringdata(1,0);
		
		
		
	
		
		
	       
	System.out.println(s);
	
		
		double n= Excelcode.readintdata(1,1);
		System.out.println(n);
	}}

	
