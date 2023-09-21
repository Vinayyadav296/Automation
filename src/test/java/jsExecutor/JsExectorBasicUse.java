package jsExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JsExectorBasicUse {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");

		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		//Script to show alert
		//js.executeScript("alert('my name is Vinay')");
		
		//Script to show prompt box
		//js.executeScript("prompt('What is your name?')");
		
		//Script to show prompt box
		//js.executeScript("confirm('Do you want to proceed ?')");
		
		//clicking by using js excutor
		 
		WebElement alerA = driver.findElement(By.id("alert1"));
		
		//This alerA is an arugument in the executeScript() function it can have multiple arguments that why we have to specify the index position
		//of the argument to be clicked however in this case there is only one argument and it is present on the first index so [0] is provided
		js.executeScript("arguments[0].click();", alerA);
		
		
	}

}
