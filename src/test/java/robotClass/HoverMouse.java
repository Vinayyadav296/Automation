package robotClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HoverMouse {
	
	public static void main(String[] args) throws AWTException {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		
		driver.get("https://omayo.blogspot.com/");
		
		Robot r=new Robot();
		
		r.mouseMove(230, 300);
		
//		r.mouseMove(230, 365);
//		left clicking on the mouse
//		r.mousePress(InputEvent.BUTTON1_DOWN_MASK);
//		r.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		
		//right cliking on the mouse
		
		r.mousePress(InputEvent.BUTTON3_DOWN_MASK);
		r.mouseRelease(InputEvent.BUTTON3_DOWN_MASK);
		
		r.delay(2000);
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		r.delay(2000);
		
		r.keyPress(KeyEvent.VK_ENTER);
	}

}
