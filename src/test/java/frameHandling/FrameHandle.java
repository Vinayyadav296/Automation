package frameHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandle {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://docs.oracle.com/javase/8/docs/api/");

		// switching to the frame using the name attribute of the frame
		driver.switchTo().frame("classFrame");

		driver.findElement(By.linkText("Description")).click();

	}

}
