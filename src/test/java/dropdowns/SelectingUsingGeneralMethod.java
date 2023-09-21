package dropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectingUsingGeneralMethod {

	static WebDriver driver;
	
	public static WebElement webElementMethod(By attribute) {
		return driver.findElement(attribute);
	}

	public static void selectDropdown(By field,String methodType,String valueToSelect) {
		Select s=new Select(webElementMethod(field));
		
		switch(methodType) {
		case "visibleText":
			s.selectByVisibleText(valueToSelect);
			break;
			
        case "index":
			s.selectByIndex(Integer.parseInt(valueToSelect));
			break;	
			
        case "value":
			s.selectByValue(valueToSelect);
			break;	
		}
	}

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/dropdowns");

		By fruits = By.id("fruits");

		By superheros = By.id("superheros");

//		selectByVisibleText(webElementMethod(fruits), "Apple");
//
//		selectByVisibleText(webElementMethod(superheros), "Ant-Man");
		
		selectDropdown(fruits, "index", "2");
		selectDropdown(superheros,"visibleText" ,"Ant-Man");
		selectDropdown(superheros, "value", "ta");

	}

	//Instead of creating 3 sepreate methods we created on single method to handle 3 ways of select dropdown
	
//	public static void selectByVisibleText(WebElement attribute, String field) {
//		Select s = new Select(attribute);
//		s.selectByVisibleText(field);
//	}
//
//	public static void selectByIndex(WebElement attribute, int idx) {
//		Select s = new Select(attribute);
//		s.selectByIndex(idx);
//	}
//
//	public static void selectByValue(WebElement attribute, String field) {
//		Select s = new Select(attribute);
//		s.selectByValue(field);
//	}

}
