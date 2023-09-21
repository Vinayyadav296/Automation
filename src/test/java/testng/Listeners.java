package testng;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener {

	public void onTestStart(ITestResult result) {
		//System.out.println("Test Execution started");
		 System.out.println("Listened to code and found that the Test started " + result.getName());

	}
	
	public void onFinish(ITestContext context) {
		System.out.println("Test execution ended");
	}

	public void onTestSuccess(ITestResult result) {

		//System.out.println("Test Exection Succesfull");
		 System.out.println("Listened to code and found that it is successfully executed " + result.getName());

	}

	public void onTestFailure(ITestResult result) {
		// Take screenshot
		// updating the failure status into the test reports
		// update in logs

		//System.out.println("Listened to code and found that the Test is failed ");
		
		 System.out.println("Listened to code and found that the Test is failed " +
		 result.getName());

	}

	public void onTestSkipped(ITestResult result) {

		//System.out.println("Listened to code and found that the Test is skipped ");

		System.out.println("Listened to code and found that the Test is skipped " + result.getName());

	}
}
