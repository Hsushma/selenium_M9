package webelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ToLearnisEnabled 
{
	@Test
	public static void demo()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.instagram.com/accounts/login/?hl=en");
		
		WebElement loginbtn = driver.findElement(By.xpath("//button[@type='submit']"));
		System.out.println(loginbtn.isEnabled());
		
		driver.findElement(By.name("username")).sendKeys("sushma",Keys.ENTER);
		driver.findElement(By.name("password")).sendKeys("sushma");
		
		System.out.println(loginbtn.isEnabled());
		
		driver.manage().window().minimize();
		driver.quit();
	}

}
