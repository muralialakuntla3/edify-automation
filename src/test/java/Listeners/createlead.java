package Listeners;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(ExtentReportManager.class)
public class createlead {
	
	
	
	@Test
	void credentials() {

		WebDriver driver;
		WebDriverWait mywait;
		driver = new ChromeDriver();
		mywait = new WebDriverWait(driver,Duration.ofSeconds(20));
		driver.get("https://dev.crm.digitaledify.ai/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("email")).sendKeys("admin@yopmail.com");
		driver.findElement(By.name("password")).sendKeys("123456");
			driver.findElement(By.xpath("//button[text()='Login']")).click();
	

		mywait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Leads']"))).click();
		
		WebElement CreateLead=mywait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Create Lead']")));
		CreateLead.click();
		
		driver.findElement(By.name("name")).sendKeys("krishna");
		driver.findElement(By.name("phone")).sendKeys("8019684875");
		driver.findElement(By.name("email")).sendKeys("krishna@gmail.com");
		
		driver.findElement(By.xpath("//button[text()='Create']")).click();
		
		
	}


	}

