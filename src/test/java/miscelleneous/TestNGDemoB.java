package miscelleneous;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGDemoB {

	@BeforeMethod
	public void printBeforeMethod() {
		System.out.println("@BeforeMethod annotation is running first");
	}

	@Test
	public void demoB() {
		System.out.println("Class B method is executed");
	}
	
	@Test
	public void printName() {
		System.out.println("My name is vinay");
	}

	@AfterMethod
	public void printafterMethod() {
		System.out.println("@AfterMethod Annotation is running");
	}

}
