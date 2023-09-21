package handleStaticAndDynamicTables;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PaginationInDynamicTable {
     
	
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://demo.opencart.com/admin/");

		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("demo");

		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("demo");

		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();

		WebElement modal = driver.findElement(By.xpath("//button[@class='btn-close']"));

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

		wait.until(ExpectedConditions.elementToBeClickable(modal));

		modal.click();

		driver.findElement(By.xpath("//a[contains(text(),'Sales')]")).click();

		driver.findElement(By.xpath("(//a[contains(text(),'Orders')])[1]")).click();

		String labelText = driver.findElement(By.xpath("//div[contains(text(),'Showing')]")).getText();

		int sIdx = labelText.indexOf("(") + 1;

		int eIdx = labelText.indexOf("Pages")-1;

		//System.out.println(sIdx);
		//System.out.println(eIdx);
		
		String pageCountText=labelText.substring(sIdx, eIdx);
		
		//System.out.println(pageCount);
		
		int pageCount=Integer.parseInt(pageCountText);
		
		String customerName="Kalle Karlsson";
		
		for(int p=1;p<=pageCount;p++) {
			
			String xpathText="//form[@id='form-order']//tr//td[cotains(text(),'"+customerName+"')]";
			
			try {
			
			if(driver.findElement(By.xpath(xpathText)).isDisplayed()) {
				
				String finalXpathText=xpathText+"//preceding-sibling::td[3]";
				
				driver.findElement(By.xpath(finalXpathText)).click();
				
				break;
			}
		}catch(Throwable t) {
			
			
		}
			WebElement nextPage=driver.findElement(By.xpath("//ul[@class='pagination']/li[@class='page-item active']/span/following::li[1]//a"));
			
			//wait.until(ExpectedConditions.elementToBeClickable(nextPage));
			
			JavascriptExecutor js=((JavascriptExecutor)driver);
			js.executeScript("arguments[0].click();", nextPage);
			
		}

	}
}
