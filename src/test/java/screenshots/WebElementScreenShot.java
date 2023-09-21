package screenshots;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementScreenShot {
	
	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://omayo.blogspot.com/");
		
		WebElement mutltiBox=driver.findElement(By.id("multiselect1"));
		
		//In order to take screen shot of the specific web element we have to pass the
		//reference of web element instead of ((TakesScreenShot)driver)
		
		File srcFile=mutltiBox.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(srcFile, new File("./ScreenshotsFolder/mutltiSeBox.png"));
		
		driver.quit();
		
	}

}
