package testng;

import org.testng.annotations.Test;

public class DependsOnMethodsAttribute {
	
	
	@Test
	public void flipkart() {
		System.out.println("Flipkart has a great service");
	}
   
	//suppose if we donot want to run a test method then we can use enable="false"
//	@Test(enabled = false)
	
	@Test(timeOut = 4000)  //if the test case not executed within the specified time i.e timeOut=time the it will give error or exception
	public void snapdeal() throws InterruptedException {
		System.out.println("snapdeal has a great service");
		///Thread.sleep(5000);
		System.out.println("Running after the timeOut time ");
	}
	
	@Test(dependsOnMethods ={"flipkart","myntra"} )
	public void amazon() {
		System.out.println("Amzon has a great service");
	}
    
	@Test
	public void myntra() {
		System.out.println("Myntra has a great service");
	}


}
