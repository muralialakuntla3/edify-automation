package Listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class customListeners implements ITestListener {
	
	@Override
	public void onStart(ITestContext context) {
		System.out.println("Test Suit has started:" + context.getName());
	}
	@Override
	public  void onFinish(ITestContext context) {
		System.out.println("Test Suite Has finished:" +context.getName());
		
	}
	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Test started:" +result.getName());
	}
	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test Passed:" + result.getName());
	}
}
