package testng;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class ClassToListen {

	@Test
	public void openBlogA() {
		int a = 1;
	    int b = 6; 
	    int c = 5;
		//System.out.println("Method OpenA is running");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://omayo.blogspot.com/");

		if (a == 1) {
			Assert.assertTrue(b > c);
		} else if (a==2) {
			Assert.assertTrue(b > c);
		} else if (a ==3) {
			throw new SkipException("Test skipped");
		}
		driver.quit();
	}
	
	@Test
	public void openBlogB() {
		int a = 1;
	    int b = 4; 
	    int c = 5;
		//System.out.println("Method OpenA is running");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://omayo.blogspot.com/");

		if (a == 1) {
			Assert.assertTrue(b > c);
		} else if (a==2) {
			Assert.assertTrue(b > c);
		} else if (a ==3) {
			throw new SkipException("Test skipped");
		}
		driver.quit();
	}
	
	@Test
	public void openBlogC() {
		int a = 3;
	    int b = 6; 
	    int c = 5;
		//System.out.println("Method OpenA is running");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://omayo.blogspot.com/");

		if (a == 1) {
			Assert.assertTrue(b > c);
		} else if (a==2) {
			Assert.assertTrue(b > c);
		} else if (a ==3) {
			throw new SkipException("Test skipped");
		}
		driver.quit();
	}

}
