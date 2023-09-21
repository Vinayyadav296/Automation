package frameHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFrameHandling {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://the-internet.herokuapp.com/nested_frames");

		// Switching to the main parent frame

		driver.switchTo().frame("frame-top");

		// Switching to child frame

		driver.switchTo().frame("frame-left");

		String leftFrameText = driver.findElement(By.xpath("//body")).getText();

		System.out.println(leftFrameText);

		// Now if we want to go to any other frame like middle one or right one then we
		// have to first switch to parent frame
		// then from there we can switch to the left or the right frame

		driver.switchTo().parentFrame();
        
		//switching to child frame
		driver.switchTo().frame("frame-right");

		String rightFrameText = driver.findElement(By.xpath("//body")).getText();

		System.out.println(rightFrameText);
		
		//Now bottom frame is also a parent frame like top frame so currently
		//we are in the right frame which is child frame so if we want to go from 
		//top frame to bottom frame then there is two way first we can switch from child
		//frame to parent top-frame and then from top-frame to  page level and from there
		// we can switch to bottom
		
		//If we directly want to go at page level in whatever frame you are present we can use
		// driver.switchTo().defaultContent()  this will take us directly to the page level from there 
		// we can switch to the bottom parent frame		
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame("frame-bottom");
		
		String bottomFrameText = driver.findElement(By.xpath("//body")).getText();

		System.out.println(bottomFrameText);

	}

}
