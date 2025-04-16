package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Listeners.createlead;

public class createLeadData {
	@Test
	public void createdata(){
		WebDriver driver = new ChromeDriver();
		driver.get("https://dev.crm.digitaledify.ai/");
		 driver.manage().window().maximize();
	     
		 createLead loginPage= new createLead(driver);
		 loginPage.enteremail("admin@yopmail.com");
		 loginPage.enterpassword("123456");
		 loginPage.clickLogin();
		 createLead create= new createLead(driver);
		 create.clickleadsTab();
		 create.clickcreatelead();
		 create.enterLeadDetails("srinivas","srinivas@gmail.com","8019684875");
		 create.clickcreateLeadButton();
		 
		 
	}
}
