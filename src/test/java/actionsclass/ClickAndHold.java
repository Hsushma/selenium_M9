package actionsclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ClickAndHold
{
	@Test
	public static void clickandhold() 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://yonobusiness.sbi/login/yonobusinesslogin");
		
		driver.findElement(By.id("password")).sendKeys("sushm@123");
		WebElement icon = driver.findElement(By.xpath("//div[@class='showPassword shownhide']"));
		Actions act = new Actions(driver);
		act.clickAndHold(icon).perform();
		
		driver.manage().window().minimize();
		driver.quit();
		

		
	}
}
