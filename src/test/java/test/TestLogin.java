package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import pageObjectModel.LoginPage;
import pageObjectModel.MyAccountPage;

public class TestLogin {
	
	WebDriver driver;
	
	@Test
	public void login() {
		 driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		
		LoginPage lp=new LoginPage(driver);
		lp.getEmail().sendKeys("Vinaysingh@gmail.com");
		lp.getPassword().sendKeys("Vinay@321");
		lp.getLoginButton().click();
		
		MyAccountPage ap=new MyAccountPage(driver);
		
		ap.getmyAccount().isDisplayed();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
