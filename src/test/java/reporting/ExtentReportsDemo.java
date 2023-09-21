package reporting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportsDemo {
	
	WebDriver driver;
	ExtentReports extent;
	
	@BeforeMethod
	public void configureReport() {
		
		String reportPath=System.getProperty("user.dir")+"\\reports\\index.html";
		
		ExtentSparkReporter reporter = new ExtentSparkReporter(reportPath);
		
		reporter.config().setReportName("democart test results");
		reporter.config().setDocumentTitle("Opencart test reports");
		
		 extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Operating System", "Windows10");
		extent.setSystemInfo("Tested By", "Vinay Yadav");
		
	}
   
	
	@Test
	public void login() {
		
		ExtentTest eTest=extent.createTest("Test One Started");
		

		 driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://tutorialsninja.com/demo/");
		
		eTest.info("Chrome launched and navigated to application");

		driver.findElement(By.xpath("//a[@title='My Account']")).click();

		driver.findElement(By.linkText("Login")).click();

		driver.findElement(By.cssSelector("input#input-email")).sendKeys("vinayyadav@gmail.com");

		driver.findElement(By.cssSelector("input#input-password")).sendKeys("Vinay@321");

		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();

	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
		extent.flush();
	}

}
