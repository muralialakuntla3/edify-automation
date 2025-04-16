package JavacriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;

public class method1 {
  public static void main(String args[]) {
	  
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://www.digitaledify.ai/");
	  driver.manage().window().maximize();
	  
	  JavascriptExecutor js=(JavascriptExecutor)driver;
	  
	
	  
	  WebElement element =driver.findElement(By.xpath("//div[@class='devtrainedcol']"));
	  
	  js.executeScript("arguments[0].scrollIntoView(true);",element);
	  
	  
	  
	  
  }
}

