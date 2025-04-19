package createlead;

import java.time.Duration;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class leads {
	WebDriver driver;
	

@BeforeTest
	public void OpenURL() {
	
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://dev.crm.digitaledify.ai/");
}
	@DataProvider(name="leadData") 
	 public Object[][] provideLeadData(){
		
		return new Object[][] {
			{"Kiran","kiran@gmail.com","8019684875"},
			{"maheshwaran","maheshwaran@gmail.com","8019684875"},
		};
		
		}	
	@Test(priority=1)
	public void login() {
		
		driver.findElement(By.id("email")).sendKeys("admin@yopmail.com");
		driver.findElement(By.name("password")).sendKeys("123456");
		driver.findElement(By.xpath("//button[text()='Login']")).click();
	}
	@Test(priority=2,dataProvider="leadData",dependsOnMethods = "login")
	public void createlead(String name,String email,String phone) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		
		//locating lead
		WebElement lead=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Leads']")));
		lead.click();
		
		//create lead
		WebElement CreateLead=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Create Lead']")));
		CreateLead.click();
		
		//Fill form
		driver.findElement(By.name("name")).sendKeys(name);
		driver.findElement(By.name("phone")).sendKeys(phone);
		driver.findElement(By.name("email")).sendKeys(email);
		
		driver.findElement(By.xpath("//button[text()='Create']")).click();
		
		
		
	}
}



