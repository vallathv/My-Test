package excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class Excelread {
	
	
	public static FileInputStream f; 
	public static XSSFWorkbook w;
	public static  XSSFSheet s;
	
	

	public static String readstringdata(   int i, int j  ) throws IOException
	{
		f = new FileInputStream("C:\\Users\\USER\\Desktop\\Markdetails.xlsx");
		w =new XSSFWorkbook(f);
		s=w.getSheet("Sheet1");
		XSSFRow r = s.getRow(i);
		XSSFCell c=r.getCell(j);
		return c.getStringCellValue();// to fetch the string value in cell
		
				
	}	
	
		    
		
	public static double readintdata(   int i, int j  ) throws IOException
	{
		f = new FileInputStream("C:\\Users\\USER\\Desktop\\Markdetails.xlsx");
		
		w =new XSSFWorkbook(f);
		s=w.getSheet("Sheet1");
		
		XSSFRow r = s.getRow(i);
		
		XSSFCell c=r.getCell(j);
		return c.getNumericCellValue();// to fetch the string value in cell
		
		
	
	
	
	}
}
