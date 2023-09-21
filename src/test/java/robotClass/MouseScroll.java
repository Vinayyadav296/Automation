package robotClass;

import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MouseScroll {
   
	public static void main(String[] args) throws AWTException {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		
		driver.get("https://omayo.blogspot.com/");
		
		Robot r=new Robot();
		
		//scrolling down
		r.mouseWheel(15);
		
		//delay is just like Thread.sleep()
		r.delay(2000);
		
		//scrolling up
		r.mouseWheel(-8);
	}
}
