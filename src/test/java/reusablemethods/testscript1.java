package reusablemethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class testscript1 {
	
	public static WebDriver launchBrowser(String url) {
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		return driver;
	}
	public static void inputText(WebDriver driver,By locator, String value) {
		WebElement element = driver.findElement(locator);
		element.sendKeys(value);
	}
	public static void clickElement(WebDriver driver,By locator) {
		WebElement element= driver.findElement(locator);
		element.click();
	}
	public  static WebElement waitForElementToBeClickable(WebDriver driver,By locator,int timeoutInSeconds) {
		WebDriverWait mywait = new WebDriverWait(driver,Duration.ofSeconds(timeoutInSeconds));
		return mywait.until(ExpectedConditions.elementToBeClickable(locator));
	}
	
	public static void main(String args[]) {
		WebDriver driver=launchBrowser("https://dev.crm.digitaledify.ai/");
		
		inputText(driver,By.id("email"),"admin@yopmail.com");
		inputText(driver,By.name("password"),"123456");
		clickElement(driver,By.xpath("//button[text()='Login']"));
		
		WebElement leadsTab = waitForElementToBeClickable(driver,By.xpath("//span[text()='Leads']"),20);
		leadsTab.click();
		
		WebElement createButton = waitForElementToBeClickable(driver,By.xpath("//button[text()='Create Lead']"),20);
		createButton.click();
		
		inputText(driver,By.name("name"),"kiran");
		inputText(driver,By.name("phone"),"8019684875");
		inputText(driver,By.name("email"),"kiran@gmail.com");
		
		
		clickElement(driver,By.xpath("//button[text()='Create']"));
	}
	
}
