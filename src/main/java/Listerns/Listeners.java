package Listerns;

import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listeners implements ITestListener ,ISuiteListener  {

	@Override
	public void onStart(ISuite suite) {
		Reporter.log("Suite exection started-comgigure reeport",true);
		
	}

	@Override
	public void onFinish(ISuite suite) {
		Reporter.log("Suite exection ended-report backup",true);
		
	}

	@Override
	public void onTestStart(ITestResult result) {
		Reporter.log("Test method execution started",true);
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		Reporter.log("Test success",true);
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		Reporter.log("Test fail -ss",true);
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		Reporter.log("Test skipped",true);
		
	}
	
	
	
	

}
