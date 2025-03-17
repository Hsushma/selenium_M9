package actionsclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Mousehover 
{
	@Test
	public static void demo()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.flipkart.com/");
		
		WebElement electronic = driver.findElement(By.xpath("//span[text()='Electronics']"));
		Actions act = new Actions(driver);
		act.moveToElement(electronic).perform();
		
		WebElement gamming = driver.findElement(By.linkText("Gaming"));
		act.moveToElement(gamming).perform();
		//act.moveByOffset(487, 410);
		//driver.manage().window().minimize();
		//driver.quit();
	}

}
