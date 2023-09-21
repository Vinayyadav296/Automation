package testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDrivenTesting {

	@Test(dataProvider = "getData")
	public void testLogin(String username, String password) {
		System.out.println("Userl Logged in succesfully " + username + " " + password);
	}

	@DataProvider
	public Object[][] getData() {
		Object[][] data = new Object[3][2];
		data[0][0] = "Vinay";
		data[0][1] = "Vinay@321";
		data[1][0] = "Vijay";
		data[1][1] = "Vijay@321";
		data[2][0] = "Vilay";
		data[2][1] = "Vilay@321";

		return data;
	}

}
