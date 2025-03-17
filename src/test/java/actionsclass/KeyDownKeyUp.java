package actionsclass;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class KeyDownKeyUp 
{
	@Test
	public static void keydownkeyup() 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demowebshop.tricentis.com/login");
		Actions act =new Actions(driver);
		
		driver.findElement(By.linkText("Register")).click();
		WebElement firstName = driver.findElement(By.xpath("//input[@id='FirstName']"));
		WebElement password = driver.findElement(By.xpath("//input[@id='Password']"));
		
		act.sendKeys(firstName,"sushma");
		act.keyDown(Keys.CONTROL).keyDown("a").keyUp(Keys.CONTROL).keyUp("a").perform();
		
		act.click(password).perform();
		act.keyDown(Keys.CONTROL).keyDown("v").keyUp(Keys.CONTROL).keyUp("v").perform();
	
		driver.manage().window().minimize();
		driver.quit();
	}
}
