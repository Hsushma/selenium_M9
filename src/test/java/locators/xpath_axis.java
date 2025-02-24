package locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class xpath_axis 
{
	@Test
	public static void demo()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("file:///E:/movie.html");
		
		String movie="Chaava";//attached the variable to the xpath;
		
		String collection = driver.findElement(By.xpath("//td[text()='"+movie+"']/following-sibling::td[1]")).getText();
		System.out.println(collection);
		
		String position = driver.findElement(By.xpath("//td[text()='"+movie+"']/preceding-sibling::td")).getText();
		System.out.println(position);
		
		driver.manage().window().minimize();
		driver.quit();
	}

}
