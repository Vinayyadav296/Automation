package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import pageFactoryModel.LoginPagePf;
import pageFactoryModel.MyAccountPagePf;

public class TestLoginPf {
    
WebDriver driver;
	
	@Test
	public void login() {
		 driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		
		LoginPagePf lpf=new LoginPagePf(driver);
		lpf.getEmail().sendKeys("Vinaysingh@gmail.com");
		lpf.getPassword().sendKeys("Vinay@321");
		lpf.getLoginButton().click();
		
		MyAccountPagePf apf=new MyAccountPagePf(driver);
		
		apf.getmyAccount().isDisplayed();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
