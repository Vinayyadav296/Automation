package staleReferenceException;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleElement {
	
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		List<WebElement> list = driver.findElements(By.xpath("//div[@id='LinkList1']//a"));
		
		
		//Using this for loop for iterating over the links will give staleReferenceException because once we navigate to other page
		//the links stored in the list got detached so instead of for each loop we will use for loop and handle the link dynamically
//		for(WebElement e: list) {
//			e.click();
//			driver.navigate().back();
//		}
		
		String path="(//div[@id='LinkList1']//a)";
		
		int linkSize=list.size();
		
		for(int i=1;i<=linkSize;i++) {
			String elementPath=path+"["+i+"]";
			driver.findElement(By.xpath(elementPath)).click();
			driver.navigate().back();
		}
		
		driver.quit();
	}

}
