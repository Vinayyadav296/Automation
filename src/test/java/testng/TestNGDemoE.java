package testng;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestNGDemoE {
	
	@Test
	public void demoE() {
		System.out.println("Class E method is executed");
	}
	
	@BeforeSuite
	public void beforeSuiteMethod() {
		System.out.println("@BeforeSuit method will be executed before the <test></test> method excutions");
	}

	@AfterSuite
	public void afterSuiteMethod() {
		System.out.println("@AflterSuit method will be executed after the <test></test> method excutions");
	}
}
