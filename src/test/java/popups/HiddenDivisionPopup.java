package popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class HiddenDivisionPopup
{
	@Test 
	public static void hidendivisionPopup() 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.makemytrip.com/");

		driver.findElement(By.xpath("//span[@class='commonModal__close']")).click();
		driver.findElement(By.xpath("//span[text()='Departure']")).click();
		//also try with for infinate loop for(; ;)
		while(true)//while infinate loop
		{
			try 
			{
				driver.findElement(By.xpath("//div[text()='August 2025']/../..//p[text()='15']")).click();
				break;
			} 
			catch (Exception e) 
			{
				driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
			}
		}
		driver.manage().window().minimize();
		driver.quit();
	}
}
