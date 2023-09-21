package miscelleneous;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNGDemoC {
	
	@BeforeClass
	public void beforeClassMethod() {
		System.out.println("@BeforeClass annotation method is running first before all the test methods of the class");
	}
	@Test
	public void demoC() {
		System.out.println("Class C method is executed");
	}
	
	@AfterClass
	public void afterClassMethod() {
		System.out.println("@AfterClass annotation method is running after all the test methods of the class");
	}
	
	@Test
	public void printStatus() {
		System.out.println("Hi i am on notice period");
	}
	
	@Test
	public void printStream() {
		System.out.println("I am an automation tester");
	}
}
