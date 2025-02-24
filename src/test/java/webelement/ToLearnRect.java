package webelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ToLearnRect 
{
	@Test
	public void testlocation()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demowebshop.tricentis.com/login");
		Rectangle values = driver.findElement(By.xpath("//input[@id='newsletter-subscribe-button']")).getRect();
		System.out.println("x"+values.getX());
		System.out.println("y"+values.getY());
		System.out.println("height"+values.getHeight());
		System.out.println("width"+values.getWidth());
		driver.manage().window().minimize();
		driver.quit();
	}

}
