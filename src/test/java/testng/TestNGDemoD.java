package testng;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGDemoD {
	
	@BeforeTest
	public void beforeTestMethod(){
		System.out.println("@BeforeTest method will be executed before the @BeforeClass and @TestMethod");
	}
	@Test
	public void demoD() {
		System.out.println("Class D method is executed");
	}
	
	@Test(groups= {"smoke"})
	public void smokeMethodA() {
		System.out.println("running the smokeMethodA()");
	}
	
	
}
