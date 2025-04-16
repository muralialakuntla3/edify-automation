package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {

	@FindBy(id="email")
	private WebElement emailField;
	@FindBy(name="password")
	private WebElement passwordField;
	@FindBy(xpath="//button[text()='Login']")
	private WebElement loginButton;
	
	public Login(WebDriver driver) {
		PageFactory.initElements(driver,this);
		}
	

	public void enterEmail(String email) {
		emailField.sendKeys(email);
		
	}

	public void enterPassword(String password) {
		passwordField.sendKeys(password);
		
	}

	public void clickLogin() {
		loginButton.click();
		
		
	}
}
