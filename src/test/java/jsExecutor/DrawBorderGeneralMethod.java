package jsExecutor;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DrawBorderGeneralMethod {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://demo.opencart.com/");

		WebElement cartBtn = driver
				.findElement(By.xpath("//button[@class='btn btn-inverse btn-block dropdown-toggle']"));
		
		drawBorder(driver, cartBtn);
		
		driver.quit();

	}

	public static void drawBorder(WebDriver driver, WebElement element) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);

		// Drawing a border around the button
		js.executeScript("arguments[0].style.border='3px solid Red'", element);

		File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		// Taking the screenshot of that border button
		try {
			FileUtils.copyFile(srcFile, new File("./Screenshots/highlightedGeneralMethod.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// Removing the border
		js.executeScript("arguments[0].style.border=''", element);
	}

}
