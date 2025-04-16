package TestNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider {
	
	WebDriver driver;
	@DataProvider(name="loginData")
	public Object[][]provideData()
	{
		return new Object[][]{
			{"admin@yopmail.com","123456"},
			{"user@gmail.com","123456"},
			{"admin@gmail.com","admin"}
		};
	}
	
	@Test(priority=1)
	public void openURL() {
		driver = new ChromeDriver();
		driver.get("https://dev.crm.digitaledify.ai/");
		
	}
	@Test(priority=2,dataProvider="loginData")
	public void logincredentials(String email,String password) {
		driver.findElement(By.id("email")).sendKeys(email);
		
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.xpath("//button[text()='Login']")).click();	
		}
	

}
