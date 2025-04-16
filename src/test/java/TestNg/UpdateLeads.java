package TestNg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class UpdateLeads {
	WebDriver driver;
	WebDriverWait mywait;
	
	@BeforeTest
	public void setup() {
		driver =new ChromeDriver();
		mywait = new WebDriverWait(driver,Duration.ofSeconds(20));
		
		driver.manage().window().maximize();
		driver.get("https://dev.crm.digitaledify.ai/");
		
		driver.findElement(By.id("email")).sendKeys("admin@yopmail.com");
		driver.findElement(By.name("password")).sendKeys("123456");
		driver.findElement(By.xpath("//button[text()='Login']")).click();
	}
		@Test
		public void updateleads() {
			Actions actions =new Actions(driver);
			
			WebElement LeadsElement =mywait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Leads']")));
			LeadsElement.click();
			
			mywait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='yasasri']"))).click();
			
			WebElement Leadstatus=driver.findElement(By.name("leadStatus"));
			actions.doubleClick(Leadstatus).perform();
			Select select=new Select(Leadstatus);
			select.selectByVisibleText("Attempted");	
			
			WebElement counselledby = driver.findElement(By.name("counselledBy"));
			actions.doubleClick(counselledby).perform();
			Select select1= new Select(counselledby);
			select1.selectByVisibleText("Admin");
			
			driver.findElement(By.xpath("//button[text()='Save']")).click();
			
			
		}
	
}



