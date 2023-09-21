package handleStaticAndDynamicTables;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SecondColumnDataThirdRow {
	
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("http://omayo.blogspot.com/");

		List<WebElement> dataList = driver.findElements(By.xpath("//table[@id='table1']//tr[2]//td[2]"));

		System.out.println(dataList.size());

		for (WebElement heading : dataList) {
			System.out.println(heading.getText());
		}

		driver.quit();
	}
}
