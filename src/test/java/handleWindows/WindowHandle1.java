package handleWindows;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle1 {
	
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
		String homeWindowId=driver.getWindowHandle();
		
		//First Approach in this we first find the id of the home window before clicking on the pop up
		
//		WebElement popUpLink=driver.findElement(By.linkText("Open a popup window"));
//		popUpLink.click();
//		
//		Set<String> allWinowId=driver.getWindowHandles();
//		
//		for(String i:allWinowId) {
//			if(!i.equals(homeWindowId))
//				driver.switchTo().window(i);
//			String childText=driver.findElement(By.tagName("h2")).getText();
//			System.out.println(childText);
//			driver.switchTo().window(homeWindowId);
//			driver.close();
//			break;
//		}
//		
		
		WebElement popUpLink=driver.findElement(By.linkText("Open a popup window"));
		popUpLink.click();
		
		Set<String>allWindow=driver.getWindowHandles();
		
		Iterator<String> itr=allWindow.iterator();
		String parentWindow=itr.next();
		String childWindow=itr.next();
		
		driver.switchTo().window(childWindow);
		
		String childText=driver.findElement(By.tagName("h2")).getText();
		System.out.println(childText);
		driver.close();
		
		driver.switchTo().window(parentWindow);
		driver.close();
		
		
	}

}
