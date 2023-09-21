package testng;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class TestNGDemoF {
	
	@Test
	public void demoF() {
		System.out.println("Class F method is executed");
	}
	
	@AfterTest
	public void afterTestMethod(){
		System.out.println("@After Test Method is executed after the completion of Entire <Test></Test> execution in testng.xml file");
	}

}
