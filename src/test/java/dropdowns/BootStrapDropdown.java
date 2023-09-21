package dropdowns;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootStrapDropdown {
	
	public static void main(String[] args) {
		  WebDriver driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  
		  driver.get("http://seleniumpractise.blogspot.com/2016/08/bootstrap-dropdown-example-for-selenium.html");
		  
		  WebElement dropDown=driver.findElement(By.cssSelector("button#menu1"));
		  dropDown.click();
		  
		 // driver.findElement(By.linkText("JavaScript")).click();
		   
		  List<WebElement> dropdownList = dropDown.findElements(By.cssSelector("ul.dropdown-menu"));
		  
		  for(WebElement ele:dropdownList) {
			 String dropValue= ele.getText();
			 if(dropValue.equalsIgnoreCase("CSS")) {
				 ele.click();
				 break;
			 }
		  }
		  
	}

}
