package Parameter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Login {

	@Test
	@Parameters({"Url","email","password"})
	public void credentials(String Url, String email,String password) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get(Url);
		driver.manage().window().maximize();
			
		driver.findElement(By.id("email")).sendKeys(email);
		driver.findElement(By.name("password")).sendKeys(password);
		
		driver.findElement(By.xpath("//button[text()='Login']")).click();
	}
}
