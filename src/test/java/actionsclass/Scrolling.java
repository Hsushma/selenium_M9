package actionsclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Scrolling 
{
	@Test
	public static void Scrollele()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.abhibus.com/");
		
		WebElement booking = driver.findElement(By.xpath("//h2[text()='Online Bus Booking Services']"));
		Actions act = new Actions(driver);
		//act.scrollToElement(booking);
		act.scrollByAmount(0, 500).perform(); 
		act.pause(2000).scrollByAmount(0, 1000).perform();
		driver.manage().window().minimize();
		driver.quit();
	}
}
