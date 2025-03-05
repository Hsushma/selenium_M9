package iframes;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LearnIframebyElement 
{
	@Test
	public static void iframeelement()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.dream11.com/");
		
		driver.switchTo().frame("//iframe[@title='Iframe Example']");
		driver.findElement(By.xpath("//input[@id='regEmail']")).sendKeys("123456");
		driver.findElement(By.xpath("//a[@id='regUser']")).click();
		driver.manage().window().minimize();
		driver.quit();
	}
	
}
