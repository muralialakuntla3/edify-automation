package POM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class createLead {
	WebDriver driver;
	WebDriverWait mywait;
	
	@FindBy(id="email")
	private WebElement emailfield;
	@FindBy(name="password")
	private WebElement passwordfield;
	@FindBy(xpath="//button[text()='Login']")
	private WebElement Login;
	@FindBy(xpath="//span[text()='Leads']")
	private WebElement LeadTab;
	@FindBy(xpath="//button[text()='Create Lead']")
	private WebElement createLeadButton;
	@FindBy(name="name")
	private WebElement nameField;
	@FindBy(name="email")
	private WebElement emailField;
	@FindBy(name="phone")
	private WebElement phoneField;
	@FindBy(xpath="//button[text()='Create']")
	private WebElement CreateButton;
	@FindBy(xpath="//span[text()='srinivas']")
	private WebElement editLeadButton;
	
	
	public createLead(WebDriver driver) {
		this.mywait=new  WebDriverWait(driver,Duration.ofSeconds(20));
		PageFactory.initElements(driver,this);
	}
	
	
	public void enteremail(String email) {
		// TODO Auto-generated method stub
		emailField.sendKeys(email);	
	}

	public void enterpassword(String password) {
		// TODO Auto-generated method stub
		passwordfield.sendKeys(password);
	}

	public void clickLogin() {
		// TODO Auto-generated method stub
		Login.click();
	}


	public void clickleadsTab() {
		// TODO Auto-generated method stub
	  WebElement lead=   mywait.until(ExpectedConditions.elementToBeClickable(LeadTab));
	  lead.click();
		
	}

	public void clickcreatelead() {
		// TODO Auto-generated method stub
		WebElement createlead=mywait.until(ExpectedConditions.elementToBeClickable(createLeadButton));
		createlead.click();
	}

	public void enterLeadDetails(String name, String email, String phone) {
		// TODO Auto-generated method stub
		nameField.sendKeys(name);
		emailField.sendKeys(email);
		phoneField.sendKeys(phone);
	}

	public void clickcreateLeadButton() {
		// TODO Auto-generated method stub
		CreateButton.click();	
	}

}
