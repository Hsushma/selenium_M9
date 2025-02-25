package webelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ToLearnisDisplayed 
{

	@Test
	public void testlocation()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demowebshop.tricentis.com/login");
		boolean status = driver.findElement(By.xpath("//input[@value='Register']")).isDisplayed();
		System.out.println(status);
		driver.manage().window().minimize();
		driver.quit();
	}
}
