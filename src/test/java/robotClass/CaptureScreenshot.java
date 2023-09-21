package robotClass;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureScreenshot {
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://demo.opencart.com/");
		
		driver.findElement(By.name("search")).sendKeys("MacBook");
		
		//This program will get the screenshot of the visible area of the screen
		
		try {
			Robot r=new Robot();
			
			//This creates a rectangular dimension area of which screenshot is to be taken
			Rectangle rectangle=new Rectangle(0,0,1000,500);
					
			//This takes the rectagle coordinates as parameter to capture the ss
           BufferedImage img=r.createScreenCapture(rectangle);
           
		   ImageIO.write(img, "png", new File("./Screenshots/robot.png"));
		} catch (AWTException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
