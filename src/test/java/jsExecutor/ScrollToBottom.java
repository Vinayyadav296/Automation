package jsExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollToBottom {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://omayo.blogspot.com/");
		
		 JavascriptExecutor js = (JavascriptExecutor)driver;
			
		 js.executeScript("window.scrollTo(0,document.body.scrollHeight)");

	}

}
