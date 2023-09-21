package dropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HtmlDropdowns {
	
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		
//		 WebElement dropdown = driver.findElement(By.id("drop1"));
//		 
//		 Select s=new Select(dropdown);
//		      //s.selectByIndex(2);
//		      //s.selectByValue("ghi");
//		        s.selectByVisibleText("doc 4");
		        
		        
		 WebElement dropdown = driver.findElement(By.id("multiselect1"));
		 
		 Select select=new Select(dropdown);
		 select.selectByIndex(0);
		 select.selectByIndex(1);
		 select.selectByIndex(2);
		 
		 System.out.println(select.isMultiple());
		      
		
	}

}
