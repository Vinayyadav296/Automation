package miscelleneous;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGDemoG {
	@Parameters({"URL"})
	@Test
	public void openBlogA(String url) {
		System.out.println("Method OpenA is running");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.quit();
	}
	
//	@Parameters({"URL"})
//	@Test
//	public void openBlogB(String url) {
//		System.out.println("Method OpenB is running");
//		WebDriver driver=new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get(url);
//		driver.quit();
//	}
//	
//	@Parameters({"URL"})
//	@Test
//	public void openBlogC(String url) {
//		System.out.println("Method OpenC is running");
//		WebDriver driver=new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get(url);
//		driver.quit();
//	}
	
	@Test
	public void openBlog() {
		System.out.println("Running paramerter in the class DEMOG");
	}

}
