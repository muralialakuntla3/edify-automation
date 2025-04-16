package excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class readexcel {
	public static void main(String args[]) throws IOException {
		
		FileInputStream file = new FileInputStream("C:\\Users\\mayno\\eclipse-workspace\\Seleniumproject\\test data\\Testfile.xlsx");
				
		XSSFWorkbook workbook= new XSSFWorkbook(file);
		
		XSSFSheet sheet = workbook.getSheet("testData");
//		
//		XSSFRow row = sheet.getRow(0);
//		XSSFCell cell =row.getCell(0);
//		System.out.println(cell.getStringCellValue());
//		
		
		
		int totalRows = sheet.getLastRowNum();
		int totalCells = sheet.getRow(1).getLastCellNum();
		
		System.out.println("Number of rows:"+ totalRows);
		System.out.println("number of cells:"+totalCells);
	}

}
