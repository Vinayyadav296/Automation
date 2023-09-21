package screenshots;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TakingScreenShot {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://omayo.blogspot.com/");

		File srcFile1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		// This will throw exception which we can handle either by try catch or by
		// throws
		// We are copying the screen shot inside a folder which will be created
		// automatically by the given code

		// Another way of passing the destination file is

//		File destinationFile=new File("./Screenshots/omayo.png");
//		FileUtils.copyFile(srcFile, destinationFile);

		// FileUtils is not a predefined class of seleneium it belongs to
		// apache.common.io
		// Later selenium introduced its predefined class to copy the screenshot
		// captured

		// we mainly use this one
		// FileUtils.copyFile(srcFile1, new File("./ScreenshotsFolder/omayo.png"));

		FileHandler.copy(srcFile1, new File("./ScreenshotsFolder/omayo.png"));

		driver.findElement(By.linkText("jqueryui")).click();
		// Wherever we want to take screen shot we require these two lines
		File srcFile2 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		// FileUtils.copyFile(srcFile2, new File("./ScreenshotsFolder/RedirectLink.png"));

		// When we use FileHandler instead of file utils we will get exception of
		// java.io.FileNotFoundException
		// Because FileUtils automatically create the folder but in case of FileHandler
		// we have to manually create the folder

		FileHandler.copy(srcFile2, new File("./ScreenshotsFolder/RedirectLink.png"));

		driver.quit();
	}

}
