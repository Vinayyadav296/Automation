package frameHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandleUsingWebElement {
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://blogpendingtasks.blogspot.com/p/switchtoframeusingwebelement.html");

		// switching to the frame using the WebElement 
		
		WebElement iframeElement = driver.findElement(By.xpath("//iframe[@title='arunmotoori']"));
		driver.switchTo().frame(iframeElement);
		
		driver.findElement(By.linkText("Home")).click();


	}

}
