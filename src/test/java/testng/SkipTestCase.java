package testng;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class SkipTestCase {
	
	@Test
	public void skipTestCase() {
		
		int age=5;
		
		if(age<18) {
			throw new SkipException("Age can not be less than 18");
		}
	}

}
