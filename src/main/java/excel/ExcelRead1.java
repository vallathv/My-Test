package excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead1 {
	
	
	public static FileInputStream f; 
	public static XSSFWorkbook w;
	public static  XSSFSheet s;

	public static void main(String[] args) throws IOException {
		
		f= new FileInputStream("C:\\Users\\USER\\Desktop\\Data.xlsx");	
		w= new XSSFWorkbook(f);
		s=w.getSheet("Sheet1");
		
		Iterator<Row> rowIterator = s.iterator();
		   while (rowIterator.hasNext()) {
			   Row nextRow = rowIterator.next();
			   Iterator<Cell> cellIterator = nextRow.cellIterator();
			   while (cellIterator.hasNext()) {
				     Cell nextCell = cellIterator.next();
	                // int columnIndex = nextCell.getColumnIndex(); // This line will print index of column
	                System.out.println(nextCell);
	            }
			   }
		
	}

}
