package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginToSite {

	public static void main(String[] args) throws SQLException {
		
		//Connecting to mysql database
				Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/qafox","root", "Vinay@7678");
					
				
				Statement statement=connection.createStatement();
				ResultSet resultSet=statement.executeQuery("select * from loginCredentials;");
				
				WebDriver driver = new ChromeDriver();

				driver.manage().window().maximize();

				driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");

				
				while(resultSet.next()) {
					
					driver.findElement(By.id("input-email")).sendKeys(resultSet.getString("email"));

					driver.findElement(By.id("input-password")).sendKeys(resultSet.getString("password"));

			
					
				}

	

	
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();

	}

}
