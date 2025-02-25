package webdrivermethods;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ToLearngetwindowHandles 
{
	@Test
	public static void sendkeysmethod()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demowebshop.tricentis.com/login");
		driver.findElement(By.linkText("Facebook")).click();
		Set<String> multipleid = driver.getWindowHandles();
		System.out.println(multipleid);
		driver.manage().window().minimize();
		driver.quit();
	}

}
