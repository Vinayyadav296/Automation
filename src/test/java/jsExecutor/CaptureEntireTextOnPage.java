package jsExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureEntireTextOnPage {
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://demo.opencart.com/");
		
		JavascriptExecutor js = ((JavascriptExecutor) driver);

		String entireText=js.executeScript("return document.documentElement.innerText").toString();
		
		System.out.println(entireText);

	}

}
