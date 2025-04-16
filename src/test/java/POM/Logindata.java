package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Logindata {
	@Test
	public void LoginTest() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://dev.crm.digitaledify.ai/");
		Login loginPage = new Login(driver);
		loginPage.enterEmail("admin@yopmail.com");
		loginPage.enterPassword("123456");
		loginPage.clickLogin();
		
		
	}

}
