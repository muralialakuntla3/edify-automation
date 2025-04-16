package excel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class loginExcel {
public static void main(String args[]) throws IOException {
	
	WebDriver driver= new ChromeDriver();
	
String filePath ="C:\\Users\\mayno\\eclipse-workspace\\Seleniumproject\\test data\\login.xlsx";
String SheetName="Sheet1";
Object[][] credentials= ExcelUtil.loadExcel(filePath, SheetName);

for(Object[] credential:credentials) {
	String email = credential[0].toString();
	String password = credential[1].toString();
	
	driver.get("https://dev.crm.digitaledify.ai/");
	driver.findElement(By.id("email")).sendKeys(email);
	driver.findElement(By.name("password")).sendKeys(password);
	driver.findElement(By.xpath("//button[text()='Login']")).click();
	}
}
}
