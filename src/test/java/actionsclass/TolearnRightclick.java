package actionsclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TolearnRightclick
{
	@Test
	public static void rightclick()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demowebshop.tricentis.com/login");
		WebElement registor=driver.findElement(By.linkText("Register"));
		Actions act = new Actions(driver);
		//act.contextClick().perform();
		act.contextClick(registor).perform();
		driver.manage().window().minimize();
		driver.quit();
	}
	
}
