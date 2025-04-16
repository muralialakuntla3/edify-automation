import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class firstTestscript {

	public static void main(String[] args) {
		
		WebDriver driver =new ChromeDriver();
		driver.get("https://dev.crm.digitaledify.ai/");
		System.out.println("Page title"+ driver.getTitle());
		
	}
}
