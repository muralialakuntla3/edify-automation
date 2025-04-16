package Listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;


public class ExtentReportManager implements ITestListener{
	
	public ExtentSparkReporter sparkReporter;
	public ExtentReports extent;
	public ExtentTest test;
	
	@Override
 public void onStart(ITestContext context) {
		String reportPath = System.getProperty("user.dir") + "/reports/test.html";
		sparkReporter = new ExtentSparkReporter(reportPath);
		
		sparkReporter.config().setDocumentTitle("Autoamtion report");
		sparkReporter.config().setReportName("Login");
		sparkReporter.config().setTheme(Theme.DARK);
		
		
		extent = new ExtentReports();
		extent.attachReporter(sparkReporter);
		
		extent.setSystemInfo("Computer Name","Localhost");
		extent.setSystemInfo("Environment","QA");
		extent.setSystemInfo("OS","Windows 11");
		extent.setSystemInfo("Browser Name","CHROME");
		
		
		
	}
	
	public void onTestSuccess(ITestResult result) {
		test=extent.createTest(result.getName());
		test.log(Status.PASS,"Test is passed" + result.getName());
	}
	
	public void onTestFailure(ITestResult result) {
		test =extent.createTest(result.getName());
		test.log(Status.FAIL,"Test case failed" + result.getName());
		test.log(Status.FAIL,"Test cases failed and cause is" +result.getThrowable());
	}
	public void onFinsih(ITestContext context) {
		extent.flush();
	}
}
