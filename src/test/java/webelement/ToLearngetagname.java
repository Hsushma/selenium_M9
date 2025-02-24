package webelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ToLearngetagname 
{
	@Test
	public void testlocation()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demowebshop.tricentis.com/login");
	    String values = driver.findElement(By.xpath("//input[@id='newsletter-subscribe-button']")).getTagName();
		System.out.println(values);
		driver.manage().window().minimize();
		driver.quit();
	}

}
