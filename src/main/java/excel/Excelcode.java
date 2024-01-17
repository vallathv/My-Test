package excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class Excelcode {
	
	//static variable
	public static FileInputStream f; 
	public static XSSFWorkbook w;
	public static  XSSFSheet s;
	
	
	//static method 
	public static String readstringdata( int i , int j ) throws IOException
	{
		
		f= new FileInputStream("C:\\Users\\USER\\Desktop\\Data.xlsx");		
		w= new XSSFWorkbook(f);
		s= w.getSheet("Sheet1");//get sheet method
		
		XSSFRow r=s.getRow(i);
		XSSFCell c=r.getCell(j);
		return c.getStringCellValue();// to fetch the string value in cell
		
	}
	

	public static double readintdata( int i , int j ) throws IOException
	{
		f= new FileInputStream("C:\\Users\\USER\\Desktop\\Data.xlsx");		
		w= new XSSFWorkbook(f);
		s= w.getSheet("Sheet1");//get sheet method
		
		XSSFRow r=s.getRow(i);
		XSSFCell c=r.getCell(j);
		return c.getNumericCellValue();
		
		
	}
	
   
	

}
