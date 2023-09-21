package robotClass;

import java.awt.AWTException;
import java.awt.event.KeyEvent;
import java.awt.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyPressRelease {
	
	public static void main(String[] args) throws AWTException {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://demo.opencart.com/");
		
		driver.findElement(By.name("search")).sendKeys("HP");
		
		//Creating the object of the predefined robot class of java
		Robot r=new Robot();
		
		//pressing the enter key
		r.keyPress(KeyEvent.VK_ENTER);
		
		//releasing the enter key
		r.keyRelease(KeyEvent.VK_ENTER);
				
	}

}
