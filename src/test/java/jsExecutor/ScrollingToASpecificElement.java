package jsExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingToASpecificElement {
    
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		
		driver.get("https://omayo.blogspot.com/");
		
		WebElement button2 = driver.findElement(By.id("but2"));

//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		
			
//		js.executeScript("arguments[0].scrollIntoView(true)",button2);
		
		scrollTillElement(driver, button2);
		
	}
	
	public static void scrollTillElement(WebDriver driver,WebElement element) {
		
	    JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].scrollIntoView(true)",element);
		
	}
}
