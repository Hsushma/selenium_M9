package assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DoubleClick
{

	@Test
	public static void ClickandHold()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/ui/clickHold?sublist=0");
		
		WebElement circle = driver.findElement(By.xpath("//div[@id='circle']"));
		
		Actions act = new Actions(driver);
		act.clickAndHold(circle).perform();
		
		driver.manage().window().minimize();
		driver.quit();
	}


}
