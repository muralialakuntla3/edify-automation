package login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class creds {
	//Testcase
	//open URL
	//enter email and password
	//submit


WebDriver driver = new ChromeDriver();

	
	@BeforeClass
	public void setup() {

WebDriverManager.chromedriver().setup();


	}

	@Test(priority=0)
	public void openURL() {
		driver.get("https://dev.crm.digitaledify.ai/");
		driver.manage().window().maximize();
	}
	@Test(priority=1)
	public void Credentials() {
driver.findElement(By.id("email")).sendKeys("admin@yopmail.com");
driver.findElement(By.name("password")).sendKeys("123456");
		
	}
	@Test(priority=2)
	public void submit() {
		driver.findElement(By.xpath("//button[text()='Login']")).click();
	}
}