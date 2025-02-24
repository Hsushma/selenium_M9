package assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Sendkeys 
{
	@Test
	public static void sendkeysmethod()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demo.vtiger.com/vtigercrm/");
		
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		WebElement usernametxt = driver.findElement(By.xpath("//input[@id='username']"));
		usernametxt.clear();
		usernametxt.sendKeys("selenium");
		
		WebElement passwordtxt = driver.findElement(By.id("(password"));
		passwordtxt.clear();
		passwordtxt.sendKeys("test@1234");
		
	}
}
