package actionsclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TolearnDoubleClick 
{
	@Test
	public static void doubleclick()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/ui/button/buttonDouble?sublist=2");
		
		WebElement yesbtn = driver.findElement(By.xpath("(//button[text()='Yes'])[1]"));
		
		Actions act = new Actions(driver);
		act.doubleClick(yesbtn).perform();
		
		driver.manage().window().minimize();
		driver.quit();
	}

}
