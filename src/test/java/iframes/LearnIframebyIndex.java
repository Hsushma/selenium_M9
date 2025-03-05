package iframes;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LearnIframebyIndex
{
	@Test
	public static void iframebyIndex() throws IOException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.dream11.com/");
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//input[@id='regEmail']")).sendKeys("123456");
		driver.findElement(By.xpath("//a[@id='regUser']")).click();
		driver.manage().window().minimize();
		driver.quit();
	}

}
