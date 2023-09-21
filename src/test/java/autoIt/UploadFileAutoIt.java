package autoIt;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class UploadFileAutoIt {
	
	@Test
	public void uploadFile() throws IOException {
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		WebElement chooseFile = driver.findElement(By.cssSelector("input#uploadfile"));
		
		Actions action=new Actions(driver);
		action.moveToElement(chooseFile).click().build().perform();

	   Runtime.getRuntime().exec("C:\\Users\\dell\\eclipse-workspace\\QaFoxSelenium\\src\\test\\java\\autoItExecutablesFiles\\ExcelData.exe");
	}

}
