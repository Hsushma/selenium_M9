package webelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ToLearngetsize 
{
	@Test
	public void tolearngetattribute()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demowebshop.tricentis.com/login");
		Dimension size = driver.findElement(By.xpath("//input[@id='newsletter-subscribe-button']")).getSize();
		System.out.println(size);
		driver.manage().window().minimize();
		driver.quit();
	}

}
