package robotClass;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureEntireScreen {
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://demo.opencart.com/");
		
		driver.findElement(By.name("search")).sendKeys("MacBook");
		
		try {
			Robot r=new Robot();
			
			//Getting the size of the screen i.e dimensions
			Dimension d=Toolkit.getDefaultToolkit().getScreenSize();
			
			//Now this rectangle constructor will get the size from Dimension reference
			Rectangle rect=new Rectangle(d);
			
			BufferedImage fullScreen=r.createScreenCapture(rect);
			
			ImageIO.write(fullScreen, "png", new File("./Screenshots/fullScreenCapture.png"));
			
		} catch (AWTException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
