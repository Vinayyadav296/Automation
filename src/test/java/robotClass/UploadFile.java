package robotClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UploadFile {
	
	public static void main(String[] args) throws AWTException {
		
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		
		driver.get("https://the-internet.herokuapp.com/upload");
		
		Robot r=new Robot();
		
		String path=System.getProperty("user.dir")+"\\Screenshots\\robot.png";
		
		StringSelection s=new StringSelection(path);
		
		//Till here we have copied the path like contorol+c
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s, null);
		
		//Now we need to paste that path in the choose file option of the heroku app
		
		WebElement uploadInput = driver.findElement(By.id("file-upload"));
		
//		JavascriptExecutor js=(JavascriptExecutor)driver;		
//		js.executeScript("arguments[0].click()",uploadInput);
		
		Actions action=new Actions(driver);
		
		action.moveToElement(uploadInput).click().build().perform();
		
		r.delay(2000);
		
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		
		r.delay(2000);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
       
		driver.findElement(By.id("file-submit")).click();
		
		
	}

}
