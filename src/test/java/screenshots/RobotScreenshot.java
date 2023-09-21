package screenshots;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RobotScreenshot {
	
	public static void main(String[] args) throws AWTException, IOException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://omayo.blogspot.com/");
		
		driver.findElement(By.id("alert1")).click();
		
		Robot robot=new Robot();
		Dimension d=Toolkit.getDefaultToolkit().getScreenSize();
		Rectangle r=new Rectangle(d);
		BufferedImage bufferedImage=robot.createScreenCapture(r);
		String destinationPath=System.getProperty("user.dir")+"//ScreenshotsFolder//fullScreenImamge.png";
		ImageIO.write(bufferedImage, "png", new File(destinationPath));
		
		Alert a=driver.switchTo().alert();
		
		a.accept();
		
		driver.close();
		
		
		
	}
	

}
