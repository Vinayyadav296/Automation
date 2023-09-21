package screenshots;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SectionScreenShot {
   
	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		
		WebElement loginSection=driver.findElement(By.id("content"));
		
		File srcFile=loginSection.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile, new File("./ScreenshotsFolder/loginSectionShot.png"));
		
		driver.quit();
	}
}
