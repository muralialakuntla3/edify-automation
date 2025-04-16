package TestNg;
import org.testng.annotations.Test;

public class FirstTestcase {
//Testcase
	//1)Open application 
	//2)Login
	//3)Logout
	
	
	@Test(priority=3)
	void openapp() {
		System.out.println("Opening application");
		
		
	}
	@Test(priority=2)
	void Login() {
		System.out.print("Login application");
		
	}
	@Test(priority=1)
	void logout() {
		System.out.println("Logout application");
	}
	
}
