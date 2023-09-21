package miscelleneous;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGDemoA {
	
	@Test
	public void demoA() {
		System.out.println("Class A method is executed");
	}
   
	@Test(groups= {"smoke"})
	public void smokeMethodB() {
		System.out.println("running the smokeMethodB()");
	}
	
	@Parameters({"URL"})
	@Test
	public void openBlogD(String url) {
		System.out.println("Method OpenC is running");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.quit();
	}
}
